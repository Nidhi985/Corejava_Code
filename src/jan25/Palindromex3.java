package jan25;

import java.util.Scanner;

public class Palindromex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner obj=new Scanner(System.in);
		    Scanner Obj1=new Scanner(System.in);	
		    System.out.println("Enter the number:");
		    int num=obj.nextInt();
		    Checknumber(num);
		    System.out.println("Do you want to Continue? (Yes/No)");
		    String Userchoice=Obj1.nextLine();
			while(Userchoice.equals("Yes"))
			{
				System.out.println("Enter the number:");
			    int num1=obj.nextInt();
			    Checknumber(num1);
				System.out.println("Do you want to Continue? (Yes/No)");
				String Userchoice1=Obj1.nextLine();
				Userchoice=Userchoice1;
			}
			System.out.println("Stop");
	}
										
			public static void Checknumber(int num)	
			{
				int temp;
				int rev=0;
				int number=num;	
				
				while(number>0) 
				{			
				temp=number%10;
				rev=(rev*10)+temp;
				number=number/10;
				}
				if(num==rev)
				{
					System.out.println("The number is palindrome "+num);
				}
				else
				{
					System.out.println("The number is not a Palindrome "+num);
				}
				
			}
	}

	

		

	

	


