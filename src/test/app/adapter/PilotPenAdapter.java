package test.app.adapter;

public class PilotPenAdapter implements Pen {

	private PilotPen pilotPen;

	public PilotPenAdapter(PilotPen pilotPen) {
		this.pilotPen = pilotPen;
	}
	
	@Override
	public void write(String text) {
		pilotPen.writeWithPiloPen(text);
	}

}
