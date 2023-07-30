//accept array from user and create array with sum of its digits

import java.util.*;

class ArrayX
{
	public int Arr[];
    public int Brr[];
	
	public ArrayX(int iSize)            //Parameterized Constructor
	{
		Arr = new int [iSize]; 
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

    public void SumArray()
    {
        Brr = new int [Arr.length];

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            int iDigit = 0;
            int iSum = 0;
            while(Arr[iCnt] != 0)
            {
                iDigit = Arr[iCnt] % 10;
                iSum = iSum + iDigit;
                Arr[iCnt] = Arr[iCnt]/10;
            }
            Brr[iCnt] = iSum;
        }

        System.out.println(Arrays.toString(Brr));
    }

}
 


public class program462 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
        aobj.SumArray();
	}

}
