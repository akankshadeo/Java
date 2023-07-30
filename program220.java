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
    boolean CheckArmstrong (int iNo)
	{
		int iTemp = iNo;
		
		//Count number of digits
		int iCount = 0;
		
		while (iTemp != 0)
		{
			iCount++;
			iTemp = iTemp / 10;
		}
		
		iTemp = iNo;
        int iPower = 1;
		int iSum = 0;
		int iDigit = 0;
		int iCnt = 0;
		
		//logic to split number
		while (iNo != 0)
		{
			iDigit = iNo % 10;
		
		//Logic to calculate power
		for (iCnt = 1; iCnt <= iCount; iCnt++)
		{
			iPower = iPower * iDigit;
		}
		iSum = iSum + iPower;
		iPower = 1;
		iNo = iNo / 10;
		
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

public class program220 {
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
