//Accept string from user and count capital letters

import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int iCount =0;

        //Convert string to array
        char[] Arr = str.toCharArray();
     
        //perform operations

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

public class prblm331
{

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);              //scanner obj

        System.out.println("Enter the string:");          //input
        String name = sobj.nextLine();

        StringX obj = new StringX();                         //class object
        int iRet = obj.CountCapital(name);
		System.out.println("Number of capital letters in string are : " + iRet);
    }
    
}
