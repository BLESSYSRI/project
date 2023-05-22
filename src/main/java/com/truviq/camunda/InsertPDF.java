package com.truviq.camunda;

	import java.io.DataInputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class InsertPDF {
	    public static void main(String[] args) throws SQLException {
	        File pdfFile = new File("D:/BASE64.pdf");
	        byte[] pdfData = new byte[(int) pdfFile.length()];
	        try {
	            DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
	            dis.readFully(pdfData);  // read from file into byte[] array
	            dis.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        String myConnectionString = "jdbc:mysql://localhost:3306/mydatabase";
	        Connection dbConnection = DriverManager.getConnection(myConnectionString, "root", "root");
	        PreparedStatement ps = dbConnection.prepareStatement("INSERT INTO mytable (" +
	                "filename, " +
	                "pdf_file" +
	                ") VALUES (?,?)");
	        ps.setString(1, "base64");
	        ps.setBytes(2, pdfData);  // byte[] array
	        ps.executeUpdate();
	    }
	}

