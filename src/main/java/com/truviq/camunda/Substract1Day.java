package com.truviq.camunda;
	import java.time.LocalDateTime;

	import org.camunda.bpm.engine.delegate.DelegateExecution;
	import org.camunda.bpm.engine.delegate.JavaDelegate;

	public class Substract1Day implements JavaDelegate {
		/*public static void main(String[] args) {
			String dateString = "2023-05-11T17:57:00";
			LocalDateTime dateTime = LocalDateTime.parse(dateString);
			LocalDateTime newDateTime = dateTime.minusDays(11);
			String newDateString = newDateTime.toString(); // in ISO 8601 format
			System.out.println(newDateString);

			
		}
	*/
		@Override
		public void execute(DelegateExecution execution) throws Exception {
			
			// TODO Auto-generated method stub
			
			String dateString = (String)execution.getVariable("ISO8601input");
			LocalDateTime dateTime = LocalDateTime.parse(dateString);
			LocalDateTime newDateTime = dateTime.minusDays(1);
			String newDateString = newDateTime.toString(); 
			execution.setVariable("OneDaylessISO", newDateString);// in ISO 8601 format
			System.out.println(newDateString);
			
		}


	}

