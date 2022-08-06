package Interfaces_AAA;

public class Application {
	
	public static void main(String[] args) {
		
		Task task1 = new Task();
		Task task2 = new Task();
		Task task3 = new Task ();
		
		System.out.println();
		task1.getName();
		
		//task2.setStatus(String NOT_STARTED,String IN_PROCESS, String COMPLETE);
		task3.getStatus();
		
		System.out.println("Task 1 name: " + task1.getName());
		//System.out.println("Task 2 status: " task2.setStatus(String NOT_STARTED,String IN_PROCESS, String COMPLETE));
		//System.out.println("Task 3 status : " + task2.Status());
		
		//Process process1= new Process();
		//Process process2= new Process();
		//Process process3= new Process();
		
		
		//null, null, null
		
		
		
	}//end main

}//end class
