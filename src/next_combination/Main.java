package next_combination;

public class Main {
	public static boolean next_combination(int[] arr, int n, int r) {
		int i = arr.length - 1;
		while (arr[i] == n - r + i) {
			i--;
			if (i < 0)
				return false;
		}

		arr[i]++;

		for (int j = i + 1; j < r; j++) {
			arr[j] = arr[i] + j - i;
		}
		return true;

	}
}
