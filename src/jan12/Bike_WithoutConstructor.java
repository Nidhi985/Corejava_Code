package jan12;

public class Bike_WithoutConstructor {
	String Name;
	int Speed;
	void display(String Name)
	{
		System.out.println("The name of Bike is:" +Name);
	}
	void speed(int Speed)
	{
		System.out.println("The maximum speed of Bike is:" +Speed);
	}
	int gearnumber()
	{
		int gear=6;
		return gear;
	}
	public static void main(String[] args)
	{
		Bike_WithoutConstructor Object=new Bike_WithoutConstructor();
		Object.display("Nidhi");
		Object.speed(120);
		int R=Object.gearnumber();
				{
			System.out.println("The number of gear is" +R);
				}
	}

}
