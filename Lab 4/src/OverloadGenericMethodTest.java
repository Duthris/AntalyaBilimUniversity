// Adem Anil YALIMDEMIR - 180201017 - Q2

public class OverloadGenericMethodTest {
	
	public static <T>void printArray (T[] inputArray){
		for (T element: inputArray)
			System.out.printf("%s , ", element);
			System.out.println();
		
	}
	
	public static <T>int printArray (T[] inputArray, int lowSubscript, int highSubscript){
		
		if (lowSubscript<0 || highSubscript>inputArray.length)
			throw new ArrayIndexOutOfBoundsException();
		
		for(int index = lowSubscript; index<highSubscript;index++) {
			System.out.printf("%s, ", inputArray[index]);
			
			
			// return highSubscript-lowSubscript;
			
			
		}
		System.out.println();
		
		return highSubscript;
			
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {2, 4, 5, 6, 8, 9};
		
		Double[] doubleArray = {2.4, 4.5, 6.7, 8.9};
		
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		int n = printArray(intArray, 0, 4);
		System.out.println("Array intArray contains " + n + " elements");
		
		n = printArray(doubleArray, 0, 2);
		System.out.println("Array doubleArray contains " + n + " elements");
		
		n = printArray(charArray, 0, 3);
		System.out.println("Array charArray contains " + n + " elements");
		
		printArray(intArray, 0, 9);
	}

}
