//String Operations

import java.util.Scanner;

class StringX
{
	public String StrLower(String str)
	{
		//Step1 : Convert String to array
		char[] Arr = str.toCharArray();
		
		//Step2 : Perform operations on array
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
			{
				Arr[iCnt] = (char) (Arr[iCnt] + 32);
			}
		}
		
		//Step 3: Convert array to string
		
		String ret = new String(Arr);
		
		return ret;
	}
	
	public String StrUpper(String str)
	{
		//Step1 : Convert String to array
		char[] Arr = str.toCharArray();
		
		//Step2 : Perform operations on array
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if ((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
			{
				Arr[iCnt] = (char) (Arr[iCnt] - 32);
			}
		}
		
		//Step 3: Convert array to string
		
		return new String (Arr);
	}
	
	public String StrToggle(String str)
	{
		//Step1 : Convert String to array
		char[] Arr = str.toCharArray();
		
		//Step2 : Perform operations on array
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if ((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
			{
				Arr[iCnt] = (char) (Arr[iCnt] - 32);
			}
			else if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
			{
				Arr[iCnt] = (char) (Arr[iCnt] + 32);
			}
			else
			{
				Arr[iCnt] = Arr[iCnt];
			}
		}
		
		//Step 3: Convert array to string
		
		String ret = new String(Arr);
		
		return ret;
	}

	
	
	
}

public class program230 {
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sobj.nextLine();
		
		StringX obj = new StringX();
		String sret = obj.StrLower(name);
		System.out.println("Converted string is : " + sret);
		
        String sret1 = obj.StrUpper(name);
		System.out.println("Converted string is : " + sret1);
		
        String sret2 = obj.StrToggle(name);
		System.out.println("Converted string is : " + sret2);
		
		
}
}
