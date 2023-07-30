//Accept two strings and concat them 

import java.util.*;

class StringX
{
    public void StrCatX(String src, String dest, int value)
    {
        char[] Arr = src.toCharArray();
        char[] Brr = dest.toCharArray();

        for (int iCnt = 0; iCnt <= Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }

        for (int iCnt = 0; iCnt < value; iCnt++)
        {
            System.out.print(Brr[iCnt]);
        }


    }
}

public class prblm371 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String str1 = sobj.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sobj.nextLine();
        System.out.println("Enter the size of second string :");
        int ino = sobj.nextInt();

        StringX obj = new StringX();
        obj.StrCatX(str1,str2,ino);
    }
    
}
