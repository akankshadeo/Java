//Accept two arrays from user and display odd elements them

import java.util.*;

class ArrayX
{
    public int Arr[];
    public int Brr[];

    public ArrayX(int isize1, int isize2)
    {
        Arr = new int[isize1];
        Brr = new int[isize2];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of array1 : ");

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter elements of array2 : ");

        for (int iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }
    }

    public void Display(int arr1[], int arr2[])
    {   
        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] % 2 != 0)
            {
                System.out.print(Arr[iCnt] + "\t");
            }
        }
        System.out.print("\n");

        for (int iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if (Brr[iCnt] % 2 != 0)
            {
                System.out.print(Brr[iCnt] + "\t");
            }
        }
        System.out.print("\n");
        
    }
}

public class program423 {
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array 1 :");
        int isize1 = sobj.nextInt();
        System.out.println("Enter size of array 2 :");
        int isize2 = sobj.nextInt();

        ArrayX aobj = new ArrayX(isize1, isize2);
        aobj.Accept();
		aobj.Display(null, null);
        
    }
}
