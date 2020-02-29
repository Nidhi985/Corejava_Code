package jan25;

import java.util.Scanner;

public class ScanerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter the number to display its table:");
		int number=Obj.nextInt();
		for(int i=1; i<=10;i++)
		{
			System.out.println(number+ " X "+i+ " = " +i*number);
		}
		

	}

}
