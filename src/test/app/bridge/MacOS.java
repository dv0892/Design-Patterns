package test.app.bridge;

public class MacOS implements OS {

	@Override
	public void printOSType() {
		System.out.print( " This is Mac ");
	}

	@Override
	public void print(String msg) {
		System.out.println( msg );
	}

}
