//H e l l o
//H e l l o
//H e l l o
//H e l l o

import java.util.*;

class Pattern
{
    public void Pattern1(int iRow, String str)
    {
        int i = 0;
        int iCnt = 0;
        
        char [] Arr = str.toCharArray();

        for (i= 1; i <= iRow; i++)
        {
                for(iCnt = 0; iCnt < Arr.length; iCnt++)
                {
                    System.out.print(Arr[iCnt] + "\t");
                }
            System.out.print("\n");
        }

    }
}

public class prblm401 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sobj.nextLine();
        System.out.println("Enter number of rows: ");
        int iRow = sobj.nextInt();
        Pattern pobj = new Pattern();
        pobj.Pattern1(iRow,str);

    }
    
}
