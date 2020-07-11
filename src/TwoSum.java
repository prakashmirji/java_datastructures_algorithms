import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = new int[] {2,5,6,4,8};
		int target = 8;
		int[] result = getTwoSum(arr, target);
		System.out.println(result[0] + " " + result[1]);
	}
	
	public static int[] getTwoSum(int[] arr, int target) {
		
		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		
		for ( int i = 0; i < arr.length; i++ ) {
			int delta = target - arr[i];
			if (visitedNumbers.containsKey(delta)) {
				return new int[] { i, visitedNumbers.get(delta)};
			}
			visitedNumbers.put(arr[i], i);		}
		
		return new int[] {-1, -1};
	}
}
