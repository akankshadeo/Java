/*Amstrong Number
 * 6 ^ 1 = 6
 * 3^3 + 7^3 + 1^3 = 371
 * 1^4 + 6^4 + 3^4 + 4^4 = 1634
 * no two digit amstrong numbber
 * 1634 371 92727 
 * Problems on Digits as well as Numbers
*/

import java.util.*;

class Digits
{
    int CountDigits(int ino)
    {
        int iCount = 0;

        while(ino != 0)
        {
            iCount++;
            ino = ino / 10;
        }
        return iCount;
    }

    int Power(int x, int y)
    {
        int iPower = 1;

        for (int iCnt = 1; iCnt <= y; iCnt++)
        {
            iPower = iPower * x;
        }

        return iPower;
    }

    boolean CheckArmstrong(int ino)
    {
        int iCount = 0;
        iCount = CountDigits(ino);

        int iTemp = 0;
        int iSum = 0;
        int iDigit = 0;
        int iRet = 0;

        while (ino != 0)
        {
            iDigit = ino % 10;
            iRet = Power(iDigit, iCount);
            iSum = iSum + iRet;
            ino = ino / 10;

        }

        if (iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class program221 {

    public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number : ");
		int iNo= sobj.nextInt();
		
		Digits dobj = new Digits();
		boolean bRet = dobj.CheckArmstrong(iNo);
		
		if (bRet == true)
		{
			System.out.println("Number is Amstrong.");
		}
		else
		{
			System.out.println("Number is not Amstrong");
		}
		
		
}


    
}
