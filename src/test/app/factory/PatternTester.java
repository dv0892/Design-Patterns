package test.app.factory;

public class PatternTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dialog dialog = new WindowsDialog();
		dialog.render();
		
		dialog = new MacDialog();
		dialog.render();
	}

}
