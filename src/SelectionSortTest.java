
public class SelectionSortTest {

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
		for ( int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
			int largest = 0;
			for ( int i = 1; i <= lastUnsortedIndex; i++ ) {
				if ( intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			
			swap(intArray, largest, lastUnsortedIndex);
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
