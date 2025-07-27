import java.util.ArrayList;
import java.util.List;

public class PairSum {
	public static List<int[]> pairSum(int[] arr, int s) {
		// Write your code here.
		List<int[]> result = new ArrayList<>();
		for(int i = 0; i <= arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == s) {
					result.add(new int[] {Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])});
				}
			}
		}
		result.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        return result;
	}
}
