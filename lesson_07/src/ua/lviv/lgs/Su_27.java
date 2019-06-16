package ua.lviv.lgs;

public class Su_27 extends Airplane {
	
	private double maxSpeed;
	private String Color;

	public Su_27(int width, int length, int weight, double maxSpeed, String color) {
		super(width, length, weight);
		this.maxSpeed = maxSpeed;
		Color = color;
	}

	@Override
	public void turboAcceleration() {
		System.out.println("Turbo Acceleration has increased max speed to " + (double)(maxSpeed + (Math.random()*maxSpeed)) + " km per hour");
		
	}

	@Override
	public void stealthTechnology() {
		System.out.println("Airplane is invisible for " + (int)(Math.random()*600) + " seconds");
		
	}

	@Override
	public void nuclearStrike() {
		System.out.println((int)(Math.random()*11) + " nuclear warheads was droped");
		
	}

}
