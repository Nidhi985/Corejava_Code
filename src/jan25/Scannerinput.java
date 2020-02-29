package jan25;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter the Number to display the range:");
		int number=Obj.nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Enter your name:");
		String name=Obj.nextLine();
		
		System.out.println("Enter your City:");
		String city=Obj.nextLine();
		
		System.out.println("Enter the pincode:");
		int pincode=Obj.nextInt();
		
		System.out.println("Hello " +name+ ",your city is " +city +" pincode: "+pincode);

	}

}
