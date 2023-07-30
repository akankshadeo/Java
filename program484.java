//accept matrix from user and display its swap rows

import java.util.*;

class Matrix
{
    public int Arr [] [];

    public Matrix(int i, int j)
    {
        Arr = new int [i] [j];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements : ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    public void Display()
        {
            System.out.println("Elements of matrix are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        } 

        }

    public boolean ChkIdentity(int iRow,int iCol)
    {
        if (iRow != iCol)
        {
            return false;
        }

        for (int i = 0; i < Arr.length; i++)
        {
            for (int j = 0; j < Arr[i].length; j++) 
            {
                if (i == j) 
                {
                    if (Arr[i][j] != 1) 
                    {
                        return false;
                    }
                } 
                else 
                {
                    if (Arr[i][j] != 0) 
                    {
                        return false;
                    }
                }
            }

        }

        return true;
    }
}

public class program484
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter number of rows: ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();
        boolean bRet = mobj.ChkIdentity(iRow,iCol);

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
