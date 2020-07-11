
public class InsertionSortTest {

	public static void main(String[] args) {
		
		int[] intArray = new int[7];
		
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		System.out.println("Array before sorting");
		for (int i = 0; i < intArray.length; i ++ ) {
			System.out.println(intArray[i]);
		}
		for ( int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++ ) {
			int newElement = intArray[firstUnsortedIndex];
			int i;
			for (  i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i-- ) {
				intArray[i] = intArray[i - 1];
			}
			
			intArray[i] = newElement;
			
		}
		System.out.println("Array After sorting");
		for (int i = 0; i < intArray.length; i ++ ) {
			System.out.println(intArray[i]);
		}
	}
	
}
