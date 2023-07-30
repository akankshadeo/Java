//Accept two strings and compare them

import java.util.*;

class StringX
{

    public String StrUpper(String str)
    {
        char[] Arr = str.toCharArray();

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt] + 32);
            }
            else
            {
                Arr[iCnt] = Arr[iCnt];
            }
        }

        return new String(Arr);

    }

    public String Reverse (String str)
    {

        String Crr = StrUpper(str);

        char[] Drr = Crr.toCharArray();

        int iStart = 0;
		int iEnd = Drr.length-1;
		
		char cTemp = ' ';
		
		while (iStart < iEnd)
		{
			cTemp = Drr[iStart];
			Drr[iStart] = Drr[iEnd];
			Drr[iEnd] = cTemp;
			
			iStart++;
			iEnd--;
		}

        return new String(Drr);
    }

    public boolean Palindrome(String str)
    {
        String Brr = Reverse(str);
        int iCnt = 0;

        for (iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if (str.charAt(iCnt) != Brr.charAt(iCnt))
            {
                break;
            }
        }

        if (str.length() == iCnt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

public class prblm375 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String stg = sobj.nextLine();
        
        StringX obj = new StringX();
        String str1 = obj.StrUpper(stg);
        String str2 = obj.Reverse(stg);
        boolean bRet = obj.Palindrome(str1);
        if (bRet == true)
        {
            System.out.println("String is palindrome.");
        }
        else
        {
            System.out.println("String is not palindrome.");          
        }
    }
    
}
