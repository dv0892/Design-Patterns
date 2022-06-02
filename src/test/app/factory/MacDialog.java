package test.app.factory;

public class MacDialog extends Dialog {

	@Override
	public Button getButton() {
		// TODO Auto-generated method stub
		return new CheckBoxMac();
	}

}
