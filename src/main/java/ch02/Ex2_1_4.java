package ch02;

public class Ex2_1_4 {
    public int[] binaryAdd(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n + 1];
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            c[i] = sum % 2;
            carry = sum / 2;
        }
        c[0] = carry;
        return c;
    }

}
