//Accept two arrays from user and display even elements them

import java.util.*;

class ArrayX
{

    public void SumArray(int Arr[], int Brr[])
    {
        int iSum1 = 0;
        int iSum2 = 0;

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum1 = iSum1 + Arr[iCnt];
        }

        for (int iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iSum2 = iSum2 + Brr[iCnt];
        }

        System.out.println(iSum1);
        System.out.println(iSum2);
    }
}

public class program425 {
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array 1 :");
        int isize1 = sobj.nextInt();
        System.out.println("Enter size of array 2 :");
        int isize2 = sobj.nextInt();

        int Arr[] = new int[isize1];
        int Brr[] = new int[isize2];
		
		System.out.println("Enter the elements for array1: ");
		
		for (int iCnt = 0; iCnt < isize1; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}

        System.out.println("Enter the elements for array2: ");
		
		for (int iCnt = 0; iCnt < isize2; iCnt++)
		{
			Brr[iCnt] = sobj.nextInt();
		}

        ArrayX aobj = new ArrayX();
        aobj.SumArray(Arr,Brr);        
    }
}
