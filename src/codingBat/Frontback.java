package codingBat;

public class Frontback {
public static String frontback(String str)
{
	if(str.length()<=1)
	{
		System.out.println(str);
	}
	else
	{
	char first = str.charAt(0);
	char last=str.charAt(str.length()-1);
	System.out.println(last+str.substring(1, str.length()-1)+first);
	
	}
	return str;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frontback("Nidhi");
		frontback("Shetty");
		frontback("yes");
		frontback("a");


	}

}
