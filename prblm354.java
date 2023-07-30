//Accept a number from user and multiply the digits

import java.util.*;

class Digits
{
    public int Multiply(int ivalue)
    {
        int iDigit = 0;
        int iMult = 1;

        while(ivalue != 0)
        {
            iDigit = ivalue % 10;
            if (iDigit != 0)
            {
                iMult = iMult * iDigit;
            }
            ivalue = ivalue/ 10;
        }

        return iMult;
    }
}

public class prblm354 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.Multiply(ino);

        System.out.println("Multiplication of all digits is : "+ iRet);
    }
    
}
