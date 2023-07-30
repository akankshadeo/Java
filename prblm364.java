//Accept n numbers from user and start and end of range and return numbers between the range

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

    public void Range(int istart, int iend)
    {
        System.out.println("Numbers of array between range " + istart+ " & " + iend + " are: ");
        int iCnt = 0;
        
        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if ((Arr[iCnt] > istart) && (Arr[iCnt] < iend))
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

public class prblm364 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the start of range: ");
        int istart = sobj.nextInt();
        System.out.println("Enter the end of range: ");
        int iend = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Display();
        aobj.Range(istart, iend);        
    }
    
}
