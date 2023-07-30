//create char array and display it in small chars

import java.util.*;

class ArrayX
{
	public char Arr[];
	
	public ArrayX(int iSize)            //Parameterized Constructor
	{
		Arr = new char [iSize];            //will create the array		
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.next().charAt(0);
		}
		
	}

	public void ArrayReplace()
	{
		System.out.println("The updated array is :");
		for (int iCnt = 0; iCnt < Arr.length;iCnt++)
		{
			if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
			{
				Arr[iCnt] = (char) (Arr[iCnt] + 32);
				System.out.println(Arr[iCnt]);
			}
			else 
			{
				System.err.println(Arr[iCnt]);
			}
		}
	}
}

public class program441 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.ArrayReplace();
	}

}
