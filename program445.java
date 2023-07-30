// 8 9 7 6 4 2 4
// * * * * * * * *
//* * * * * *
//* * * * 
//* * 
//* * * * 

import java.util.*;

class ArrayX
{
	public int Arr[];
	
	public ArrayX(int iSize)            //Parameterized Constructor
	{
		Arr = new int [iSize];            //will create the array		
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
	}

	public void Pattern()
	{
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if (Arr[iCnt] % 2 == 0)
			{
				for (int iCnt1 = 0; iCnt1 < Arr[iCnt]; iCnt1++)
				{
					System.out.print('*');
				}
				System.out.print("\n");
			}
		}
        
	}
}

public class program445 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
        
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Pattern();
	}

}
