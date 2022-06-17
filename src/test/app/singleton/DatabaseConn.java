package test.app.singleton;

public class DatabaseConn {
	
	//Eager loading
	private static final DatabaseConn INSTANCE = new DatabaseConn();
	
	private String name ;
	
	private DatabaseConn() {
		this.name = " I am Singleton ";
	}
	
	public static DatabaseConn getInstance() {
		return INSTANCE;
	}
	
	public String getName() {
		return name;
	}

}


abstract class DatabaseConnWithSubClassing {
	
	//Eager loading
	private static DatabaseConnWithSubClassing INSTANCE ;
	
	public static DatabaseConnWithSubClassing getInstance() {
		INSTANCE = new NoSQLDataBaseConn();
		return INSTANCE;
	}
	
	private String name ;
	
	private  DatabaseConnWithSubClassing() {
		
	}
	
	private  DatabaseConnWithSubClassing( String name ) {
		this.name = " I am Singleton " + name ;
	}
	
	public String getName() {
		return name;
	}
	
	private static class SQLDataBaseConn extends DatabaseConnWithSubClassing {
		public SQLDataBaseConn() {
			super("SQL");
		}
	}
	
	private static class NoSQLDataBaseConn extends DatabaseConnWithSubClassing {
		public NoSQLDataBaseConn() {
			super("NoSQL");
		}
	}
}





