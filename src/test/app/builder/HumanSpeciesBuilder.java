package test.app.builder;

public class HumanSpeciesBuilder implements SpeciesBuilder {
	
	Human human;
	
	HumanSpeciesBuilder(){
		this.human = new Human();
	}

	@Override
	public void setEyes() {
		human.setHasEyes(true);
		
	}

	@Override
	public void setLegs() {
		human.setHasLegs(true);
	}

	@Override
	public void setHands() {
		human.setHasHands(true);
	}

	@Override
	public void setEars() {
		human.setHasEars(true);
	}

	@Override
	public void setWalk() {
		human.setCanWalk(true);
	}

	@Override
	public void setMale() {
		human.setMale(true);
	}
	
	public Human getHuman() {
		return human;
	}
	

}
