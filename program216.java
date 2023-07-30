//Multiplication of even factors

import java.util.Scanner;

class Numbers3
{
	public int EvenFact (int iValue)
	{
         int iMult = 1;
		
		for (int iCnt = 2; iCnt <= iValue; iCnt = iCnt + 2)   //iCnt+=2
		{
			if ((iValue % iCnt) == 0)
               {
					iMult = iMult * iCnt;
				}			
		}
		if (iMult == 1)
		{
			return 0;
		}
		else
		{
			return iMult;
		}
	}

	
}

public class program216 
{
		
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number : ");
		int iNo= sobj.nextInt();
		
		Numbers3 nobj = new Numbers3();
		
		int iRet = nobj.EvenFact(iNo);
	
		System.out.println("Factorial is : " + iRet);	
	}

}
