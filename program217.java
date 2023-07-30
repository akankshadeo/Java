//Count number of digits

import java.util.Scanner;

class Digits
{
	public int CountDigit (int iValue)
	{
         int iCount = 0;     
         while (iValue != 0)
         {
        	 iCount++;
        	 iValue = iValue / 10;      	 
         }
     	return iCount;

	}	
}

public class program217 
{
		
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number : ");
		int iNo= sobj.nextInt();
		
		Digits dobj = new Digits();
		
		int iRet = dobj.CountDigit(iNo);
	
		System.out.println("Number of Digits are : " + iRet);	
}

}
