package ch01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex2_1_2 {
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
    }
}
