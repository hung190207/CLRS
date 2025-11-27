package ch02;

public class Ex2_3_5 {
    public int binarySearch(int[] A, int x, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (A[mid] == x) return mid;
        else if (A[mid] < x) return binarySearch(A, x, mid + 1, high);
        else return binarySearch(A, x, low, mid - 1);
    }
}
