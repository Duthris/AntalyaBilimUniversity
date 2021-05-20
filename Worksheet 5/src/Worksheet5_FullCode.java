import java.util.Arrays;
import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017 - Worksheet 5 Full Code

public class Worksheet5_FullCode 
{
	static class StackRecord
	{
		int capacity;
		int topOfStack;
		int[] array;
	
		StackRecord(int capacity)
		{
			this.capacity = capacity;
			array = new int[capacity];
			topOfStack = 0;
		}
	
		boolean emptyStack()
		{
			return topOfStack == 0;
		}
		
		boolean fullStack()
		{
			return topOfStack == capacity;
		}
		
		
		public void PushStack(int value) // Exercise 1, Push method to add integers into stack.
		{
			if (fullStack())
			{
				System.out.printf("\nError: Stack is Full. Value: %d cannot be added!\n", value);
			}
			
			else
			{
				array[topOfStack++] = value;
			}
		}
		
		
		public void PopStack() // Exercise 1, Pop method to remove top element of stack for making 1 empty slot.
		{
			if (emptyStack())
			{
				System.out.println("\nError: Stack is Empty. Nothing is Removed!");
			}
			
			else
			{
				System.out.println("\nTop of the Stack is Removed!");
				System.out.println("\nRemoved Top of the Stack Value: " + array[--topOfStack]);
			}
		}
	
	
		public void printStack() // Print method to see the full form of stack as array.
		{
			System.out.println(Arrays.toString(Arrays.copyOf(array, topOfStack)));
		}
		
		public void reverseStack(StackRecord tempStack) // Exercise 3 reverse method to print reverse form of stack. If nothing is pushed from pushStack() method
														// It will say stack is empty and add some integers and take an array to push them into stack and reverse it.
		{
			if (tempStack.emptyStack())
			{
				System.out.println("\nStack is Empty add some integers!\n");
				
				int length;
				
				Scanner scn = new Scanner(System.in);
				
				length = capacity;
				
				int[] intArray = new int[length];
				
				for (int i=0; i < length; i++)
				{
					System.out.print("\nEnter a number to add into integer array: ");
			
					intArray[i] = scn.nextInt();
				}
				
				for (int i=0; i < length; i++)
				{
					tempStack.PushStack(intArray[i]);
				}
				
				int[] reversedStack = new int[length];
				
				for (int i=0; i < length; i++)
				{
					reversedStack[i] = array[--topOfStack];
				}
				
				System.out.println("\nReversed Stack: " + Arrays.toString(reversedStack));
			}
			
			else
			{
				int length;
				
				length = capacity;
				
				int[] reversedStack = new int[length];
				
				for (int i=0; i < length; i++)
				{
					reversedStack[i] = array[--topOfStack];
				}
				
				System.out.println("\nReversed Stack: " + Arrays.toString(reversedStack));
			}
			
		}
	
	};
		
	
	
	public static void main(String[] args)   // In main part, it is what it is in Exercise 2, ask user options and if push is chosen, asks user to number that will be added again and again.
	{
		int operation;
		
		int value;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("\nEnter the capacity of stack: ");
		
		int capacity = scn.nextInt();
		
		StackRecord stack = new StackRecord(capacity);
		
		
		do {
			
			System.out.print("\nEnter 1 to push a value | 2 to print the stack | 3 to remove top value of stack | -1 to exit and reverse the stack: ");
			operation = scn.nextInt();
			
			switch (operation) 
			{
			
			case 1:
			{
				System.out.print("\nEnter the value to be pushed into stack: ");
				value = scn.nextInt();
				
				stack.PushStack(value);
				
				break;
			}
			
			case 2:
			{
				System.out.println("\nCreated stack with pushed values: ");
				stack.printStack();
				
				break;
				
			}
			
			case 3:
			{
				stack.PopStack();
				
				break;
			}
			
			default:
			{
				System.out.println("");
				
				break;
			}
			
			}
			
			
		} while (operation != -1);
	
		stack.reverseStack(stack);

	}

}
