package test.app.adapter;

public class PatternTester {

	public static void main(String[] args) {
		/*
		 * Suppose you have a system or library that is expecting classes of particular interface type( The Target interface ).
		 * On the other hand, you have some class that can do the work but are not written with a particular
		 * interface type.
		 * 
		 * How can we solve this problem ?
		 * One obvious solution : Change our class and implement the Target interface.
		 * But this is solution is impossible sometimes, supoose you don't have access to that class
		 * 
		 * So what could be the generic solution. 
		 * 
		 * This solution is Adapter Design patterns. 
		 * 
		 * The Soln : Make a new Class (let's call it Adapter )that will implement the Target interface and also either
		 * 1. It will be composed with your class using aggregation ( Object Adapter )
		 * 2. Or It will extend your class. ( Class Adapter )
		 * 
		 * The Adapter will internally call Adaptee methods.
		 * 
		 * Here there are three key things :
		 * The Target interface 
		 * The Class that will implement that Target interface.( let's call it Adapter )
		 * The Class that needs to adapt according to Target interface ( let's call it Adaptee Class ).
		 * 
		 * As you can see We neither Target interface nor Adaptee Class (on interface ) and still solved the 
		 * problem.
		 * A classic decoupling example.
		 * 
		 * Let's Take a example we have a Assignment Work that can be written with Objects of type Pen only.
		 * 
		 * Now the actual pens linke PilotPen, InkPen aren't in out control.
           Here Pen is the target interface that Client Assignment work is calling
           PilotPen or InkPen is adaptee.
           We can created respective adaptors PilotPenAdapter or InkPenAdapter
           
		 */
		  
		 PilotPen pilotPen = new PilotPen();
		 
		 // Adapter Pattern in action on this line
		 PilotPenAdapter pilotPenAdapter = new PilotPenAdapter(pilotPen);
		 
		 AssignmentWork aw = new AssignmentWork(pilotPenAdapter);
		 aw.writeAssignment(" This is my assignment ");
		
	}

}
