package algorithms.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] combined, int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[i+j] = array1[i];
                i++;
            }
            else {
                combined[i+j] = array2[j];
                j++;
            }
        }
        if (i >= array1.length) {
            for ( ; j < array2.length; j++) {
                combined[i+j] = array2[j];
            }
        }
        else {
            for ( ; i < array1.length; i++) {
                combined[i+j] = array1[i];
            }
        }
        return combined;
    }

    public static int[] mergeSort(int[] array) {
        int inputLength = array.length;
        if (inputLength == 1) return array;
        int midpoint = array.length/2;

        int[] left = new int[midpoint];
        int[] right = new int[inputLength - midpoint];

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int i = midpoint; i < inputLength; i++) {
            right[i - midpoint] = array[i];
        }
        mergeSort(left);
        mergeSort(right);

        return merge(array, left, right);
    }


    public static void main(String[] args) {

        int[] originalArray = {3,1,4,2};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "\nOriginal Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]

            Sorted Array: [1, 2, 3, 4]

         */

    }
}
