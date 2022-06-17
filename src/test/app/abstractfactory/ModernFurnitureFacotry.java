package test.app.abstractfactory;

public class ModernFurnitureFacotry implements FurnitureFactory {

	@Override
	public Chair getChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public Sofa getSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

	@Override
	public Table getTable() {
		// TODO Auto-generated method stub
		return new ModernTable();
	}

}
