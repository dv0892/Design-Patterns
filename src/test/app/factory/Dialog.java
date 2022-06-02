package test.app.factory;

public abstract class Dialog {
	
	public abstract Button getButton();
	
	public void render() {
		Button button = getButton();
		System.out.println(button.render());
	}
}
