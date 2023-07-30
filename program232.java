//Remove white spaces

import java.util.Scanner;

class StringA
{
	public String RemoveWhiteSpace(String str)
	{
		char Arr[] = str.toCharArray();
		String output = " ";
		
		char Brr[] = new char [Arr.length];
		
		int i =0;
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if (Arr[iCnt] != ' ')
			{
				output = output + Arr[iCnt];
			}
		}
		return new String (Brr);
	}
	
}

public class program232 {
	
public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sobj.nextLine();
		
		StringA obj = new StringA();
		String sret = obj.RemoveWhiteSpace(name);
		System.out.println("Result is : "+ sret);
}
}
