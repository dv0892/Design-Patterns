package test.app.builder;

public class InsectSpeciesBuilder implements SpeciesBuilder {

	Insect insect;
	
	InsectSpeciesBuilder(){
		this.insect = new Insect();
	}

	@Override
	public void setEyes() {
		insect.setHasEyes(true);
		
	}

	@Override
	public void setLegs() {
		insect.setHasLegs(true);
	}

	@Override
	public void setHands() {
		insect.setHasHands(false);
	}

	@Override
	public void setEars() {
		insect.setHasEars(false);
	}

	@Override
	public void setWalk() {
		insect.setCanWalk(false);
	}

	@Override
	public void setMale() {
		insect.setMale(true);
	}

	public Insect getInsect() {
		return insect;
	}
	
}
