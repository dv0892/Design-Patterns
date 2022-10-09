package test.app.composite;

public class PatternTester {

	public static void main(String[] args) {
		/*
		 * What is Part-whole system ?
		 * A system that is made up of sub-systems. These sub-systems in turn can be made
		 * of smaller sub-systems. And so-on these sub-systems could be made-up of sub-systems.
		 * 
		 * To Understand Composite Design pattern , let's see the problem this pattern is trying to solve :
		 * 
		 * Suppose we have a part-whole hierarchy or system , how can be represented so that client
		 * have a uniform view for individual objects ( parts of system ) and composite parts ( made up of many individual
		 * as well other composite parts ) as well.  
		 * 
		 * 
		 * If the Client have to deal with this system , he would need to handle individual objects differently and it would be
		 * difficult to handle this kind of nesting structure.
		 * 
		 * For the client , it shouldn't matter,  whether he/she is dealing with individual objects or composite objects.
		 * How can we provide this uniformity ?
		 * 
		 * Define a Common Interface or ( abstract class )  that will be used by both individual item and composite items.
		 * The client will be dealing with ( individual or composite )items through this  common interface.
		 * In case of composite item, all the actions will be performed on composing items. If the composing item itself is composite
		 * item, then recursive all the actions will be performed on composing items amd soon.
		 * In this was we have created a kind of tree structure, that represents this part-whole hierarchy.  
		 * 
		 * The Common or Uniform interface , is usually called the Component interface. 
		 * 
		 * Example : 
		 * Suppose We have a Car that is a example of part-whole hierarchy or system.
		 * A Car has lot of parts like Mirrors , seat-Covers, etc
		 * and lot of sub-systems like Engine, etc 
		 *
		 * A client is interested in knowing the price of whole car  as well it composing items.
		 * Since dealing with different composing parts would be cumbersome to know the price, a uniform interface should be provided
		 * A Client should be provided a common interface( or uniform interface) to all individual parts as well as composite parts.
		 */
		
		Component processor = new Processor("Processor", 500);
		Component memory = new Memory("Memory", 500);
		
		Component mainBoard = new MainBoard("MainBoard", 500);
		mainBoard.addComponent(memory);
		mainBoard.addComponent(processor);
		
		Component disk = new Disk("Disk", 500);
		
		Component chassis = new Chassis("Chassis", 0);
				
		chassis.addComponent(mainBoard);
		chassis.addComponent(disk);
		
		
		System.out.println(  " Total Price " + "  "
				+ chassis.getPrice() );
		
		// For the Client , everything appears as component
		

	}

}
