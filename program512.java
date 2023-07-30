import java.util.*;

class Pattern
{
    public void Pattern1(int ino)
    {
        int iCount = 0;
        int iDigit =0;
        int Rev = 0;

        while (ino != 0)
        {
            iDigit = ino % 10;
            Rev = Rev * 10 + iDigit;
            iCount++;
            ino = ino / 10;
        }

        int temp1 = Rev;

        for (int iCnt = 0; iCnt < iCount; iCnt++)
        {
        while (Rev != 0)
        {
            iDigit = Rev % 10;
            System.out.print(iDigit + " ");        
            Rev = Rev / 10;
        }
        System.out.print("\n");
        Rev = temp1;
        }

    }

}

public class program512 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(ino);
    }
    
}
