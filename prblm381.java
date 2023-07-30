//A B C D
//A B C D
//A B C D
//A B C D

import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        char ch = ' ';

        for (i= 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'A'; j <= iCol; j++, ch++)
            {
                System.out.print(ch + "\t");
            }

            System.out.print("\n");
        }

    }
}

public class prblm381 {

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
