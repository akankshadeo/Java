//Accept n numbers from user and return its first occurance

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

    public int CheckNo(int value)
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
            return -1;
        }
        else
        {
            return iCnt + 1;
        }
    }
}

public class prblm362 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the number to check: ");
        int ino = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Display();
        int iRet = aobj.CheckNo(ino);

        System.out.println("The position of number in array is : "+ iRet);
        
	
    }
    
}
