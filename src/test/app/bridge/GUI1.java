package test.app.bridge;

public class GUI1 implements GUI {

	OS operatingSystem ;
	
	public GUI1(OS os ) {
		this.operatingSystem = os ;
	}
	
	@Override
	public void setOS(OS os) {
		this.operatingSystem = os; 
	}

	@Override
	public void writeMessage(String msg) {
		this.operatingSystem.printOSType();
		this.operatingSystem.print(msg);
	}

}
