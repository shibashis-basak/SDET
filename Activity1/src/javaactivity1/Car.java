package javaactivity1;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	public Car(String color, String transmission, int make) {
		super();
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = 4;
		this.doors = 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("The color of the car is: " +color+ "\nThe transmission of the car is: " +transmission+ "\nMake of the car: " +make+ "\nTyres of the car: " +tyres+ "\nDoor of the car: " +doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
