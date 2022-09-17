package test.app.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeComponent extends Component {

	List<Component> container = new ArrayList<>();
	
	public CompositeComponent( String partName , int price ) {
		super(partName, price);
	}
	
	public int getPrice ( ) {
		int finalPrice = 0;
		for( Component item : container ) {
			finalPrice += item.getPrice();
		}
		
		return finalPrice += this.price;
	}
	
	public String getName( ) {
		StringBuilder name = new StringBuilder();
		for( Component item : container ) {
			name.append(item.getName());
		}
		
		return name.append(this.partName).toString();
	}
	
	
	public boolean addComponent( Component item ) {
		return container.add(item);
	}
}
