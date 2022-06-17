package test.app.singleton;




public class PatternTester {

	public static void main ( String... args ) {
		/*
		 * The Singleton design pattern solves problems like:
				How can be ensured that a class has only one instance?
 				How can the sole instance of a class be accessed globally?
 				
 		   The Singleton design pattern provides a solution:
				Hide the constructor of a class, and define a static operation (getInstance())
 				that returns the sole instance of the class.

			
			This pattern violates Single Responsibility Principle because 
			the class in addition to its responsibility controlling its creation also( viz. second responsibility ) .
		 */
		
		DatabaseConn conne = DatabaseConn.getInstance();// new DatabaseConn(); Can't do this because constructor is private
	
		System.out.println( conne.getName() );
		
		System.out.println( "Again ... " +DatabaseConn.getInstance().getName() );
		
		DatabaseConnWithSubClassing dbSingleton = DatabaseConnWithSubClassing.getInstance();
		
		System.out.println( dbSingleton.getName() );
	
	}
}
