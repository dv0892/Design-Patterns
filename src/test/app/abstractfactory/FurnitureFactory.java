package test.app.abstractfactory;

public interface FurnitureFactory { 
	
	/*
	 * Now can create a multiple( Modern or Classic ) factories each returning related variants of Chair, Sofa and Table.
	 */
	
	public Chair getChair();
	public Sofa getSofa();
	public Table getTable();
}
