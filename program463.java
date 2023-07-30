//create char array and count its capital chars

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

	public int ArrayCapital()
	{
        int iCount = 0;
		for (int iCnt = 0; iCnt < Arr.length;iCnt++)
		{
			if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
			{
				iCount++;
			}
		}

        return iCount;
	}
}

public class program463 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		int iRet = aobj.ArrayCapital();

        System.out.println("The count of capital letters in array is : "+ iRet);
	}

}
