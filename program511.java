import java.util.*;

class Pattern
{
    public void Pattern1(int ino)
    {
        int iDigit =0;
        int iCount = 0;
        int temp1 = ino;
        int temp2 = ino;

        while(ino != 0)
        {
            iDigit = ino % 10;
            iCount++;
            ino = ino / 10;
        }

        System.out.println(iCount);

        for (int iCnt = 0; iCnt < iCount; iCnt++)
        {
        while (temp1 != 0)
        {
            iDigit = temp1 % 10;
            System.out.print(iDigit + " ");        
            temp1 = temp1 / 10;
        }
        System.out.print("\n");
        temp1 = temp2;
        }
        

    }

}

public class program511 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(ino);
    }
    
}
