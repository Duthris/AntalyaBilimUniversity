import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017 - Part 2 - Ex. 1

public class Part2_Ex1_Product 
{
	
	static int product = -1;

    public static void productOfList(List<Integer> nums) 
    {
        if (nums.size() > 0)
        {
            product *= nums.get(0);
            nums.remove(0);
            productOfList(nums); //recursive part of method
        }
    }
    
	
	public static void main(String[] args) 
	{
		List nums = new ArrayList();
			
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to add to list or -1 to quit: ");
		int input = scn.nextInt();
		
		while(input != -1) 
		{
			System.out.println("Enter a number to add to list or -1 to quit: ");
			input = scn.nextInt();
			nums.add(input);
		}
		
		long startTime = System.nanoTime();
		productOfList(nums);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.printf("Product of all the numbers in the list: %d", product);
		
		System.out.println("\n\nExecution time in nano time: " + timeElapsed);
		
		
	}

}
