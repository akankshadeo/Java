//Generic Root

import java.util.*;

class Digits
{
    public int GenericRoot(int ino)
    {
        int iSum = 0;
        int iDigit = 0;

        while(ino >= 10)
        {
            while (ino != 0)
            {
                  iDigit = ino % 10;
                  iSum = iSum + iDigit;
                  ino = ino / 10;
            }

            if (iSum >= 10)
            {
                ino = iSum;
                iSum = 0;
            }
            else
            {
                ino = iSum;
                break;
            }
        }

        return ino;
    }
}

public class program219 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter number : ");
        int ino = sobj.nextInt();

        Digits dobj = new Digits();
        
        int iRet = dobj.GenericRoot(ino);

        System.out.println("Generic Root: "+ iRet);
    }
    
}
