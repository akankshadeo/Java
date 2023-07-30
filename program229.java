//Count number of capital and small letters

import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCount = 0;
        int iCnt = 0;

        for (iCnt = 0; iCnt < str.length();iCnt++);
        {
            if((str.charAt(iCnt) >= 'a') && (str.charAt(iCnt) <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;
        int iCnt = 0;

        for (iCnt = 0; iCnt<Arr.length;iCnt++)
        {
            if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
			{
				iCount++;
			}
        }
        return iCount;
    }
}

public class program229 {
    public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sobj.nextLine();
		
		StringX obj = new StringX();
		int iRet = obj.CountSmall(name);
		System.out.println("Number of small characters: "+ iRet);
		
		iRet = obj.CountCapital(name);
		System.out.println("Number of capital characters: "+ iRet);
    }  
}
