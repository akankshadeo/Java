//Factorial approach 1

import java.util.*;

public class program211 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        int ino = sobj.nextInt();

        int iMult = 1;
        for (int iCnt = 1; iCnt <= ino; iCnt++)
        {
            iMult = iMult * iCnt;
        }

        System.out.println("Factorial is : "+ iMult);
    }
}
