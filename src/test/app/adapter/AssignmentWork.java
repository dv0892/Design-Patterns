package test.app.adapter;

public class AssignmentWork {
	
	Pen pen;
	
	public AssignmentWork( Pen pen) {
		this.pen = pen;
	}
	
	public void writeAssignment ( String text ) {
		pen.write(text);
	}

}
