package feb2;

import java.util.Scanner;

public class MultipleExceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=obj.nextLine();
		String b=null;
		try {
			System.out.println(a.charAt(6));
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("Exception: "+s.getMessage());
			int length=a.length();
			System.err.println("Max length of string is: "+length);
		}
		catch(NullPointerException n)
		{
			System.out.println("Exception: "+n.getMessage());
			int length=b.length();
			b="Pune";
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e.getMessage());
			
		}

	}

}
