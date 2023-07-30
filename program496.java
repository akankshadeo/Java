import java.util.*;

class Pattern
{
    public void Pattern1(int ino)
    {
        int iDigit =0;

        while (ino != 0)
        {
            iDigit = ino % 10;
            System.out.print(iDigit + " ");
            for (int iCnt = 0; iCnt < iDigit ; iCnt++)
            {
                System.out.print("#" + " ");
            }        
            System.out.print("\n");    
            ino = ino / 10;
        }

    }

}

public class program496 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(ino);
    }
    
}
