package ch02;

public class Ex2_3_2 {
    public static int[] merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy elements to L array
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        // Copy elements to R array - FIXED: should be q + 1 + j
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = p;

        // Merge elements from L and R while both have remaining elements
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }

        return A;
    }
}