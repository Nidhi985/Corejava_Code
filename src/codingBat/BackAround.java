package codingBat;

public class BackAround {
	public static String back(String str)
	{
		char last=str.charAt(str.length()-1);
		System.out.println(last+str+last);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		back("Nidhi");
		back("a");
		back("an");

	}

}
