package test.app.composite;

public abstract class Component {
      
	String partName ;
	int price;
	
	Component ( String partName , int price ){
		this.partName = partName;
		this.price = price;
	}
	
	public String getName( ) {
		return this.partName;
	}
	
	public int getPrice( ) {
		return this.price;
	}
	
	public boolean addComponent( Component item ) {
		return false;
	}
}
