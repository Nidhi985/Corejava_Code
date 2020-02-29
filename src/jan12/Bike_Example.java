package jan12;

public class Bike_Example {
	String Name;
	int Speed;
	int gears;
	Bike_Example(String iName,int ispeed,int igear)
	{
		Name=iName;
		Speed=ispeed;
		gears=igear;
			
	}
	void display()
	{
		System.out.println("The name of bike is:" +Name);
	
	}
	void speed()
	{
		System.out.println("The max speed is:" +Speed);
	}
	int gearnumber()
	{
		return gears;
	}
	
public static void main(String[] args) 
{
Bike_Example Object= new Bike_Example("Pulsar", 120,6);
Object.display();
Object.speed();
int Result=Object.gearnumber();
{
	System.out.println("The number of gear is:" +Result);
}
	

}
}
