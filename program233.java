//Remove white spaces

import java.util.Scanner;

class StringB
{
	public String RemoveWhiteSpace(String str)
	{
		return str.replaceAll("\\s", "");
	}
		
}

public class program233 {
	
public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sobj.nextLine();
		
		StringB obj = new StringB();
		String sret = obj.RemoveWhiteSpace(name);
		System.out.println("Result is : "+ sret);
}
}
