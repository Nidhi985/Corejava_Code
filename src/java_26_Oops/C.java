package java_26_Oops;

public class C extends B  {
	void show2()
	{
		System.out.println("Iam ClassC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C C=new C();
		{
			C.display();
			C.show2();
			C.show();
		}
	}

}
