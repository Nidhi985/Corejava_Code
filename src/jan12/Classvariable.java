package jan12;

public class Classvariable {
	int Counter=0;
	static int Counter1=0;
	void display() 
	{
		System.out.println("Counter:" +Counter);
		System.out.println("Counter1:" +Counter1);
	}
	void increment()
	{
		Counter++;
		Counter1++;
	
	}
	public static void main(String[] args)
	{
		Classvariable Object= new Classvariable();
				Object.display();
				Object.increment();
				Object.display();
		Classvariable Object1= new Classvariable();
				Object1.display();
				Object1.increment();
				Object1.display();
				Object1.increment();
				Object1.display();
								
								
	}

}
