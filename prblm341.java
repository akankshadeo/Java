//Accept n elements from user and return diff between sum of even and odd numbers

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    } 

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are: ");
        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
    }

    public int EvenSum()
    {
        int iSum = 0;

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSum = iSum + Arr[iCnt];
            }
        }

        return iSum;

    }

    public int OddSum()
    {
        int iSum = 0;

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] % 2 != 0)
            {
                iSum = iSum + Arr[iCnt];
            }
        }

        return iSum;
    }

    public int DiffOfSum()
    {
        int iSum1 = 0;
        iSum1 = EvenSum();
        int iSum2 = 0;
        iSum2 = OddSum();
        int iDiff = 0;

        iDiff = iSum1 - iSum2;

        return iDiff;

    }
}
public class prblm341 {

    public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Display();
        int iRet1 = aobj.DiffOfSum();
		System.out.println("\nDifference is : " + iRet1);
	}
    
}
