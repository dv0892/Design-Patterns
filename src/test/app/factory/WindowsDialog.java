package test.app.factory;

public class WindowsDialog extends Dialog {

	@Override
	public Button getButton() {
		// TODO Auto-generated method stub
		return  new CheckBoxWindows();
	}

}
