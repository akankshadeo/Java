//Singly Linear Linked List

import java.util.*;

class Node
{
    public int data;
    public Node next;           //self referential class

    public Node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    public Node First;
    public int iCount;

    public SinglyLL()
    {
        this.First = null;
        this.iCount = 0;
    }

    public void Display()
    {
        System.out.println("The elements of Linked List are: ");

        Node temp = First;

        while(temp != null)
        {
            System.out.print(" | " + temp.data + "| -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void DisplayRev()
    {
        System.out.println("The elements of Linked List in reverse are : ");

        Node temp = First;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        System.out.print("null <=>");

        while(temp != null)
        {
            System.out.print(" | " + temp.data + "| -> ");
            temp = temp.next;
        }
        System.out.println("null");
    
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(First == null)
        {
            newn = First;
        }
        else
        {
            newn.next = First;
            First = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(First == null)
        {
            newn = First;
        }
        else
        {
            Node temp = First;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public void InsertAtPos(int no, int ipos)
    {
        int isize = Count();

        if (ipos < 1 || ipos > isize + 1)
        {
            System.out.println("Invalid position");
        }

        if(ipos == 1)
        {
            InsertFirst(no);
        }
        else if(ipos == isize+1)
        {
            InsertLast(no);
        }
        else
        {
            Node temp = First;

            for (int iCnt = 1; iCnt < ipos - 1; iCnt++)
            {
                temp = temp.next;
            }

            Node newn = new Node(no);
            newn.next = temp.next;
            temp.next = newn;
            iCount++;
        }
    }

    public void DeleteFirst()
    {
        if(iCount == 0)
        {
            return;
        }
        else if(iCount == 1)
        {
            First = null;
        }
        else
        {
            First = First.next;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(First == null)
        {
            return;
        }
        if(First.next == null)        {
            First = null;
        }
        else
        {
            Node temp = First;

            while(temp.next.next!= null)
            {
                 temp.next = temp; 
            }
            temp.next = null;
        }
        iCount--;
    }

    public void DeleteAtPos(int ipos)
    {
        int isize = Count();

        if (ipos < 1 || ipos > isize)
        {
            System.out.println("Invalid position");
        }

        if(ipos == 1)
        {
            DeleteFirst();
        }
        else if(ipos == isize)
        {
            DeleteLast();
        }
        else
        {
            Node temp = First;

            for (int iCnt = 1; iCnt < ipos - 1; iCnt++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            iCount--;
        }
    }

    



}

public class program283 {

    public static void main(String[] args) {

        SinglyLL obj = new SinglyLL();
        obj.InsertFirst(30);
        obj.InsertFirst(20);
        obj.InsertFirst(10);

        obj.InsertLast(40);
        obj.InsertLast(50);

        obj.Display();
        obj.DisplayRev();

        
    }
    
}
