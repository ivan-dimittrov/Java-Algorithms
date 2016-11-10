public class _04_BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(arr, 7, 0, arr.length - 1));
	}

	private static int binarySearch(int[] arr, int x, int left, int right) {
		int mid = (left + right) / 2;
		if (left > right) {
			return -1;
		}
		if (arr[mid] == x) {
			return mid;
		} else {
			if (x > arr[mid]) {
				left = mid + 1;
				return binarySearch(arr, x, left, right);
			} else {
				right = mid - 1;
				return binarySearch(arr, x, left, right);
			}
		}
	}
}
