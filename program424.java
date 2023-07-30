//Accept two arrays from user and concat them

import java.util.*;

class ArrayX
{
    public int[] ArrayConcate(int[] Arr, int isize1, int[] Brr, int isize2)
    {
        int [] Crr = new int[isize1 + isize2];

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Crr[iCnt] = Arr[iCnt];
        }
        for (int iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Crr[Arr.length + iCnt] = Brr[iCnt];
        }

        return Crr;
        
    }
}

public class program424 {
    
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
        int iRet[] = aobj.ArrayConcate(Arr,isize1,Brr, isize2 );

        System.out.println("The updated array is :" + (Arrays.toString(iRet)));
        
    }
}
