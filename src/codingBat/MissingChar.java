package codingBat;

public class MissingChar {
	public static void missing(String str, int n)
	{
		
		String front = str.substring(0,n);
		String back = str.substring(n+1,str.length());
		
	
		System.out.println(front+back);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		missing("kitten",2);
		missing("Kitten",0);
		missing("Kitten",5);
		

	}

}
