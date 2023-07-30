//Sum of Digits

import java.util.*;

class Digits
{
    public int SumOfDigits(int ivalue)
    {
        if(ivalue < 0)
        {
            ivalue = -ivalue;
        }

        int iSum = 0;

        while (ivalue != 0)
        {
            iSum = iSum + (ivalue % 10);
            ivalue = ivalue / 10;
        }

        return iSum;
    }
}

public class program218 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number : ");
		int iNo= sobj.nextInt();
		
		Digits dobj = new Digits();
		
		int iRet = dobj.SumOfDigits(iNo);
	
		System.out.println("Sum of Digits is : " + iRet);	
}

        
    }
    

