package jan12;

public class StudentClass
{
	String Name;
	int Id;
	String CollegeName;
	String Department;
	StudentClass(String iName,int iId,String iCollegeName, String idepartment)
	{
		Name=iName;
		Id=iId;
		CollegeName=iCollegeName;
		Department=idepartment;
	}
	void attendTolecture()
	{
		System.out.println(Name+ " Attends Lecture");
	}
	void appearsforexam()
	{
		System.out.println(Name+ " appears for Exam with " +Id);
	}
	void goestoCollege()
	{
		System.out.println(Name+ " Goes to College with " +CollegeName+ " " +Id);
	}
public static void main(String[] args)
{
	StudentClass Object= new StudentClass("Nidhi",987,"SMVITM", "ECE");
	{
	Object.attendTolecture();
	Object.appearsforexam();
	Object.goestoCollege();
	}

}
}

