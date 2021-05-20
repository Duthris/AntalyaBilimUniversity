import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017 - Worksheet 6 - Full Code

public class Worksheet6_FullCode
{
	static class QueueNode
	{ 
		int capacity;
		int data;
		int size; 
		QueueNode next;
		QueueNode front;
		QueueNode rear;
		
		QueueNode()
		{
			size = 0;
			
			next = null;
			front = null;
			rear = null;
			
		}
		

	public boolean isEmptyQueue()
	{
		return (size == 0);
	}
	
	public boolean isFullQueue()
	{
		return (size == capacity);
	}
	
	public void FrontOfQueue() 
	{
		if (isEmptyQueue())
		{
			System.out.println("\nQueue is Empty!");
		}
		
		else
		{
			System.out.println("\nFront of Queue is " + front.data);
		}
	}
	
	public void RearOfQueue()
	{
		if (isEmptyQueue())
		{
			System.out.println("\nQueue is Empty!");
		}
		
		else
		{
			System.out.println("\nRear of Queue is " + rear.data);
		}
	}
	
	public void MakeEmptyQueue()
	{
		while(!isEmptyQueue())
		{
			Dequeue();
		}
		
		System.out.println("The Queue is made successfully EMPTY!");
	}
	
	public void Enqueue(int data)
	{
		if (size < capacity)
		{
			QueueNode tempRear = rear;
			
			rear = new QueueNode();
			
			rear.data = data;
			rear.next = null;
			
			if (isEmptyQueue())
			{
				front = rear;
			}
			
			else 
			{
				tempRear.next = rear;
			}
			
			size++;
			System.out.println("\n" + data + " added in the queue!");
		}
		
		else 
		{
			System.out.printf("\nError: Queue is FULL! %d cannot be added!\n", data);
		}

		
	}
	
	
	public int Dequeue()
	{
		if (isEmptyQueue())
		{
			System.out.println("\nQueue is Empty!\nNothing is Removed!");
			
			return -1;
		}
		
		else 
		{
			int value = front.data;
			
			front = front.next;
			
			if (isEmptyQueue())
			{
				rear = null;
			}
			
			if (front == null)
			{
				rear = null;
			}
			
			size--;
			System.out.println("\n" + value + " has been removed from the queue!\n ");
			
			return value;
		}
	}
	
	
	public void printQueue()
	{
		if (isEmptyQueue())
		{
			System.out.print("\nQueue is Empty!\n");
			return;
		}
		
		else
		{
			System.out.print("\nCreated Queue = ");
			
			QueueNode tempQNode = front;
			
			while (tempQNode != rear.next)
			{
				System.out.print(tempQNode.data + " ");
				tempQNode = tempQNode.next;
			}
			
			System.out.println();
		}
		
	}
	
	
	public void removeNegatives()
	{
		QueueNode tempQNode = front;
		
		while (tempQNode != null)
		{
			if (tempQNode.data < 0)
			{
				tempQNode.data = tempQNode.next.data;
				tempQNode.next = tempQNode.next.next;
			}
			
			else {
				tempQNode = tempQNode.next;
			}
		}
		
		size--;
		
		System.out.println("\nAll negatives removed from the queue!");
		
	}
	
	
	public static void main(String[] args) 
	{
		int operation;
		
		int data;
		
		int printOperation;
		
		QueueNode queue = new QueueNode();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("\nEnter the Capacity of Queue: ");
		
		queue.capacity = scn.nextInt();
		
		do {
			
			System.out.print("\nEnter 1 to Enqueue | 2 to See Print Operations | 3 to Dequeue | 4 to Make the Queue Empty | 5 to remove negatives | -1 to exit : ");
			operation = scn.nextInt();
			
			switch (operation) 
			{
			
			case 1: 
			{
				System.out.print("\nEnter the data to enqueue: ");
				data = scn.nextInt();
				
				queue.Enqueue(data);
				
				break;
			}
			
			case 2:
			{
				System.out.println("\nWhat you want to print ?\n");
				
				System.out.println("1: Front Data of Queue\n2: Rear Data of Queue\n3: Print the Queue\n  (-1 to exit)\n");
				
				System.out.print("Enter the Option: ");
				
				printOperation = scn.nextInt();
				
				while (printOperation != -1)
				{
					if (printOperation == 1)
					{
						queue.FrontOfQueue();
						
						break;
					}
					
					if (printOperation == 2)
					{
						queue.RearOfQueue();
						
						break;
					}
					
					if (printOperation == 3)
					{
						queue.printQueue();
						
						break;
					}
					
					else
					{
						System.out.println("\nWrong Operation is Entered. Please Choose a Correct Operation");
						break;
						
					}
				}
				
				break;
	
			}
			
			case 3:
			{
				queue.Dequeue();
				
				break;
			}
			
			case 4:
			{
				queue.MakeEmptyQueue();
				
				break;
			}
			
			case 5:
				
			{
				if (queue.isFullQueue())
				{
					queue.printQueue();
					
					queue.removeNegatives();
					
					System.out.print("\nThe list of positive numbers: ");
					queue.printQueue();	
					
					break;
				}
				
				else 
				{
					System.out.println("\nQueue is not Full!       Add more to complete!");
					
					
					System.out.print("\nEnter the data to enqueue: ");
					data = scn.nextInt();
					
					queue.Enqueue(data);
						
					System.out.print("\nBefore Removing the Negatives from Queue: ");
					queue.printQueue();
						
					queue.removeNegatives();
						
					System.out.print("\nThe list of positive numbers: ");
					queue.printQueue();	
						
					break;
					
				}
				
			}
			
			}
		
			
		} while (operation != -1);
		
	}
	
	}

}
