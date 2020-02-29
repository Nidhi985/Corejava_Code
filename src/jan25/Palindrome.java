package jan25;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=191;
		int temp;
		int number=num;
		int rev=0;
		
		while(num>0) {
			
		temp=num%10;
		rev=(rev*10)+temp;
		num=num/10;
		}
		if(number==rev)
		{
			System.out.println("The number is palindrome:" +number);
		}
		else
		{
			System.out.println("The number is not a palindrome:"+number);
		}
				

	}

}
