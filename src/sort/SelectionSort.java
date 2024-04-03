package src.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 0, -2, 9};
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);

        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
