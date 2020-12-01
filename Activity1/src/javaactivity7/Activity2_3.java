package javaactivity7;

public class Activity2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MountainBike mb = new MountainBike(3, 0, 25);
        mb.bicycleDesc();
        mb.speedUp(15);
        mb.bicycleDesc();
        mb.applyBrake(5);
        mb.bicycleDesc();

	}

}
