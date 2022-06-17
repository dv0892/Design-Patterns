package test.app.builder;

public class PatternTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * The Builder design pattern solves problems like:
				How can a class (the same construction process) create different representations of a complex object?
			
		   The Builder design pattern provides a solution:
				Encapsulate creating and assembling the parts of a complex object in a separate Builder object.
 				A class delegates object creation to a Builder object instead of instantiating concrete classes directly.
 				
 		  Here the class is creating a complex object part by part. This is basically coupling this class tightly to this representation of class.
 		  In future , if we want to introduce new representation of this complex object we would have to go and change this class.
 		  
 		  	So the idea is to have a builder that will create this complex object and its parts too and  return this.
 		  	The different versions of this builder created different representations of this complex object and the class is only aware of 
 		  	this builder object.
 		  	
 		  	One more important part is do a series of calls to builder to build complex object.
 		  	The order in which  these are made can be placed in client code or in new Class made specifically for this purpose call Director.
 		  	
 		  	The Director is first feed with Builder.
 		  	Then the director makes calls to builder to small components of the complex object and then ultimately requests for big object.
 		  	
 		  	The director class defines the order in which to execute the building steps, while the builder provides the implementation for those steps.
 		  	
 		  	Advantage of Director Class : the director class might be a good place to put various construction routines so you can reuse them across your program.
 		  	
 		  	V.V.V.Imp : The final result of Builder is a huge object( or product ) .Concrete builders may produce products that don’t follow the common interface or
 		  	 interface. They are separate or independent huge objects to be used by client. 
 		  	 
 		  	 How to Implement :
 		  	 
	 		  	 Builder Interface :
	 		  	 	The Builder interface declares product construction steps that are common to all types of builders.
	
				 Concrete Builders :
				 	Create a concrete builder class for each of the product representations and implement their construction steps.
				 	Concrete builders may produce products that don’t follow the common interface.
				 
				 	Don’t forget about implementing a method for fetching the result of the construction
	 		  	 	*** The reason why this method can or can’t be declared inside the builder interface is that various builders may construct products that don’t have a common interface. 
	 		  	 	Therefore, in that case, you don’t know what would be the return type for such a method. 
				 
				 Director Class : 
				 	It may encapsulate various ways to construct a product using the same builder object.
				 	The director class defines the order in which to execute the building steps.
				 	
				 Client Class :
				 	The Client creates the Concrete the Builder and Director objects. Before construction starts, the client must
				 	pass the builder object to the director.
				 	
				 	The construction result can be obtained directly from the director only if all products follow the same interface. 
				 	Otherwise, the client should fetch the result from the builder.
				 	
				 	
			Example :
			 As we building a particular species of living organisms is a complex task.
			 
			 Let's try to capture few of the common steps to creating particular species
			 - setting its eyes
			 - setting its no of legs
			 - setting its no of hands
			 - has ears
			 - Can it Walk
			 
			 We have abstracted away the steps involved in building a species.
			
			 Concrete Builders  : 
			 	InsectSpeciesBuilder will build product i.e Insect
			 	HumanSpeciesBuilder will build  product i.e Human
			 	
			 Director : 
			 	StepsToBuildSpecies
		 * 
		 */
		
		HumanSpeciesBuilder humanSpeciesBuilder = new HumanSpeciesBuilder();
		InsectSpeciesBuilder insectSpeciesBuilder = new InsectSpeciesBuilder();
		
		
		StepsToBuildSpecies director = new StepsToBuildSpecies(humanSpeciesBuilder);
		director.constructSpecies();
		
		Human human = humanSpeciesBuilder.getHuman();
		
		System.out.println( human );
		
		director.setSpeciesBuilder(insectSpeciesBuilder);
		director.constructSpecies();
		
		
		Insect insect = insectSpeciesBuilder.getInsect();
		
		System.out.println( insect );
	}

}
