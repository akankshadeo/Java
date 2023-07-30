//Accept two arrays from user and display diff between their sum

import java.util.*;

class ArrayX
{

    public void MinArray(int Arr[], int Brr[])
    {
        int iMin1 = 0;
        int iMin2 = 0;

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iMin1 = Arr[0];
            if (iMin1 > Arr[iCnt])
            {
                iMin1 = Arr[iCnt];
            }
        }

        for (int iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iMin2 = Brr[0];
            if (iMin2 > Brr[iCnt])
            {
                iMin2 = Brr[iCnt];
            }  
             
        }

        System.out.println(iMin1 + " " + iMin2);
    }
}

public class program432 {
    
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
        aobj.MinArray(Arr,Brr);        
    }
}
