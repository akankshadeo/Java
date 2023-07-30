//create char array and fount diff between count of small and capital chars

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

	public int Difference()
	{
        int iCount1 = 0;
        int iCount2 = 0;
        int Diff = 0;

		for (int iCnt = 0; iCnt < Arr.length;iCnt++)
		{
            if ((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount1++;
            }

            if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount2++;
            }
		}

        Diff = iCount2 - iCount1;

        return Diff;
	}
}

public class program444 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
        
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		int iRet = aobj.Difference();

        System.out.println("The difference between frequency is : " + iRet);
	}

}
