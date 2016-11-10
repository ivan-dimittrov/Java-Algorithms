import java.util.Arrays;

public class _02_CountingSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 2, 3, 6, 1 };
		countingSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void countingSort(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int[] arr2 = new int[max + 1];

		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]]++;
		}

		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			while (arr2[i] > 0) {
				arr[index] = i;
				arr2[i]--;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
