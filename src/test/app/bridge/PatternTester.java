package test.app.bridge;

public class PatternTester {

	public static void main(String[] args) {
	/*
	 * The Bridge design pattern solves problems like
	 * " Problem : How to decouple abstractions from Implementation so that both of them can vary independently . "
	 * 
	 *  Let's try to understand above issue with an example : 
	 *  Suppose We have defined an abstraction for GUI and there are multiple implementation of it for each underlying 
	 *  OS or service. like GUIForWindows , GUIForMac, GUIForLinux, GUIForSolaris, etc.
	 *  
	 *  OS { Windows , Mac, Linux, Solaris }
	 *  
	 *  In future, We want to introduce a new GUI version 1 , 2 and 3. Now this new GUI1 , GUI2 and GUI3 would need
	 *  implementations for all the available OS types resulting in 12 new classes like 
	 *  GUI1ForWindows, GUI1ForMac ,.....GUI2ForWindows , GUI2ForMac, ...etc
	 *  
	 *  GUI { GUI, GUI1, GUI2, GUI3 }
	 *  
	 *  We can clearly see the problem the number of classes are exponentially increasing with every new OS or GUI type 
	 *  that will be introduced.
	 *  
	 *  This problem is occurring because we are trying to GUI classes in two independent dimensions : OS and GUI.
	 *  
	 *  Here we can see that OS and GUI ( two dimensions  ) are tightly coupled and can't vary independently
	 *  This is the problem that Bridge pattern can address.
	 *  
	 *  The Bridge Pattern provides solution : 
	 *   " Different separate inheritance hierarchies for abstraction and implementation. 
	 *     Abstraction delegates its implementation to Implementor object instead of committing to an 
	 *     implementation at compile time. "
	 *  
	 *  Here, the solution means we should maintain a separate hierarchy for independent dimension.
	 *  One Dimension's   hierarchy would act as abstraction and 
	 *  Other dimension's hierarchy would act as Implementations all inheriting from their respective Implementors.
	 *   
	 *  In our example , We should create hierarchy for GUI ( Abstraction ) and other hierarchy for OS ( Implementation ) .
	 *  
	 *  Now the abstraction would be composed with object implementations.
	 *  Using this composition, abstraction would delegate to implementation object.
	 *  
	 *  V.Imp : The number of classes in system, using this technique , would be very less compared to above method.
	 *  Also introducing new OS or GUI type would require very little effort.
	 *  
	 *  The composition of Implementation obj in abstraction class is acting as a bridge.
	 * 
	 */

	GUI gui = new GUI1( new LinuxOS() );
	gui.writeMessage(" Hi is this is test message " );
    gui.setOS( new WindowsOS() );
    gui.writeMessage( " this is test message ");
		
    
    // We can easily implement GUI2 very little effort
    
	}

}
