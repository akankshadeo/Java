//Accept n numbers from user and also no and check if no is present in array

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX (int iSize)
    {
        Arr = new int [iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of array : ");

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public boolean CheckNo(int value)
    {
        int iCnt = 0;

        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] == value)
            {
                break;
            }
        }

        if(iCnt == Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

public class prblm361 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the number to check: ");
        int ino = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Display();
        boolean bRet = aobj.CheckNo(ino);

        if (bRet == true)
        {
            System.out.println(ino + " is present in array.");
        }
        else
        {
            System.out.println(ino + "is not present in array.");
        }
	
    }
    
}
