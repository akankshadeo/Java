//Summation of all elements


import java.util.Scanner;

class ArrayX
{
	protected int Arr[];
	
	protected ArrayX(int iSize)            //Parameterized Constructor
	{
		Arr = new int [iSize];            //will create the array		
	}
	
	protected void Accept()
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
			 System.out.print(Arr[iCnt]+ "\t");
		 }
	}
}

class MyArray extends ArrayX
{
	public MyArray(int iSize)         //Constructor
	{
		super(iSize);
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

public class program226{
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		MyArray mobj = new MyArray(iSize);
		mobj.Accept();
		mobj.Display();
		System.out.println("Summation of all elements is : " + mobj.Summation());
	}
}
