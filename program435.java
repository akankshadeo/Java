//check if two arrays are pallindrome

import java.util.*;

class ArrayX
{
	public int Arr[];
    public int Brr[];
    public int temp[];
	
	public ArrayX(int iSize)            //Parameterized Constructor
	{
		Arr = new int [iSize]; 
        temp = new int [iSize];           //will create the array		
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}

	}

    public void tempp(int iSize)
    {
        System.arraycopy(Arr,0,temp,0,iSize);
    }

    public void RevElements()
    {
        Brr = new int [Arr.length];

        for (int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            int iDigit = 0;
            int Rev = 0;
            while(Arr[iCnt] != 0)
            {
                iDigit = Arr[iCnt] % 10;
                Rev = Rev  * 10 + iDigit;
                Arr[iCnt] = Arr[iCnt]/10;
            }
            Brr[iCnt] = Rev;
        }
     
    }

    public void CopyArrayRev()
    {
        int iStart = 0;
		int iEnd = Brr.length - 1;
		int temp = 0;

		while(iStart < iEnd)
		{
			temp = Brr[iStart];
			Brr[iStart] = Brr[iEnd];
			Brr[iEnd] = temp;

			iStart++;
			iEnd--;
		}

    }

    public boolean ChkPallindrome()
    {
        String A = Arrays.toString(temp);
        String B = Arrays.toString(Brr);

        if(A.equals(B))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
}

public class program435 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
        aobj.tempp(iSize);
        aobj.RevElements();
		aobj.CopyArrayRev();
        boolean bRet = aobj.ChkPallindrome();

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

	}

}
