//Reverse the string

import java.util.Scanner;

class StringC
{
	public String Reverse (String str)
	{
		char Arr[] = str.toCharArray();
		
		int iStart = 0;
		int iEnd = Arr.length-1;
		
		char cTemp = ' ';
		
		while (iStart < iEnd)
		{
			cTemp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = cTemp;
			
			iStart++;
			iEnd--;
		}
		return new String(Arr);
	}
}

public class program234 {
	
public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sobj.nextLine();
		
		StringC obj = new StringC();
		String sret = obj.Reverse(name);
		System.out.println("Result is : "+ sret);
}
}

