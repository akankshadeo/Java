//1 2 3 4 5 
//1 2     5
//1   3   5
//1     4 5
//1 2 3 4 5


import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iCnt = 0;

        for (i= 1; i <= iRow; i++)
        {
            for(j = 1, iCnt = 1; j <= iCol; j++, iCnt++)
            {
                if((i == 1) || (i == iRow) || (iCol == j) || (j == 1) || (i==j))
                {
                    System.out.print(iCnt + "\t");
                }
                else
                {
                    System.out.print(" " + "\t");
                }
            }

            System.out.print("\n");
        }

    }
}

public class program455 {

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
