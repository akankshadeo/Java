//4 4 4 4
//3 3 3 3
//2 2 2 2
//1 1 1 1

import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        for (i= 1, k = iRow; i <= iRow; i++, k--)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(k + "\t");
            }

            System.out.print("\n");
        }

    }
}

public class prblm384 {

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
