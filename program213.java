//Factorial(approach 3)

import java.util.*;

class Numbers
{
    public int Factorial(int ivalue)
    {
         int iMult = 1;
		
		for (int iCnt = 1; iCnt <= ivalue; iCnt++)
		{
			iMult = iMult * iCnt;
		}
		
		return iMult;

    }

}

public class program213 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number: ");
    int ino = sobj.nextInt();

    Numbers nobj = new Numbers();

    int iRet = nobj.Factorial(ino);

    System.out.println("Factorial is : " + iRet);

        
    }
    

	
    
}
