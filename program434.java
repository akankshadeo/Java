//copy one array in other array

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

	public void CopyArray()
	{
		int[] Brr = new int [Arr.length];

		System.out.println("The Brr Array is :");

		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Brr[iCnt] = Arr[iCnt];
		}

		System.out.println(Arrays.toString(Brr));
	}
}

public class program434 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.CopyArray();
	}

}
