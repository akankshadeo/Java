//* * * * 
//* # * *
//* * $ *
//* * * *


import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for (i= iRow; i > 0; i--)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i == 1) || (i == iRow) || (iCol == j) || (j == 1))
                {
                    System.out.print('*' + "\t");
                }
                else if(i == j)
                {
                    System.out.print("*" + "\t"); 
                }
                else if(i > j)
                {
                    System.out.print("#" + "\t");
                }
                else
                {
                    System.out.print("$" +"\t");
                }
            }

            System.out.print("\n");
        }

    }
}

public class program454 {

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
