import java.util.Scanner;

//Adem Anil Yalimdemir - 180201017

public class Worksheet3_FullCode 
{
	static Node headPoint = null;
	
	Node sortedNode;
	
	Node head;
	
	class Node 
	{
	  int value;
	  Node next;
	  
	  Node (int value)
	  {
		  this.value = value;
		  next = null;
	  }
	}
	
	public void printList()
    {
        Node tempNode = headPoint;
        while (tempNode != null) {
            System.out.print(tempNode.value + " ");
            tempNode = tempNode.next;
        }
    }	
	
	
	public Node InsertList(Node head, int value, int index)
	{
		Node newNode = new Node(value);
		
		if (headPoint == null)
		{
			headPoint = newNode;
		}
		
		else
		{
			Node tempNode = headPoint;
			int checker = 0;
			
			while (checker < index - 1)
			{
				tempNode = tempNode.next;
				
				if (tempNode == null)
				{
					System.out.println("\nInvalid index!");
					break;
				}
				checker++;
			}
			
			newNode.next = tempNode.next;
			tempNode.next = newNode;

		}
		
		return headPoint;
	}
	
	
	public Node DeleteList(Node head, int value)
	{
		Node tempNode = headPoint;
		Node tempMemory = headPoint;
		
		int missingIndex = 0;
		
		while (tempNode != null)
		{
			if (tempNode.value == value)
			{
				missingIndex = 1;
				tempMemory.next = tempNode.next;
				break;
			}
			
			else
			{
				tempMemory = tempNode;
			}
			
			tempNode = tempNode.next;
		}
		
		if (missingIndex == 0)
		{
			System.out.println("\nIndex could not found!");
		}
		
		return headPoint;
	}
	
	public int GetElementAtPosition(Node head, int index)
	{
		int count = 0;
		
		if (head == null)
		{
			System.out.println("\nInvalid index!");
		}
		
		if (count == index)
		{
			return head.value;
		}
		
		return GetElementAtPosition(head.next, index-1);
	}
	
	
	public int GetPositionOfElement(Node head, int value)
	{
		Node tempNode = head;
		
		int count = 0;
		
		if (head == null)
		{
			System.out.println("\nList is empty!");
		}
		
		else 
		{
			while (tempNode != null)
			{
				if (tempNode.value == value)
				{
					return count;
				}
				
				count++;
				
				tempNode = tempNode.next;
			}
		}
		
		return count;
	}
	
	public void InsertBeforeSort(Node newNode)
	{
		if (sortedNode == null || sortedNode.value >= newNode.value)
		{
			newNode.next = sortedNode;
			sortedNode = newNode;
		}
		
		else
		{
			Node tempNode = sortedNode;
			
			while (tempNode.next != null && tempNode.next.value < newNode.value)
			{
				tempNode = tempNode.next;
			}
			
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
		
	}
	
	
	public void SortedInsert(Node head)
	{
		sortedNode = null;
		Node tempNode = head;
		
		while (tempNode != null)
		{
			Node tempNextNode = tempNode.next;
			
			InsertBeforeSort(tempNode);
			
			tempNode = tempNextNode;
		}
		
		head = sortedNode;
	}
	
	

	public static void main(String[] args) 
	{
		Worksheet3_FullCode list = new Worksheet3_FullCode();
		
		Scanner scn = new Scanner(System.in);
		
		int value = 0;
		int index = 0;
		int operation;
		
		do {
			System.out.print("\nEnter 1 to insert | 2 to print the list | 3 to delete | 4 to search a value | 5 to search a index | 6 to sort the list |-1 to exit: ");
			operation = scn.nextInt();
			
			switch (operation) 
			{
			
			case 1: 
			{
				System.out.print("\nEnter the value: ");
				value = scn.nextInt();
				
				System.out.print("\nEnter the index to place the value: ");
				index = scn.nextInt();
				
				headPoint =  list.InsertList(headPoint, value, index);
				
				break;
			}
			
			case 2: 
			{
				System.out.println("\nCreated list acording to given input and index of it: ");
				list.printList();
				
				System.out.println("");
				
				break;
			}
			
			case 3:
			{
				System.out.println("\nEnter the value that you want to delete from list: ");
				value = scn.nextInt();
				
				headPoint = list.DeleteList(headPoint, value);
				System.out.printf("\nThe value %d has beeen deleted from the list.\n", value);
				
				break;
			}
			
			case 4:
			{
				System.out.println("\nEnter the index you want to get value of it: ");
				index = scn.nextInt();
				
				System.out.printf("\nThe value of index %d is %d\n", index, list.GetElementAtPosition(headPoint, index));
				
				break;
						
			}
			
			case 5:
			{
				System.out.println("\nEnter the value you want to get index of it: ");
				value = scn.nextInt();
				
				System.out.printf("\nThe index of value %d is %d\n", value, list.GetPositionOfElement(headPoint, value));
			}
			
			case 6:
			{
				System.out.println("\nBefore the sorting process of linked list: ");
				list.printList();
				
				System.out.println("");
				
				list.SortedInsert(headPoint);
				System.out.println("\nAfter the sorting process is applied: ");
				list.printList();
				
				System.out.println("");
			}
			
			
			}
			
		} while (operation != -1);

	}

}
