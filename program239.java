//count words in a string
//India1is2my3country.

import java.util.*;

public class program239 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();
        System.out.println(str.length());

        if(str.length() == 0)
        {
            System.out.println("Number of words are : 0");  
            return;
        }     
        
        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        int iFrequency = 0;

        for (int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if (str.charAt(iCnt) == ' ')
            {
                iFrequency++;
            }
        }

        System.out.println("Number of words are : "+ (iFrequency+1));
    
    }
}
