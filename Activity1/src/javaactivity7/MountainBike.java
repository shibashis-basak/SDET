package javaactivity7;

public class MountainBike extends Bicycle {

	int seatHeight;

	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(int seatH) {
		this.seatHeight = seatH;
	}
	public void bicycleDesc()
	{
		System.out.println("No of gears: "+gears+"\nCurrent speed of bicycle: "+currentSpeed+"\nThe seat height: "+seatHeight);
	}

}
