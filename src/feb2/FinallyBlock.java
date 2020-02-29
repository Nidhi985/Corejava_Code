package feb2;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int x1=2;
		int x2=0;
		try
		{
			x2=x/x1;
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e.getMessage());
		}
		finally {
			System.out.println("I am Finally block");
		}

	}

}
