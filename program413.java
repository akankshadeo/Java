//H # # # #
//H e # # #
//H e l # #
//H e l l #
//H e l l o

import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol, String str)
    {
        int i = 0;
        int j = 0;
        int iCnt = 0;
        
        char [] Arr = str.toCharArray();

        for (i = 1; i <= iRow; i++)
        {
            for (j = 0; j < iCol; j++)
            {
                if ((i > j))
                {
                    System.out.print(Arr[j] + "\t");
                }
                else
                {
                    System.out.print("#" + "\t");
                }
            }

            System.out.print("\n");
        }

    }

}


public class program413 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sobj.nextLine();
        System.out.println("Enter number of rows: ");
        int iRow = sobj.nextInt();
        System.out.println("Enter number of columns: ");
        int iCol = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Pattern1(iRow,iCol,str);

    }
    
}
