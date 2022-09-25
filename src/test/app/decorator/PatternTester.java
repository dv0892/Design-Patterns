package test.app.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PatternTester {

	public static void main(String[] args) throws IOException {
		/*
		 * Decorator design pattern solves problems like how to add responsibilities to an object
		 * at run time . Remember, here we are talking about the adding responsibilities ( or functionalities )
		 * to an object ( not to a class )  and that to at run time.
		 * 
		 * Responsibility : A responsibility denotes the obligation of an object to provide certain behavior. 
		 * Responsibility / Behavior / Functionality are used interchangeable terms.
		 * 
		 * The most simplest approach would be to add functionality to it by sub-classing it.
		 * The sub-classing approach has problems like : 
		 * -> They are statically binded at compile time and not run-time.
		 * -> If any other object wants to add this functionality , he can't use it. He has to create a new sub-class containing the functionality.
		 * -> Supporting a large number of functionalities and their combinations would produce an explosion of subclasses.
		 * 
		 * 
		 * So, What could be the efficient approach ?
		 * Identify the interface of class that you want to add functionality to.
		 * 
		 * Now Create a new class that would implement this interface and compose it with above object.
		 * This new created class would delegate its tasks to composed object and also provide additional functionality.
		 * 
		 * Now the client would work with new Created Class and call operations usually.
		 * This is also known as Wrapper pattern.
		 * 
		 * Let's call the common interface Component and newly created class Decorator.
		 * Decorator is a Component and also has a Component.
		 * 
		 * class Decorator implements Component {
		 * 
			  Component wrapped ;
			  	
			  	Decorator ( Component wrapped ) {
			  		this.wrapped = wrapped;
			  	}
		 * } 
		 * 
		 * This approach can support any level of nesting and even decorators can be wrapped inside decorators.
		 * We are not binding the particular decorator to any particular kind of component object. That would be done at run time.

		 * This kind of pattern is quite n java.io.* package classe 
		 * FileInputStream , BufferedInputStream.
		 */

		 DataOutputStream dataOutStream = new DataOutputStream( new BufferedOutputStream( new FileOutputStream("test") ) );
		 
		 dataOutStream.writeUTF( "Hello this is an example 11 of Decorator Pattern ");
		 dataOutStream.writeLong(933949);
		 
		 dataOutStream.close();
		 
		 DataInputStream dataInStream = new DataInputStream( new BufferedInputStream( new FileInputStream("test")));
		/* long d = dataInStream.readLong();*/
		 System.out.println( dataInStream.readUTF() + " " + dataInStream.readLong());
		 
		 dataInStream.close();
		
	}

}
