package test.app.abstractfactory;

public class PatternTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The Abstract Factory design pattern solves problems like:
				How can a class be independent of how the objects it requires are created?
 				How can different families of related or dependent objects be created?
 				
 			The Abstract Factory design pattern provides a solution:
				Encapsulate creating a family of objects in a separate factory object.
 				A class delegates object creation to a factory object instead of instantiating concrete classes directly

			Here the class will be actually holding a reference of factory that produces object it requires rather than the class
			itself holding the actual objects. By using this technique, this technique gives us the flexibility to introduce new versions of 
			objects in future by just introducing a new factory and it doesn't require change in original class.
			
			Abstract Factory - Factory Method
				Abstract Factory
					- defines a separate factory object for creating objects.
				Factory Method
					- defines a separate factory method for creating an object.
			
		 */
		
		
		/*
		 * Here we are using three products : Chair, Sofa and Table
		 * 
		 * And each of them are having two variants : 
		 * Modern  : Chair, Sofa and Table
		 * Classic : Chair, Sofa and Table
		 * 
		 * Customer is having these three item and he doesn't want Modern Chair and with Classic Sofa.
		 * He wants a Modern Chair with Modern Sofa and Table.
		 * 
		 * Now can create a multiple( Modern or Classic ) factories each returning related variants of Chair, Sofa and Table.
		 * And this factory can be assigned to customer .
		 * 
		 * See in the future we can introduce new factories just assign it to customer and doesn't even need to change the customer class which is 
		 * doing operation on it.
		 */
		
		Customer customer = new Customer( new ClassicFurnitureFactory() );
		customer.getNamesOfFurniture();
	}

}
