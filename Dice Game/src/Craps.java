
/*                  RULES OF THE GAME
*       Shooter rolls two dice to get the first sum
*       If the first sum is 2, 3, or 12, shooter loses
*       Otherwise, if the first sum is 7 or 11, shooter wins
*       Otherwise, the first sum becomes the point
*       Now keep rolling again and again
*       Shooter rolls two dice to get the new sum
*       If the new sum equals the point, shooter wins
*       Otherwise if the new sum equals 7, shooter looses
*       Otherwise shooter rolls again 
*/
    
import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus;
		
		Scanner scn = new Scanner(System.in);
		
		int sumOfDice = rollDice();
		
		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		
		while (gameStatus == Status.CONTINUE) {
			System.out.println("Roll Again");
			scn.nextLine();
			sumOfDice = rollDice();
			
			if (sumOfDice == myPoint)
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN)
				gameStatus = Status.LOST;
			
		}
		
		if (gameStatus == Status.WON)
			System.out.println("Player Won!");
		else
			System.out.println("Player Lost!");
	}
	
	
	public static int rollDice() {
		int dice1 = 1 + randomNumbers.nextInt(6);
		int dice2 = 1 + randomNumbers.nextInt(6);
		int sum = dice1 + dice2;
		
		System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
		
		return sum;
	}
	
}


