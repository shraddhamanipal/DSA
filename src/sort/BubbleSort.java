package src.sort;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,5,9,1,5,3,7, 24,0,-1};
        bubbleSort(arr);
        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void bubbleSort(int[] arr) {
        for(int i =0; i< arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}