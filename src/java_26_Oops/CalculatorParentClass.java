package java_26_Oops;

public class CalculatorParentClass {
			
		public void add(int x,int y)
		{
			System.out.println("Addition is :" +(x+y));
		}
		public void sub(int x, int y)
		{
			System.out.println("Subtraction is :" +(x-y));
		}
		public void div(int x, int y)
		{
			System.out.println("Division is :" +(x/y));
		}
		public void mul(int x, int y)
		{
			System.out.println("Multiplication is :" +(x*y));
		}
		public static void main(String[] args)
		{		
		CalculatorParentClass cal=new CalculatorParentClass();
		cal.add(12,13);
		cal.sub(14,13);
		cal.div(16,2);
		cal.mul(17,18);

	}
	

}

