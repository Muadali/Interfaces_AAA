/**
 * This class Process, 
 * @author Abdifatah Abdi
 * 
 * Programming 2
 * Summer 2022
 *
 */

//single line comment
/*
 * Multiple line comment
 */

package Interfaces_AAA;



public abstract class Process implements Comparable<Process>{
	private String processID;
	private int priority;
	
	
	public Process () {
		this.processID="";
		this.priority=0;
		
	}//end empty argument constructor 
	
	/**
	 * 
	 * @param ProcessID
	 * @param Priority
	 */
	public Process(String processID, int priority) {
		super();
		this.processID = processID;
		this.priority = priority;
	
	}//end preferred constructor 
	
	public int compareTo() {
		// TODO Auto-generated method stub
		return 0;
	}//end compareTo
	
	/**
	 * 
	 * @param priority
	 */
	
	/*
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority
	*/
	
	
	
	/*
	public int getPriority() {
		return priority;
	}//end getPriority
*/
	
	public String getProcessID() {
		return processID;
	
	}//end getProcessID

	


	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString


	
	
	
	

}//end class
