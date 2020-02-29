package jan25;

import java.util.Scanner;

public class ScannerEx3 {

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
			System.out.println("1The number is not a palindrome");
		}

	}

}
