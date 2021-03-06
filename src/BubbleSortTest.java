
public class BubbleSortTest {

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
		// Option 1
//		for ( int i = 0; i < intArray.length; i ++) {
//			int temp = -1;
//			for ( int j = i; j < intArray.length; j ++) {
//				if ( intArray[i] > intArray[j] ) {
//					temp = intArray[i];
//					intArray[i] = intArray[j];
//					intArray[j] = temp;
//				}
//			}
//		}
		// Option 2
		for ( int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
			for ( int i = 0; i < lastUnsortedIndex; i++ ) {
				if ( intArray[i] > intArray[i+1]) {
					swap(intArray, i , i + 1);
				}
			}
		}
		System.out.println("Array After sorting");
		for (int i = 0; i < intArray.length; i ++ ) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		if ( i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
