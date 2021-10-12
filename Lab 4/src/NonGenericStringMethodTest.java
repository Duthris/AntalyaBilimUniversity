// Adem Anil YALIMDEMIR - 180201017 - Lab 04 - Q3

public class NonGenericStringMethodTest {
	
	public static <T>void printArray (String[] inputArray){
		int count=0;
		for(int i =0;i<inputArray.length;i++) {
			count ++;
			
			System.out.printf("%-10.5s", inputArray[i]);
					if (count==4)
						System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		
		printArray (stringArray);
	}

}
