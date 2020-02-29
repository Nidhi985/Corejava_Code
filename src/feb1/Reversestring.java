package feb1;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Enter the input:");
String Value=obj.nextLine();
String reverse="";
for(int i=Value.length()-1;i>=0;i--)
{
char result=Value.charAt(i);
reverse=reverse+result;
}
System.out.println(reverse);
	}
}
