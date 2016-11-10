public class _01_BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 12, 41, 54, 65, 2, 4, 7, 9, 34, 87, 99, 6 };
		bubbleSort(arr);
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
