//Reverse the string

import java.util.Scanner;

class StringX
{
    public String Reverse(String str)
    {
        char[] Arr = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length-1;

        char cTemp = ' ';

        cTemp = Arr[iStart];
        Arr[iStart] = Arr[iEnd];
        Arr[iEnd] = cTemp;

        iStart++;
        iEnd--;
    return new String(Arr);

    }
}

public class prblm335 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
      
        String sret = obj.Reverse(name);
        System.out.println("The reverse string is : "+ sret);


    }
    
    
}
