package com.truviq.camunda;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.pd4ml.PD4ML;

public class Trail18 implements JavaDelegate{

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
       String BASE64 ="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pdx6Y/GgLD923+VSA7fpUCrtzycMckFifbjPQcdBxT88ZP1oESbie/HUU7PPI7+tRbvy9qfkmgCUMP0z0pd1Qbufal3D+nSgCffjjrTlk9u9QK35U7JFVbqBKW3f/XpQcAflmos85z+lLvPHPv0pgTBj075pV/zio95+tLu96AJCfQ96UNj/APXUe7g/WgEeue9AEwbH+GaXdnt+tRcdun0pVPT9ePagCU9DSBgcUwNt/rilUe3PYmgCXlf/ANVA5z7c9KZzS7cDj6/jQA9fX19aflvaox/+vilGc8fXpQBIpJ/Wj7ozSDjP1py7j1+lABGc9vWnnP60we30p3P+RQA5T83v60/rzUY9KOR06ZoAk/P86azHP0NJuP608e45oAMe+B6Ck3E03+L2xSM3tQBx24r3zTkO7r64ooqAJsmm854OKKKA6Cj72Mn1pzDaW/CiigpBjgc96TJoooATtmlLY7UUUEgvzc07cc46UUUmAK25vTt/OnLnnmiihDQrcKPfil3bV/SiimMdn+dC85oooJHDkZpx/pRRVIBw70E8gf57UUUwFBOfxp9FFAB09/rTs8D3oopdQHfxY9qAxoopgPWloooAkjPy0ir39zRRQA/n1ooooAfGd3HbFG7of880UUAO28il54oopMBRzTloopgLTiPl+nNFFADCxP8An2pq9OaKKAP/2Q==";
 
       
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
       "<img src=\"" + BASE64 + "\" />"+
       "</div>"+
       "</body>"+
       "</html>"
     ;
       

       
    	              
    	ByteArrayInputStream bais = new ByteArrayInputStream(html.getBytes());
    	// read and parse HTML
    	pd4ml.readHTML(bais);
    	System.out.println("Generating 'pdf in C drive");
        File pdf = new File("D:\\FINAL.pdf");
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
