//Factorial (approach 2)

import java.util.*;

public class program212 {

    public static int Factorial(int ivalue)
    {
        int iMult = 1;

        for (int iCnt = 1; iCnt <= ivalue; iCnt++)
        {
            iMult = iMult * iCnt;
        }

        return iMult;
    }
    
    public static void main(String[] args) {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter number: ");
        int ino = sobj.nextInt();

        int iRet = Factorial(ino);

        System.out.println("Factorial is :" + iRet);

        
    }
}
