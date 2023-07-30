//1 2 3 4
//1 2 3 4
//1 2 3 4
//1 2 3 4

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
            for(j = 1, k = 1; j <= iCol; j++, k++)
            {
                System.out.print(k + "\t");
            }

            System.out.print("\n");
        }

    }
}

public class prblm392 {

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
