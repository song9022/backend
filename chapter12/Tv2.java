package chapter12;

//다형성(polymorphism)
public class Tv2 {
	private boolean power;
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void power() {
		power=!power;
	}

}
