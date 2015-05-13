public class Bicycle{
	int gear, cadence, speed;
Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
	}
	public static void main(String[] args)
	{	Bicycle mybike = new Bicycle(1,2,3);
	
	System.out.println(gear+cadence+speed);
	}
}