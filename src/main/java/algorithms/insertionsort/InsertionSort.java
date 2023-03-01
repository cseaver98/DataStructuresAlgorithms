package algorithms.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && temp < array[j]) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,2,1,4,3,6};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }


}
