//Accept two strings and compare them

import java.util.*;

class StringX
{
    public String ReverseToggle (String str)
    {
        char[] Arr = str.toCharArray();

        int iStart = 0;
		int iEnd = Arr.length-1;
		
		char cTemp = ' ';
		
		while (iStart < iEnd)
		{
			cTemp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = cTemp;
			
			iStart++;
			iEnd--;
		}


        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if ((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
			{
				Arr[iCnt] = (char) (Arr[iCnt] - 32);
			}
			else if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
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

}

public class prblm374 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String stg = sobj.nextLine();
        
        StringX obj = new StringX();
        String sRet = obj.ReverseToggle(stg);
        System.out.println("The result string is:" + sRet);
        
    }
    
}
