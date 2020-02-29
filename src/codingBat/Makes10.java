package codingBat;

public class Makes10 {
	public static boolean make(int a,int b)
	{
		if(a==10||b==10||a+b==10)
		{
			System.out.println(true);
			return true;
		}
		System.out.println(false);
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method st
		make(10,9);
		make(100,10);
		make(5,5);
		make(5,1);
	}

}
