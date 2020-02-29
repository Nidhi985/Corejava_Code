package jan25;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=Obj.nextInt();
		int temp;
		int rev=0;
		int num=number;		
		while(num>0) {			
		temp=num%10;
		rev=(rev*10)+temp;
		num=num/10;
		}
		if(number==rev)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
		System.out.println("Do you want to continue?");
		String name1=Obj.nextLine();
		while(name1.equals("No"))
		{
			int number2=Obj.nextInt();
			int temp1;
			int rev1=0;
			int num2=number2;		
			while(num2>0) {			
			temp=num2%10;
			rev=(rev*10)+temp;
			num2=num2/10;
			}
			if(number2==rev)
			{
				System.out.println("The number is palindrome");
			}
			else
			{
				System.out.println("The number is not a palindrome");
			}
		}
			}
		
		
	}
