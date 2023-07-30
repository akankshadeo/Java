import java.util.*;

class Pattern
{
    public void Pattern1(int ino)
    {
        int iCount = 0;
        int iDigit = 0;
        int itemp = ino;

        while (ino != 0)
        {
            iDigit = ino % 10;
            iCount++;
            ino = ino / 10;
        }

        int[] Arr = new int[iCount];

        for (int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
        while (itemp != 0)
        {
            iDigit = itemp % 10;
            Arr[iCnt] = itemp;
            System.out.println(Arr[iCnt]);
            itemp = itemp / 10;
        }
        }
    }
        

    }



public class program513 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(ino);
    }
    
}
