package javaactivity7;

public class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears;
    public int currentSpeed;
	public Bicycle(int gears, int currentSpeed) {
		super();
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	public void applyBrake(int decrement)
	{
		currentSpeed-=decrement;
	}
	public void speedUp(int increment)
	{
		currentSpeed+=increment;
	}
	public void bicycleDesc()
	{
		System.out.println("No of gears: "+gears+"\nCurrent speed of bicycle: "+currentSpeed);
	}

}
