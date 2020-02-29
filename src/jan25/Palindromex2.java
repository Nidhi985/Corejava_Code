package jan25;

public class Palindromex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int num=1;num<=1000;num++)
		{
			int temp;
			int rev=0;
			int number=num;
							
		while(number>0) {
			
		temp=number%10;
		rev=(rev*10)+temp;
		number=number/10;
		}
		if(num==rev)
		{
			System.out.println("The number is palindrome:" +num);
		}
	}

}
}
