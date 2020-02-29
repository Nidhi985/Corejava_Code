package feb2;

import java.util.Scanner;

public class Exceptionhandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int x=obj.nextInt();
		int z=0;
		System.out.println("Enter the second Number:");
		int y=obj.nextInt();
		String a="";
		try
		{
			System.out.println(a.charAt(1));
			z=x/y;
		}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println("Exception occured:"+e.getMessage());
		z=5;
			}
		for(int i=z;i>=0;i--)
		{
			System.out.println(i);
		}

		}
		

	}


