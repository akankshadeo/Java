//Remove extra spaces
// My name    is     Akanksha.
//My name is Akanksha.

import java.util.*;

class program238
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ");

        str = str.trim();

        System.out.println("Updated string is: " + str);
    }
}