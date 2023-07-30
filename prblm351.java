//Accept a number from user and count the number of even digits

import java.util.*;

class Digits
{
    public int CountEven(int ivalue)
    {
        int iCount = 0;
        int iDigit = 0;

        while(ivalue != 0)
        {
            iDigit = ivalue % 10;
            if(iDigit % 2 == 0)
            {
                iCount++;
            }
            ivalue = ivalue/ 10;
        }

        return iCount;
    }
}

public class prblm351 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountEven(ino);

        System.out.println("Number of even digits in number is : "+ iRet);
    }
    
}
