//4 3 2 1
//4 3 2 1
//4 3 2 1
//4 3 2 1

import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        for (i= 1; i <= iRow; i++)
        {
            for(j = 1, k = iCol; j <= iCol; j++, k--)
            {
                System.out.print(k + "\t");
            }

            System.out.print("\n");
        }

    }
}

public class prblm393 {

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
