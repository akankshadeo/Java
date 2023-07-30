//Accept a number from user and count number of digits between 3 and 7

import java.util.*;

class Digits
{
    public int CountNo(int ivalue)
    {
        int iCount = 0;
        int iDigit = 0;

        while(ivalue != 0)
        {
            iDigit = ivalue % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iCount++;
            }
            ivalue = ivalue/ 10;
        }

        return iCount;
    }
}

public class prblm353 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountNo(ino);

        System.out.println("Number of digits between 3 and 7 is : "+ iRet);
    }
    
}
