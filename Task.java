/**
 * This class represents a Task, 
 * @author Abdifatah Abdi
 * @version 0.1
 * Programming 2
 * Summer 2022
 *
 */

//single line comment
/*
 * Multiple line comment
 */

package Interfaces_AAA;

//import Interfaces_AAA.Status.Task;

 




public class Task implements  Comparable<Task> {
	//private static final Status Status = null;
	private String name;
	private int priority;
	
	public Task () {
		this.name="";
		this.priority=0;
	}//end empty-argument constructor

	/**
	 * 
	 * @param name
	 * @param priority
	 */
	
	
	public Task(String name, int priority)
	{
	this.name = name;

	this.priority = priority;
	
	}//}//end preferred constructor 
	
	
	/**
	 * 
	 * @return name of the object
	 */
	
	public String getName() {
		return name;
		}//end getPriority
	
	
	//public Status getStatus () {
	//	return Status;
	//}
	
	/**
	 * 
	 * @param Status
	 */
	
	public void setStatus(String NOT_STARTED,String IN_PROCESS, String COMPLETE) {
		return;
	}//end get status

	
	
	
	public int compareTo(Task Process) {
		return(priority - Process.priority);
		}//end compareTo


	
	public String toString() {
	return "Task: [Description: "+name+" Priority: "+priority+"]";
	}//end toString

	public void getStatus() {
		// TODO Auto-generated method stub
		
	}//end getStatus

	
	


	
	}//end class
