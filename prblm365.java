//Accept n numbers from user and return product of odd elements

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

    public int OddMult()
    {
        int iCnt = 0;
        int iMult = 1;
        
        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                  iMult = iMult * Arr[iCnt];
            }
        }

        return iMult;
    }
}

public class prblm365 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int iSize = sobj.nextInt();
        
        ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		aobj.Display();
        int iRet = aobj.OddMult();
        System.out.println("Multiplication of odd elements is : "+ iRet);        
    }
    
}
