//Accept n numbers from user and display number divisible by 11

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
        System.out.println("Enter elements of array : ");

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are: ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void Divisible()
    {
        System.out.println("The number divisible by 11 are : ");
        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] % 11 == 0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

public class prblm345 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();
        aobj.Display();
        aobj.Divisible();
    }
    
}
