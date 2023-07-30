//Count diff between frequency of small and capital letters

import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int iCount =0;

        char[] Arr = str.toCharArray();

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSmall(String str)
    {
        int iCount = 0;

        char[] Arr = str.toCharArray();

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if ((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
    
    public int CountDiff(String str)
    {
        int iDiff = 0;
        int iCapCount =0;
        iCapCount = CountCapital(str);
        int iSmallCount = 0;
        iSmallCount = CountSmall(str);

        iDiff = iSmallCount - iCapCount;

        return iDiff;
    }
}

public class prblm333 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
      
        int iRet = obj.CountDiff(name);
        System.out.println("The diff between frequency of small and capital letters is : "+ iRet);


    }
    
}
