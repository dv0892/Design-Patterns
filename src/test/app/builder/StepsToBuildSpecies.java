package test.app.builder;

public class StepsToBuildSpecies {
	
	// This is a Director Implementation
	
	SpeciesBuilder speciesBuilder;
	
	StepsToBuildSpecies ( SpeciesBuilder speciesBuilder ){
		this.speciesBuilder = speciesBuilder;
	}
	
	public void setSpeciesBuilder ( SpeciesBuilder speciesBuilder ){
		this.speciesBuilder = speciesBuilder;
	}
	
	public void constructSpecies() {
		speciesBuilder.setEars();
		speciesBuilder.setEyes();
		speciesBuilder.setHands();
		speciesBuilder.setLegs();
		speciesBuilder.setMale();
		speciesBuilder.setWalk();
	}

}
