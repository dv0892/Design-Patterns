package test.app.abstractfactory;

public class ClassicFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair getChair() {
		// TODO Auto-generated method stub
		return new ClassicChair();
	}

	@Override
	public Sofa getSofa() {
		// TODO Auto-generated method stub
		return new ClassicSofa();
	}

	@Override
	public Table getTable() {
		// TODO Auto-generated method stub
		return new ClassicTable();
	}

}
