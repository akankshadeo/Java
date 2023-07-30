//H e l l o
//H e l l 
//H e l 
//H e 
//H

import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, int iCol, String str)
    {
        int i = 0;
        int j = 0;
        int iCnt = 0;
        
        char [] Arr = str.toCharArray();

        for (i = iRow; i >= 1; i--)
        {
            for (j = 0; j < i; j++)
            {
                System.out.print(Arr[j] + "\t");
            }

            System.out.print("\n");
        }

    }

}


public class prblm402 {

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
