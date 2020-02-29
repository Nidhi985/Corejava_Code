package jan12;

public class Car {
	String name;
	String color;
	int Year;
	
	Car(String iName,String icolor,int iYear)
	{
		name=iName;
		color=icolor;
		Year=iYear;
	}
	
	void display()
	{
		System.out.println("The name of Car is:" +name);
		System.out.println("The color of Car is:" +color);
		System.out.println("The year of Car is:" +Year);
			
	}
	void changegear(int gearNo)
	{
		System.out.println("The gear number is:"+gearNo);
	}
	int accelarate()
	{
		int speed=20;
		return speed;
	}
	static void applybreak()
	{
		System.out.println("speed control.........");
	}
	public static void main(String[] args)
	{
		Car Object=new Car("Maruti Ciaz", "Blue", 2019);
				Object.display();
		        Object.changegear(2);	
		        int Result=Object.accelarate();
		        {
		        	System.out.println("The speed is:"+Result +" Km/hr");
		        }
		        Car.applybreak();
	}

}
