package java_26_Oops;

public class CalculatorChildclass extends CalculatorParentClass{

			void add(int x,int y,int z)
		{
			System.out.println("Addition is:"+(x+y+z));
		}
		void sub(int x,int y,int z)
		{
			System.out.println("sub is:"+(x-y-z));
		}
		public static void main(String[] args)
		{
			CalculatorChildclass nc =new CalculatorChildclass();
			{
			nc.add(12,13,14);
			nc.mul(10, 2);
			nc.div(6,2);
			nc.add(10, 11);
			
			
		
	}

}
}
