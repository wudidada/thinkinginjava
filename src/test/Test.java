package test;

public class Test{
	public static void bubbleSort(int[] arr) {
		boolean changed;
		int temp;
		int len = arr.length;
		do {
			changed = false;
			len--;
			for(int i = 0; i < len; i++) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					changed = true;
				}
			}
		} while(changed);
	}
	
	public static void bubbleSort2(int[] arr) {
		int temp;
		int len = arr.length;
		for(int j = len - 1 ; j > 0; j--) {
			for(int i = 0; i < j; i++) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	
	public static void insertionSort(int[] arr) {
		int len = arr.length;
		for(int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j > 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void selectionSort(int[] arr) {
		int i, j, min, temp, len = arr.length;
		for(i = 0; i < len - 1; i++) {
			min = i;
			for(j = i + 1; j < len; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,11,33,22,44,32,65,55,77,55,88};
		selectionSort(array);
		for(int i : array) {
			System.out.println(i);
		}
	}
}
