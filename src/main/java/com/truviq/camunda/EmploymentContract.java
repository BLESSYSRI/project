package com.truviq.camunda;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.pd4ml.PD4ML;

public class EmploymentContract implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
        PD4ML pd4ml = new PD4ML();
    	
       /* String[] myProperties = new String[] {"A","B"};
    	Map<String, Object> myVariables=new HashMap<>();
    	myVariables.put("var1", "System1");
    	myVariables.put("var2", "System1");
    	myVariables.put("var3", "System1");
    	myVariables.put("var4", "System1");
    	myVariables.put("var5", "System1");
    	myVariables.put("var6", "System1");
     
    	Set entry=myVariables.entrySet();
    	for(Map.Entry<String,Object> entry : myVariables.entrySet()) {
    		System.out.println("key"+ " " +entry.getKey());
    		System.out.println("Value"+ " " +entry.getValue().toString());
    		System.out.println();	
    	}
    	int[] arr= {1,2,3,3,4,4,55,43};
    	System.out.println(Arrays.toString(arr));
    	
        
       String proVar1= (String)execution.getVariable("landlocation");
       String proVar2= (String)execution.getVariable("FirmName");
       
       
       
       String firmname = (String)execution.getVariable("FirmName");
       String contactperson = (String)execution.getVariable("ContactPerson");
       String Mail = (String)execution.getVariable("mailID");
       String Employment = (String)execution.getVariable("employment");
       String promotername = (String)execution.getVariable("nameOfPromoter");
       String areaofland = (String)execution.getVariable("areaOfTheLand");
       String ProjectCategory = (String)execution.getVariable("ProjectCategory");

       String Mobilenumber = (String)execution.getVariable("mobileNumber");*/

       /*Object LandNumber =execution.getVariable("LandNumber");
       String BusinessKey =(String)execution.getVariable("BusinessKey");
       String mailID =(String)execution.getVariable("mailID");
       String FirmName =(String)execution.getVariable("FirmName");
       String ContactPerson =(String)execution.getVariable("ContactPerson");
       String nameOfPromoter =(String)execution.getVariable("nameOfPromoter");
       Object mobileNumber =execution.getVariable("mobileNumber");
       String ProjectCategory =(String)execution.getVariable("ProjectCategory");
       String employment =(String)execution.getVariable("employment");
       String areaOfTheLand =(String)execution.getVariable("areaOfTheLand");
       String Acomments =(String)execution.getVariable("Acomments");
       Object  Aapproval=execution.getVariable("Aapproval");
       String Bcomments =(String)execution.getVariable("Bcomments");
       Object Bapproval =execution.getVariable("Bapproval");
       String Ccomments =(String)execution.getVariable("Ccomments");*/
       String Date =(String)execution.getVariable("date");
       String Day =(String)execution.getVariable("day");
       String Year =(String)execution.getVariable("year");

 
       
      /* String html ="<div style='font-size: 14pt; font-weight: bold; text-align: center; color:red; background-color: yellow; text-decoration: underline;'>Land Allotment Application Details</div>"
       		+"<br><br>"+
    		   "<b>  Firm Name:</b>"+firmname+"<br><br>" +
               "<b> Contact Name:</b>"+contactperson+"<br><br>"+
               "<b> Email:</b>"+Mail+"<br><br>" +
               "<b> Name Of The Promoter:</b>"+promotername+"<br><br>"+
               "<b> Mobile Number:</b>"+Mobilenumber+"<br><br>" +
               "<b> Estimated Number of Employment:</b>"+Employment+"<br><br>" +
               "<b> Land in yards:</b>"+areaofland+"<br><br>" +
               "<b> Land Location:</b>"+Landlocation+"<br><br>"+
               "<b> TD Comments:</b>"+TDComments+"<br><br>" +
               "<b> LRW Comments:</b>"+LRWComments+"<br><br>"+
               "<b> FDComments:</b>"+FDComments+"<br><br>"+
               "<b> APIIC Comments:</b>"+APIIComments;*/
       
       String html =
       "<html>"+
       "<head>"+
       	"<title>Employment Contract Template</title>"+
         "<h1>Employment Contract Template</h1>"+
      "</head>"+
     
       "<style>"+
       		"@page {"+
       		 " size: A4 portrait;"+
       		 " margin-left: 2cm;"+
       	"margin-top: 2cm;"+
       "margin-right: 2cm;"+
       "margin-bottom: 2cm;"+
       		  

       		"}"+

       		"body {"+
       		  "width: 160mm;"+
       		  "height: 297mm;"+
       		  "margin: 0 auto;"+
                    
       		"}"+


         "input {"+
          " border: none;"+
          " outline: none;"+
        "}"+
        "p {"+
           "line-height: 1.5;"+
        "}"+
        ".left {"+
         "float: left;"+
       "}"+

       ".right {"+
         "float: right;"+
       "}"+


       	"</style>"+
       "<body>"+
      "<h1 style='text-align: center; font-weight: bold; text-decoration: underline;'>Your Heading Here</h1>"+

       	"<h1>Employment  890987075 Contract</h1>"+
       	"<p>This contract, dated on the"+Date+"   day of  "+ Day+"in the year "+Year +" , is made between [company name] and [employee name] of [city, state]. This document constitutes an employment agreement between these two parties and is governed by the laws of [state or district].</p>"+

       	"<h2>WHEREAS</h2>"+
       	"<p>the Employer desires to retain the services of the Employee, and the Employee desires to render such services, these terms and conditions are set forth.</p>"+

       	"<h2>IN CONSIDERATION</h2>"+
       "<p>of this mutual understanding, the parties agree to the following terms and conditions:</p>"+

       	"<ol>"+
       		"<li><h3>Employment</h3></li>"+
       			"<p>The Employee agrees that he or she will faithfully and to the best of their ability carry out the duties and responsibilities communicated to them by the Employer. The Employee shall comply with all company policies, rules and procedures at all times.</p>"+
       		"<li><h3>Position</h3></li>"+
       			"<p>As a [job title], it is the duty of the Employee to perform all essential job functions and duties. From time to time, the Employer may also add other duties within the reasonable scope of the Employee’s work.</p>"+

       		"<li><h3>Compensation</h3></li>"+
       			"<p>As compensation for the services provided, the Employee shall be paid a wage of $___________ [per hour/per annum] and will be subject to a(n) [quarterly/annual] performance review. All payments shall be subject to mandatory employment deductions (State & Federal Taxes, Social Security, Medicare).</p>"+

       		"<li><h3>Benefits</h3></li>"+
       			"<p>The Employee has the right to participate in any benefits plans offered by the Employer. The employer currently offers [list benefits, if any]. Access to these benefits will only be possible after the probationary period has passed.</p>"+

       		"<li><h3>Probationary Period</h3></li>"+
       			"<p>It is understood that the first [time frame] of employment constitutes a probationary period. During this time, the Employee is not eligible for paid time off or other benefits. During this time, the Employer also exercises the right to terminate employment at any time without advanced notice.</p>"+

       	"<li><h3>Paid Time Off</h3></li>"+
             "<p>Following the probationary period, the Employee shall be eligible for the following paid time off:</p>"+
             "<ul>"+
               "<li>[length of time for vacation]</li>"+
               "<li>[length of time for sick/personal days]</li>"+
             "</ul>"+
             "<p>Bereavement leave may be granted if necessary.</p>"+

             "<p>The employer reserves the right to modify any paid time off policies.</p>"+

           "<li><h3>Termination</h3></li>"+
             "<p>It is the intention of both parties to form a long and mutually profitable relationship. However, this relationship may be terminated by either party at any time provided [length of time] written notice is delivered to the other party.</p>"+

             "<p>The Employee agrees to return any Employer property upon termination.</p>"+

          " <li><h3>Non-Competition and Confidentiality</h3></li>"+
             "<p>As an Employee, you will have access to confidential information that is the property of the Employer. You are not permitted to disclose this information outside of the Company.</p>"+

             "<p>During your time of Employment with the Employer, you may not engage in any work for another Employer that is related to or in competition with the Company. You will fully disclose to your Employer any other Employment relationships that you have and you will be permitted to seek other employment provided that (a.) it does not detract from your ability to fulfill your duties, and (b.) you are not assisting another organization in competing with the employer.</p>"+

             "<p>It is further acknowledged that upon termination of your employment, you will not solicit business from any of the Employer’s clients for a period</p>"+
       "<li><h3>Entirety</h3></li>"+
       "<p>This contract represents the entire agreement between the two parties and supersedes any previous written or oral agreement. This agreement may be modified at any time, provided the written consent of both the Employer and the Employee.</p>"+

       "<li><h3>Legal Authorization</h3><p></li>"+
       "<p>The Employee agree that he or she is fully authorized to work in [country name] and can provide proof of this with legal documentation. This documentation will be obtained by the Employer for legal records.<br></p>"+

       "<li><h3>Severability<h3></li>"+
       "<p>The parties agree that if any portion of this contract is found to be void or unenforceable, it shall be struck from the record and the remaining provisions will retain their full force and effect.</p>"+

       "<li><h3>Jurisdiction</h3></li>"+
       "This contract shall be governed, interpreted, and construed in accordance with the laws of [state, province or territory].</p>"+
       "</ol>"+

       "<p>In witness and agreement whereof, the Employer has executed this contract with due process through the authorization of official company agents and with the consent of the Employee, given here in writing.<br></p>"+


       "</body>"+
       "</html>"
     ;
       

       
    	              
    	ByteArrayInputStream bais = new ByteArrayInputStream(html.getBytes());
    	// read and parse HTML
    	pd4ml.readHTML(bais);
    	System.out.println("Generating 'pdf in C drive");
        File pdf = new File("D:\\EmployeeContract.pdf");
    	//File pdf = File.createTempFile("result", ".pdf", "C\\\\:");
    	System.out.println("File created successfully!");

    	FileOutputStream fos = new FileOutputStream(pdf);
    	// render and write the result as PDF
    	pd4ml.writePDF(fos);
    	System.out.println("PDF is now have content in it");

    	// alternatively or additionally: 
    	// pd4ml.writeRTF(rtfos, false);
    	// BufferedImage[] images = pd4ml.renderAsImages();
    	
    	// open the just-generated PDF with a default PDF viewer
	//if ( args.length == 0 ) {
			//Desktop.getDesktop().open(pdf);
		//}
	}
}
