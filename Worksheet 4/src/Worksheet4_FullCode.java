import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017 - Worksheet 4 Full Code

public class Worksheet4_FullCode
{
	static Node headPoint = null;
	static Node headPoint2 = null;
	
	Node head;
	Node tail;
	
	static Node mergedNode;
	
	static Node head1;

	static Node head2;
	
	class Node 
	{
	  int value;
	  Node next;
	  Node prev;
	  
	  Node (int value)
	  {
		  this.value = value;
		  next = null;
		  prev = null;
	  }
	}
	
	public void printList(Node node)
    {
        Node tempNode = node;
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
	
	public Node InsertList2(Node head, int value, int index)
	{
		Node newNode = new Node(value);
		
		if (headPoint2 == null)
		{
			headPoint2 = newNode;
		}
		
		else
		{
			Node tempNode = headPoint2;
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
		
		return headPoint2;
	}
	
	
	public int getLength() // getLength method that will calculate the size of the linked list. It's a helper method to use in other methods.
	{
		Node tempNode = headPoint;
		
		int counter = 0;
		
		while (tempNode != null)
		{
			counter++;
			tempNode = tempNode.next;
		}
		
		return counter;
	}
	
	
	public void FrontBackSplit(Node list) // Part 1 Exercise 1 FrontBackSplit() Method to split the given linked list from front and back in two parts.
	{
	    Node tempNode = list.next;
	 
	    while (tempNode != null) {
	    	tempNode = tempNode.next;
	        if (tempNode == null) break;
	        tempNode = tempNode.next;
	        list = list.next;
	    }
	 
	    head1 = headPoint;
	    
	    head2 = list.next;
	    
	    list.next = null;

	}
	
	
	public void RemoveDuplicates() // Part 1 Exercise 2 RemoveDuplicates() Method to remove same values in given linked list which are duplicated.
	{
		Node tempNode = headPoint;
		
		while (tempNode.next != null)
		{
			if (tempNode.value == tempNode.next.value)
			{
				Node nextNode = tempNode.next.next;
				tempNode.next = nextNode;
			}
			
			else 
			{
				tempNode = tempNode.next;
			}
			
		}
	}
	
	
	public void AlternatingSplit() // Part 1 Exercise 3 AlternatingSplit() Method to split it in two parts, include one is even, other is odd indexes.
	{
		Node tempNode = headPoint;
		
		head1 = tempNode;
		head2 = tempNode.next;
		
		if (tempNode == null || tempNode.next == null)
		{
			return;
		}
		
		while (tempNode != null && tempNode.next != null)
		{
			Node nextNode = tempNode.next;
			
			tempNode.next = nextNode.next;
			
			if (tempNode.next != null && tempNode.next.next != null)
			{
				nextNode.next = tempNode.next.next;
			}
			
			else
			{
				nextNode.next = null;
				return;
			}
			
			tempNode = tempNode.next;
		}
	}
	
	public Node SortedMerge(Node node1, Node node2) // Part 1 Exercise 4 SortedMerge() Method to merge 2 lists which are in increased order already and merged one too.
	{
		Node mergedNode = null;
		
		if (node1 == null)
		{
			return node2;
		}
		
		if (node2 == null)
		{
			return node1;
		}
		
		if (node1.value <= node2.value)
		{
			mergedNode = node1;
			mergedNode.next = SortedMerge(node1.next, node2);
		}
		
		else
		{
			mergedNode = node2;
			mergedNode.next = SortedMerge(node1, node2.next);
		}
		
		return mergedNode;
	}
	
	
	public void doublyInsert(int value) // Part 2 Doubly Linked list insert method that will print previous values while adding new value to end (added in Node class) 
	{
		Node newNode = new Node(value);
		
		if (headPoint == null)
		{
			headPoint = tail = newNode;
			
			headPoint.prev = null;
			
			tail.next = null;
		}
		
		else
		{
			tail.next = newNode;
			
			newNode.prev = tail;
			
			tail = newNode;
			
			tail.next = null;
		}
	}
	
	
	public void printReverse(Node node) // Part 2 Exercise 1 printReverse() Method to print a linked list in a reversed order.
	{
		Node tempNode = node;
		
		if (tempNode.next == head)
		{
			System.out.print(tempNode.value + " ");
			return;
		} 
		
		printReverse(tempNode.next);
		System.out.print(tempNode.value + " ");
	}
	
	public Node reverseList(Node node) // Return type of reverseList that will return as Node and it will be used in checkPalindrome() to check normal order and reversed order.
	{
		Node tempNode = node;
		
		Node prev = null;
		Node next = null;
		
		while (tempNode != null)
		{
			next = tempNode.next;
			tempNode.next = prev;
			
			prev = tempNode;
			tempNode = next;
		}
		
		return prev;
	}
	
	
	public void checkPalindrome(Worksheet4_FullCode list) // Part 2 Exercise 2 checkPalindrome() Method to check if a linked list is palindrome or not.
	{
		Node tempNode = headPoint;
		
		boolean isPal = true;
		
		int mid;
		
		int length = list.getLength();
		
		if ((length % 2 == 0))
		{
			mid = (length / 2);
		}
		
		else 
		{
			mid = ((length + 1) / 2);
		}
		
		for (int i = 1; i<mid; i++)
		{
			tempNode = tempNode.next;
		}
		
		Node reversedList = list.reverseList(tempNode.next); // reversedList is storing thanks to reverseList() Return type method which is above.
		
		while (headPoint != null && reversedList != null)
		{
			if (headPoint.value != reversedList.value)
			{
				isPal = false;
				break;
			}
			
			headPoint = headPoint.next;
			reversedList = reversedList.next;
		}
		
		if(isPal)
		{
			System.out.println("\nGiven linked list is a PALINDROME\n");
		}
		
		else 
		{
			System.out.println("\nGiven linked list is 'NOT' a Palindrome\n");
		}
		
		
	}

	
	
	public static void main(String[] args) 
	{
		Worksheet4_FullCode list = new Worksheet4_FullCode();
		
		Worksheet4_FullCode list2 = new Worksheet4_FullCode();
	
		Scanner scn = new Scanner(System.in);
		
		String isDoubly;
		
		String isReverse;
		
		int value = 0;
		int index = 0;
		
		int value2 = 0;
		int index2 = 0;
		
		int operation;
		
		do {
			System.out.print("\nEnter 1 to insert | 2 to print the list | 3 to split from front and back | 4 to remove duplicates | 5 to split alternatingly | 6 to merge two sub lists | 7 to check if palindrom or not | -1 to exit: ");
			operation = scn.nextInt();
			
			switch (operation) 
			{
			
			case 1: 
			{
				System.out.println("\nIs Doubly? If yes, write Yes, otherwise write No: ");
				isDoubly = scn.next();
				
				if (isDoubly.toLowerCase().equals("yes"))
				{
					System.out.println("\nEnter value to add to end of the list: ");
					list.printList(headPoint);
					
					value = scn.nextInt();
					
					list.doublyInsert(value);
					break;
				}
				
				if (isDoubly.toLowerCase().equals("no"))
				{
					System.out.print("\nEnter the value: ");
					value = scn.nextInt();
					
					System.out.print("\nEnter the index to place the value: ");
					index = scn.nextInt();
					
					headPoint =  list.InsertList(headPoint, value, index);
					
					break;
				}
				
				else 
				{
					System.out.println("\nInvalid answer is written!");
					break;
				}
				
			}
			
			case 2: 
			{
				System.out.println("\nIs Reverse Printing or Not ? If yes, write Yes, otherwise write No: ");
				isReverse = scn.next();
				
				if (isReverse.toLowerCase().equals("yes"))
				{
					System.out.println("\nNot Reversed list as created: ");
					list.printList(headPoint);
					
					System.out.println("");
					
					System.out.println("\nReversed list with the given inputs: ");
					list.printReverse(headPoint);
				
					System.out.println("");
					break;
				}
				
				if (isReverse.toLowerCase().equals("no"))
				{
					System.out.println("\nCreated list according to given inputs: ");
					list.printList(headPoint);
					
					System.out.println("");
				
					break;
				}
				
				else 
				{
					System.out.println("\nInvalid answer is written!");
					break;
				}
			}
			
			case 3:
			{
				list.FrontBackSplit(headPoint);
				
				System.out.println("\nFront Part of Split Linked List:");
				list.printList(head1);
				
				System.out.println("\nBack Part of Split Linked List:");
				list.printList(head2);
				
				break;
				
				
			}
			
			case 4:
			{
				System.out.println("\nBefore Removing Duplicates: ");
				list.printList(headPoint);
				
				System.out.println("\n\nAfter Removing Duplicates: ");
				list.RemoveDuplicates();
				list.printList(headPoint);
				
				System.out.println("");
				
				break;
			}
			
			case 5:
			{
				System.out.println("\nBefore Alternating Split is Applied:");
				list.printList(headPoint);
				
				System.out.println("\nAfter Alternating Split is Applied:");
				list.AlternatingSplit();
				
				list.printList(head1);
				System.out.println("\n");
				list.printList(head2);
				
				break;
			}
			
			case 6:
			{
				list.InsertList(headPoint, 1, 0);
		        list.InsertList(headPoint, 3, 1);
		        list.InsertList(headPoint, 5, 2);
		        
		        list2.InsertList2(headPoint2, 2, 0);
		        list2.InsertList2(headPoint2, 4, 1);
		        
		        
		        System.out.println("\nFirst List: ");
		        list.printList(headPoint);
		        
		        System.out.println("");
		        
		        System.out.println("\nSecond List: ");
		        list2.printList(headPoint2);
		        
		        mergedNode = new Worksheet4_FullCode().SortedMerge(list.headPoint, list2.headPoint2);
		        
		        System.out.println("\nMerged & Sorted List 1 and List 2");
		        list.printList(mergedNode);
		        
		        System.out.println("");
		        
		        break;
				
			}
			
			case 7:
			{
				System.out.println("\nCreated list according to given inputs: ");
				list.printList(headPoint);
				
				System.out.println("");
				
				System.out.println("\nReverse of the created list: ");
				list.printReverse(headPoint);
				
				System.out.println("");
				
				list.checkPalindrome(list);
				
				break;
			}
			
			}
			
		} while (operation != -1);

	}

}
