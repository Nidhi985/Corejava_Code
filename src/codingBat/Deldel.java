package codingBat;

public class Deldel {
	public static String del(String str)
	{
		if(str.length()>3)
		{
		String str1=str.substring(1,4);
		if(str1.equals("del"))
		{
			System.out.println(str.charAt(0)+str.substring(4));
		}
		else
		{
			System.out.println(str);
		}
		}
		else
		{
			System.out.println(str);
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		del("Ddelo");
		del("Nidhi");
		del("Dog");
		del("D0");
		del("Mdelummy");

	}

}
