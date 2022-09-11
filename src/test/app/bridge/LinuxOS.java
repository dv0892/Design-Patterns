package test.app.bridge;

public class LinuxOS  implements OS {

	@Override
	public void printOSType() {
		System.out.print( " This is Linux ");
	}
	
	@Override
	public void print(String msg) {
		System.out.println( msg );
	}

}
