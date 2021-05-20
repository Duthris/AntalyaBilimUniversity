import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017

public class Part2_Ex2_EvenCallBack 
{
	static int count = 0;
	
	public static int evenCallBack(int nums[], int start) 
	{
		 if (start == nums.length) return 0;
		
		    int count;
		    if ((nums[start] % 2) == 0) 
		    {
		        count = 1;
		    }
		    else 
		    {                         
		        count = 0;
		    }
		    
		    return count + evenCallBack(nums, start + 1);  // recursive call part of the function
	}
	
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("How many numbers you want to enter to array: ");
		int num = scn.nextInt();
		
		int nums[] = new int[num];
		
		System.out.println("Which index should be start from checking evens: ");
		int start = scn.nextInt();
		
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.printf("Enter the %d. number: ", i+1);
			nums[i] = scn.nextInt();
		}
		
		long startTime = System.nanoTime();
		System.out.println("The amount of even numbers in your given array: " + evenCallBack(nums,start));
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("\n\nExecution time in nano time: " + timeElapsed);
	}
}
