//Find word with max size

import java.util.*;

public class program244 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s,", " ");
        str = str.trim();

        String arr[] = str.split(" ");

        int iMax = 0;
        int iPos = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if (arr[iCnt].length() > iMax)
            {
                iMax = arr[iCnt].length();
                iPos = iCnt;
            }
        }

        System.out.println("Largest word is : "+arr[iPos]+ " with length : "+iMax);
    }
    
}
