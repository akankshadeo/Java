//Count small letters in string

import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCount = 0;

        char[] Arr = str.toCharArray();

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if ((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }

}

public class prblm332 
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);              //scanner obj

        System.out.println("Enter the string:");          //input
        String name = sobj.nextLine();

        StringX obj = new StringX();                         //class object
        int iRet = obj.CountSmall(name);
		System.out.println("Number of capital letters in string are : " + iRet);
    }
}
