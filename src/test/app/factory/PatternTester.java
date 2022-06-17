package test.app.factory;

public class PatternTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * The Factory Method design pattern solves problems like:
				How can an object be created so that subclasses can redefine which class to instantiate?
 				How can a class defer instantiation to subclasses?
		 * 
		 * The Factory Method design pattern provides a solution:
				Define a separate operation (factory method) for creating an object.
 				Create an object by calling a factory method.

		 * 
		 * Here We are letting the subclass ( WindowsDialog or MacDialog ) decide 
		 * which object is actually being created by redefining the factory method "getButton() "
		 * 
		 * Here Dialog doesn't necessary to be a abstract class Since the definition of actual button( used inside Dialog ) 
		 * will be provided by the class which instantiates the dialog. So we are making it as abstract. 
		 * 
		 * Otherwise other technique could be to provide a default factory method in Dialog class and let's subclass have choose whether they want to
		 * use default implementation or provide their own by subclassing this class and overriding the factory method
		 * 
		 */
		
		Dialog dialog = new Dialog();
		dialog.render();
		
		dialog = new WindowsDialog();
		dialog.render();
		
		dialog = new MacDialog();
		dialog.render();
	}

}
