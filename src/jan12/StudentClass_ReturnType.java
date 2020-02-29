package jan12;

public class StudentClass_ReturnType {
	String Name;
	int Id;
	String Collegename;
	String Department;
  StudentClass_ReturnType(String iName,int iId,String iCollegename,String idepartment)
  {
	  Name=iName;
	  Id=iId;
	  Collegename=iCollegename;
	  Department=idepartment;
  }
  String rName()
  {
  String Name="Nidhi";
  return Name;
  }
  int rid()
  {
	  int Id=1234;
	  return Id;
  }
  public static void main(String[] args)
  {
	  StudentClass_ReturnType Object= new StudentClass_ReturnType("ABC",123,"SMVITN","IT");
	  String result=Object.rName();
			  {
		  System.out.println(result);
			  }
			  int result1=Object.rid();
			  {
				  System.out.println(result1);
			  }
  }
	  
  
}


