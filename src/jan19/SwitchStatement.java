package jan19;

public class SwitchStatement {
	public static void main(String[] args)
	{
		int day=5;
		switch(day)
		{
		case 1:System.out.println("First day of week is:Sunday");
		break;
		case 2:System.out.println("Second day of week is:Monday");
		break;
		case 3:System.out.println("third day of week is:Tuesday");
		break;
		case 4:System.out.println("Fourh day of week is:Wednesday");
		break;
		case 5:System.out.println("Fifth day of week is:Thursday");
		break;
		case 6:System.out.println("six day of week is:Friday");
		break;
		case 7:System.out.println("Seventh day of week is:Saturday");
		break;
		default:System.out.println("Invalid input");
		}
		System.out.println("Out of loop");
	

}
}
