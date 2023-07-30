import java.util.Scanner;

public class program228{
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter your name: ");
		String name = sobj.nextLine();
		
		System.out.println("Your name is : " + name);
		
		System.out.println("Length of string is: " + name.length());
		
		char str[] = name.toCharArray();
		
		for (int iCnt = 0; iCnt < name.length(); iCnt++)
		{
			System.out.println(name.charAt(iCnt));
		}
		
		}
}
