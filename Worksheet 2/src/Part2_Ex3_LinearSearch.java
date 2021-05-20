import java.util.Arrays;
import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017

public class Part2_Ex3_LinearSearch 
{
	public static int linearSearch(int[] nums, int index, int length, int searchNum) 
	{
		if (index > length) 
		{
			return -1;
		}
		
		if (nums[index] == searchNum) 
		{
			return index;
		}
		
		return linearSearch(nums, index + 1, length, searchNum);  // recursive part of the function
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("How many numbers you want to enter to array: ");
		int num = scn.nextInt();
		
		int nums[] = new int[num];
		
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.printf("Enter the %d. number: ", i+1);
			nums[i] = scn.nextInt();
		}
		
		Arrays.sort(nums);
		System.out.printf("Sorted nums array: %s", Arrays.toString(nums));
		
		System.out.println("\nEnter a number you want to search index of it: ");
		int searchNum = scn.nextInt();
		
		
		long startTime = System.nanoTime();
		
		int index = linearSearch(nums, 0, nums.length - 1, searchNum);
		
		if (index != -1) 
		{
			System.out.println("Searched Number: " + nums[index] + " \tIndex of it: " + index  + "\t\tPlace of it: " + (index + 1));
		}
		
		else 
		{
			System.out.println("Searched number " + searchNum + " could not be found in the given array.");
		}
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("\n\nExecution time in nano time: " + timeElapsed);
	}

}
