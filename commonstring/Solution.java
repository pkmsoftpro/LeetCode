package commonstring;

public class Solution {

	public static String longestCommonPrefix(String[] arr) {

		if (arr.length > 0) {
			return common(arr, arr.length);
		}

		return "";
	}

	static String common(String arr[], int n) {
		String search_item = arr[findMinLength(arr, n)];
		boolean exit = false;

		int j = 0;
		while (j < search_item.length()) {

			for (int i = 0; i < n; i++) {

				if (!search_item.substring(0, j + 1).equals(
						arr[i].substring(0, j + 1))) {
					exit = true;
					break;
				}
			}
			if (exit)
				break;
			j++;
		}

		return search_item.substring(0, j);
	}

	static int findMinLength(String arr[], int n) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i <= (n - 1); i++) {
			if (arr[i].length() < min) {
				min = arr[i].length();
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		String[] arr = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(arr));
	}
}
