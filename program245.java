//Reverse the string with help of function
//oeD yaniV ahsknakA

import java.util.*;

public class program245 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine(); 

        StringBuffer sbobj = new StringBuffer(str);
        
        sbobj = sbobj.reverse();

        System.out.println(sbobj);

    }
    
}
