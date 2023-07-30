//create char array and take a char as input from user and count its frequency

import java.util.*;

class ArrayX
{
	public char Arr[];
	
	public ArrayX(int iSize)            //Parameterized Constructor
	{
		Arr = new char [iSize];            //will create the array		
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.next().charAt(0);
		}
		
	}

	public int Search(char ch)
	{
        int iCount = 0;
		for (int iCnt = 0; iCnt < Arr.length;iCnt++)
		{
            if ((ch >= 'a') && (ch <= 'z'))
            {
			if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt] + 32);
            }

            if(Arr[iCnt] == ch)
			{
                iCount ++;
            }
            }

            if ((ch >= 'A') && (ch <= 'Z'))
            {
			if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt] - 32);
            }

            if(Arr[iCnt] == ch)
			{
                iCount ++;
            }
            }


		}

        return iCount;
	}
}

public class program443 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
        System.out.println("Enter the char you want to find: ");
		char input = sobj.next().charAt(0);
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
		int iRet = aobj.Search(input);

        System.out.println("The frequency of " + input + " in array is : " + iRet);
	}

}
