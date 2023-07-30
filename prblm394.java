//* # * #
//* # * #
//* # * #
//* # * #

import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        char ch1 = '*';
        char ch2 = '#';

        for (i= 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if (j % 2 == 0)
                {
                   System.out.print(ch2 + "\t"); 
                }
                else
                {
                System.out.print(ch1 + "\t");
                }
            }

            System.out.print("\n");
        }

    }
}

public class prblm394 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int iRow = sobj.nextInt();
        System.out.println("Enter number of columns: ");
        int iCol = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(iRow,iCol);

    }
    
}
