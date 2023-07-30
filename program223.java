//Create and Display Array

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
	
}

public class program223 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Display();
	}

}
