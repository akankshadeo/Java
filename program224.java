//Find sum of elements of array

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
	
	public void Display()
	{
		 for (int iCnt = 0; iCnt < Arr.length ; iCnt++)
		 {
			 System.out.println(Arr[iCnt]);
		 }
	}
	
	public int Summation ()
	{
		int iSum = 0;
		
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			iSum = iSum + Arr[iCnt];
		}
		return iSum;
	}
	
}

public class program224 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Display();
		System.out.println("Summation of all elements is : " + aobj.Summation());
	}

}
