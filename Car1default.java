package defaultconstructor;

public class Car1default {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car1default()
	{
		doors="closed";
		engine="on";
		driver="seated";
		speed=10;
	}

	public void run()
	{
		if(doors=="closed"&&engine=="on"&&driver=="seated"&&speed>=0)
		{
			System.out.println("CAR IS RUNNING");
			
		}
		else
		{
			System.out.println("\n car is not running");
			
		}
	}
}
	


