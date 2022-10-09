package test.app.facade;

public class PatternTester {

	public static void main(String[] args) {
		/*
		 * This design pattern addresses problems like 
		 *  How can we provide simplified interface for a complex system or subsystem that we are dealing with ?
		 *  
		 *  Suppose we have a app that connects with library for encoding of video to particular format.
		 *  Now this external library is very complex and we are interested in only using its video conversion feature.
		 *  
		 *  What we are trying to avoid here is connecting to every bit that will provide the video conversion feature.
		 *  The App would have to refer and know about many different object, which will make our app tightly coupled to this
		 *  sub-system.
		 *  
		 *  Tightly coupled objects are hard to implement, change , test and reuse because they depend on many different object.
		 *  
		 *  Instead what we can do is create a Simplified interface( not java interface ) that will have the responsibility of
		 *  connecting with different objects of this library for fulfilling this particular task..
		 *  Our App would only be concerned with this interface.
		 *  Also this facade can be used in many different parts of our application.
		 *  
		 *  The formal definition is : 
		 *  " Define a separate Facade object that provides an unified interface for a set of interfaces in a subsystem.
 			  Work through a Facade to minimize dependencies on a subsystem. "
		 *  
		 *  
		 */

		VideoConversionFacade vd = new VideoConversionFacade();
		vd.convertVideo("myVideo.ogg", "mp4");
	}

}
