import java.util.*;

class Pattern
{
    public void Pattern1(int ino)
    {
        int iDigit =0;
        int Rev = 0;

        while (ino != 0)
        {
            iDigit = ino % 10;
            Rev = Rev * 10 + iDigit;
            ino = ino / 10;
        }

        while(Rev != 0)
        {
            iDigit = Rev % 10;
            for (int iCnt = 0, i = iDigit; iCnt < iDigit ; iCnt++, i--)
            {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            Rev = Rev / 10;
        }

    }

}

public class program494 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(ino);
    }
    
}
