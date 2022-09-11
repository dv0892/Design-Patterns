package test.app.bridge;

public class SolarisOS implements OS {

	@Override
	public void printOSType() {
		System.out.print( " This is Solaris ");
	}
	
	@Override
	public void print(String msg) {
		System.out.println( msg );
	}

}
