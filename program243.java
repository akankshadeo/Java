//dynamically count number of words

import java.util.*;

public class program243 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s,", " ");
        str = str.trim();

        String arr[] = str.split(" ");

        System.out.println("Enter the word that you want to search: ");
        String Word = sobj.nextLine();

        int iFrequency = 0;
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if(arr[iCnt].equals("india"))
            {
                iFrequency++;
            }
        }

        System.out.println("Frequency of given word is : "+ iFrequency);
    }
    
}
