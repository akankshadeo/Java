//Multiplication of even factors

import java.util.Scanner;

class Numbers
{
	public int EvenFact (int iValue)
	{
         int iMult = 1;
		
		for (int iCnt = 1; iCnt <= iValue; iCnt++)
		{
			if (iValue % iCnt == 0)
			{
				if (iCnt % 2 == 0)
				{
					iMult = iMult * iCnt;
				}			
			}
			
		}
		
		return iMult;
	}

	
}

public class program214 
{
		
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number : ");
		int iNo= sobj.nextInt();
		
		Numbers nobj = new Numbers();
		
		int iRet = nobj.EvenFact(iNo);
	
		System.out.println("Factorial is : " + iRet);	
	}

}
