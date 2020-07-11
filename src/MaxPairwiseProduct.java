import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static int getMaxPairwiseProduct(int[] numbers) {
        int max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                    numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }
    
    static long getMaxPairwiseProductFast(int[] numbers) {
    	
    	
    	int max_index1 = -1;
    	for ( int i = 0; i < numbers.length; i ++) {
    		if (( max_index1 == -1 ) || ( numbers[i] > numbers[max_index1]))
    			max_index1 = i;
    	}
    	int max_index2 = -1;
    	for ( int j = 0; j < numbers.length; j ++) {
    		if (( numbers[j] != numbers[max_index1] ) && (( max_index2 == -1 ) || ( numbers[j] > numbers[max_index2])))
    			max_index2 = j;
    	}
    	
    	return ((long) numbers[max_index1] * numbers[max_index2]);
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
//        long startTime = System.currentTimeMillis();
//        System.out.println(getMaxPairwiseProduct(numbers));
//        long endTime = System.currentTimeMillis();
//        System.out.println("slow method duration: " + (endTime - startTime ) );
//        
//        startTime = System.currentTimeMillis();
        System.out.println(getMaxPairwiseProductFast(numbers));
//        endTime = System.currentTimeMillis();
//        System.out.println("fast method duration: " + (endTime - startTime ) );
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
