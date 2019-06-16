package ua.lviv.lgs;

public class AirplaneControling {

	public void up() {

		System.out.println("Airplane moves " + (int)(Math.random() * 10000) + " metres up");

	}

	public void down() {

		System.out.println("Airplane moves " + (int)(Math.random() * 10000) + " metres down");

	}

	public void right() {

		System.out.println("Airplane moves " + (int)(Math.random() * 10000) + " metres right");

	}

	public void left() {

		System.out.println("Airplane moves " + (int)(Math.random() * 10000) + " metres left");

	}

}
