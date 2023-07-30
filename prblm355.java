//Accept a number from user and count number of digits between 3 and 7

import java.util.*;

class Digits
{
    public int CountDiff(int ivalue)
    {
        int iDigit = 0;
        int EvenSum = 0;
        int OddSum = 0;
        int iDiff = 0;

        while(ivalue != 0)
        {
            iDigit = ivalue % 10;
            if(iDigit % 2 == 0)
            {
                EvenSum = iDigit + EvenSum;
            }
            if(iDigit % 2 != 0)
            {
                OddSum = iDigit + OddSum;
            }
            ivalue = ivalue/ 10;
        }

        iDiff = EvenSum - OddSum;

        return iDiff;
    }
}

public class prblm355 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDiff(ino);

        System.out.println("Diff between sum of even and odd digits : "+ iRet);
    }
    
}
