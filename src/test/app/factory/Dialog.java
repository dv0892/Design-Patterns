package test.app.factory;

public  class Dialog {
	
	// Default Factory method implementation - SubClass can change this by extending this class and overriding
	// this method.
	public  Button getButton() {
		return new NoButton();
	}
	
	public void render() {
		Button button = getButton();
		System.out.println(button.render());
	}
}
