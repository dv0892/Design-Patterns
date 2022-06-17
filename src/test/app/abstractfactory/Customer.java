package test.app.abstractfactory;

public class Customer {
	
	Chair chairObj;
	Table tableObj;
	Sofa  sofaObj;
	
	/*
	 * Here customer could have created by himself these above objects
	 * Since these are related, but a better design decision would be put their object creation
	 * code inside a factory represented below.
	 * 
	 * Then later on only factories need to changed if different objects are required.
	 */
	
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
