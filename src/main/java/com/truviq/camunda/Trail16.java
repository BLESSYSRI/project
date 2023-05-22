package com.truviq.camunda;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.pd4ml.PD4ML;

public class Trail16 implements JavaDelegate{

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
       String base64Image = "data:image/jpeg;base64,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";

 
       
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
       		  "width: 145mm;"+
       		  "height: 297mm;"+
       		  "margin: 0 auto;"+
       		  "text-align:justify"+
                    
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
      "<div style='text-align: center;'>"+
       "<img src='C:\\Users\\devi\\Desktop\\jesus songs\\images.jpg' alt='My Image'>"+
      "</div>"+
      "<h1 style='text-align: center; font-weight: bold; text-decoration: underline;'>Employment Contract Template</h1>"+

       	"<h2>Employment Contract</h2>"+
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
       "<p>Employee Signature         : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Date  :&nbsp;</p>"+
       "<p>Compeny Official Signature : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Date  :&nbsp;</p>"+
       "<div>"+
       "<h1>Angular image inserted</h1>"+
       "<img src=\"" + base64Image + "\" />"+
       "<img src='C:\\Users\\devi\\Desktop\\jesus songs\\images.jpg' alt='My Image'>"+
       "<img src=\"" + base64Image + "\" />"+
       "</div>"+
       "</body>"+
       "</html>"
     ;
       

       
    	              
    	ByteArrayInputStream bais = new ByteArrayInputStream(html.getBytes());
    	// read and parse HTML
    	pd4ml.readHTML(bais);
    	System.out.println("Generating 'pdf in C drive");
        File pdf = new File("D:\\Godisgood.pdf");
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
