//Accept two strings and compare them

import java.util.*;

class StringX
{
    public boolean StrCmp (String src, String dest)
    {
        if (src.length() != dest.length()) {
            return false;
        }

        // Compare characters of the strings
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) != dest.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

public class prblm372 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String str1 = sobj.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sobj.nextLine();
        
        StringX obj = new StringX();
        boolean bRet = obj.StrCmp(str1,str2);

        if (bRet == false)
        {
            System.out.println("Strings are not equal.");
        }
        else
        {
            System.out.println("Strings are equal.");
        }
    }
    
}
