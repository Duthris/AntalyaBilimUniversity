import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017

public class Part2_Ex5_howManyDigits 
{
	public static int howManyDigits(int num) 
	{
		if (num < 10) 
		{
			return 1;
		}
		
		else 
		{
			return 1 + howManyDigits(num / 10); // recursive part of the function
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter an integer number to count digits of it: ");
		
		int num = scn.nextInt();
        
		long startTime = System.nanoTime();
		
        System.out.println("The number given by you: " + num + "\tDigit Amount of It: " + howManyDigits(num));
        
        long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("\n\nExecution time in nano time: " + timeElapsed);
	}

}
