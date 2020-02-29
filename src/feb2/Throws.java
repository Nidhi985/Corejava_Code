package feb2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	openFile("Abc.txt");
			myexception("chrom");
	}

	
	public static void openFile(String path) throws FileNotFoundException
	{
		File fh=new File(path);
		FileInputStream io=new FileInputStream(fh);
		
	}
	public static void myexception(String browserName) throws Exception
	{
		if(browserName.equals("chrome"))
		{
			System.out.println("Browser is Chrome");
		}
		else if(browserName.equals("Firefox"))
		{
			System.out.println("Browser is Firefox");
		}
		else
		{
			throw new Exception("The invalid Brosername");
		}
	}

}
