package assignment;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=6789;	
		int z=0;
		int y;
		while(x!=0)
		{
		 y=x%10;
		 z=z*10;
		 z=z+y;
		 x=x/10;
		 
		}
		System.out.println(z);
		
	}
}
		
		 
		
			

	


