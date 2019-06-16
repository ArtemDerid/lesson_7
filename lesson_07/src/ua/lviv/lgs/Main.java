package ua.lviv.lgs;

public class Main {
	
	public static void main(String[] args) {
		
		Su_27 su27 = new Su_27(150, 230, 1500, 530, "white");
		
		su27.engineStart();
		su27.airplaneTakeOff();
		su27.moveUp();
		su27.moveLeft();
		su27.moveDown();
		su27.moveRight();
		su27.stealthTechnology();
		su27.nuclearStrike();
		su27.turboAcceleration();
		su27.airplaneLanding();
	}

}
