package test.app.builder;

public class Insect {

	public boolean hasEyes; 
	public boolean hasLegs;
	public boolean hasHands;
	public boolean hasEars;
	public boolean canWalk;
	public boolean isMale;
	
	public boolean isHasEyes() {
		return hasEyes;
	}
	public boolean isHasLegs() {
		return hasLegs;
	}
	public boolean isHasHands() {
		return hasHands;
	}
	public boolean isHasEars() {
		return hasEars;
	}
	public boolean isCanWalk() {
		return canWalk;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setHasEyes(boolean hasEyes) {
		this.hasEyes = hasEyes;
	}
	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}
	public void setHasHands(boolean hasHands) {
		this.hasHands = hasHands;
	}
	public void setHasEars(boolean hasEars) {
		this.hasEars = hasEars;
	}
	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	@Override
	public String toString() {
		String 
		 res  = " This Insect \n";
		 res += (hasEyes?"Has":"Don't Have") + " eyes \n";
		 res += ( hasHands ? " Has " : " Don't have " ) + " hands \n ";
		 res += (hasLegs ? " Has " : " Don't have " )+ " Legs \n";
		 res += (hasEars ? " Has " : " Don't have ") + " Ears \n" ;
		 res += (canWalk ? " Can " : " Can't ") + " Walk \n" ;
		 res += (isMale ? " Male " : " Female ")+ " \n" ;
		 
		 return res;
	}
	
}
