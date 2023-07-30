//Reverse the array

import java.util.*;

public class program247 {

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();     

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String arr[] = str.split(" ");

        StringBuffer output = new StringBuffer();

        for(int iCnt = arr.length-1; iCnt >= 0; iCnt--)
        {
            StringBuffer sb = new StringBuffer(arr[iCnt]);
            output.append(sb.append(" "));
        }

        System.out.println(output);

    }
    
}
