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

        String str = Integer.toString(itemp);

        for (int i = 1; i<=iCount;i++)
        {
            for(int j = 0; j < i;j++)
            {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }

    }
        

    }



public class program514 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int ino = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(ino);
    }
    
}
