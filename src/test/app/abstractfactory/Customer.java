package test.app.abstractfactory;

public class Customer {
	
	Chair chairObj;
	Table tableObj;
	Sofa  sofaObj;
	
	FurnitureFactory factory ;
	
	Customer ( FurnitureFactory factory ) {
		this.factory = factory;
	} 
	
	public void getNamesOfFurniture() {
		factory.getChair().name();
		factory.getSofa().name();
		factory.getTable().name();
	}

}
