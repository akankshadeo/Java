
import java.util.*;

class ArrayX
{
	public float Arr[];
	
	public ArrayX(int iSize)            //Parameterized Constructor
	{
		Arr = new float [iSize]; 
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		
		for (int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextFloat();
		}

	}

    public void Percentage()
    {
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if ((Arr[iCnt] <= 35.00) && (Arr[iCnt] > 0.00))
            {
                System.out.println(Arr[iCnt] + " Fail ");
            }
            else if ((Arr[iCnt] <= 50.00) && (Arr[iCnt] > 35.00))
            {
                System.out.println(Arr[iCnt] + " Pass Class ");
            }
            else if ((Arr[iCnt] <= 60.00) && (Arr[iCnt] > 50.00))
            {
                System.out.println(Arr[iCnt] + " Second Class ");
            }
            else if ((Arr[iCnt] <= 70.00) && (Arr[iCnt] > 60.00))
            {
                System.out.println(Arr[iCnt] + " First Class ");
            }
            else if ((Arr[iCnt] <= 100.00) && (Arr[iCnt] > 70.00))
            {
                System.out.println(Arr[iCnt] + " First class with Distinction ");
            }
            else
            {
                System.out.println(Arr[iCnt] + " Invalid Input ");
            }
        }
    }

}
 


public class program464 {
	
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter number of elements: ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		aobj.Accept();
        aobj.Percentage();
	}

}
