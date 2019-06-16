package ua.lviv.lgs;

public abstract class Airplane implements SpecialFeatures{
	
	private int width;
	private int length;
	private int weight;
	private AirplaneControling airplaneControling = new AirplaneControling();
	
	public Airplane(int width, int length, int weight) {
		super();
		this.width = width;
		this.length = length;
		this.weight = weight;
	}
	
	public void moveUp() {
		airplaneControling.up();
	}
	
	public void moveDown() {
		airplaneControling.down();
	}
	
	public void moveRight() {
		airplaneControling.right();
	}
	
	public void moveLeft() {
		airplaneControling.left();
	}

	void engineStart() {
		System.out.println("Ready to start in " + (int)(20 + Math.random()*69) + " seconds");
	}
	
	void airplaneTakeOff() {
		System.out.println("Airplane can take up to " + (double)(Math.random()*1000) + " kilometres");
	}
	
	void airplaneLanding() {
		System.out.println("Airplane is landidng");
	}

}
