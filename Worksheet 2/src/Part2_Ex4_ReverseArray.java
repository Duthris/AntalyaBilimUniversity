import java.util.Arrays;
import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017

public class Part2_Ex4_ReverseArray 
{
	public static int[] reverseArray(int[] nums, int start, int end) 
	{
		if (start > end) 
		{
			System.out.println("Start point cannot be less than end point!");
		}
		
		else if (start == end)
		{
			return nums;
		}
		
		else 
		{
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			reverseArray(nums, start + 1, end - 1);
		}
		
		return nums;
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
		
		long startTime = System.nanoTime();
		
		System.out.printf("The normal array given by you: %s", Arrays.toString(nums));
		
		int[] reversedArray = reverseArray(nums, 0, nums.length - 1);
		
		System.out.printf("\nThe reversed array of your array: %s", Arrays.toString(reversedArray));
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("\n\nExecution time in nano time: " + timeElapsed);

	}

}
