package test.app.bridge;

public class WindowsOS implements OS {

	@Override
	public void printOSType() {
		System.out.print( " This is Windows ");
	}
	
	@Override
	public void print(String msg) {
		System.out.println( msg );
	}

}
