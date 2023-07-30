//Check if vowel is present in string

import java.util.*;

class StringX
{
    public boolean ChkVowel(String str)
    {
        int iCnt = 0;
        char[] Arr = str.toCharArray();

        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
        if ((Arr[iCnt] == 'a') || (Arr[iCnt] == 'A')   ||
            (Arr[iCnt] == 'e') || (Arr[iCnt] == 'E')   ||
            (Arr[iCnt] == 'i') || (Arr[iCnt] == 'I')   ||
            (Arr[iCnt] == 'o') || (Arr[iCnt] == 'O')   ||
            (Arr[iCnt] == 'u') || (Arr[iCnt] == 'U')  )      
        {
            break;
        }
        }

        if (iCnt == Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

public class prblm334 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        boolean bRet = obj.ChkVowel(name);

        if (bRet == true)
        {
            System.out.println("Vowel present in string");
        }
        else
        {
            System.out.println("Vowel not present in string.");
        }
    }
}
