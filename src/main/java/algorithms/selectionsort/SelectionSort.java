package algorithms.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{5,2,1,4,3,6};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
