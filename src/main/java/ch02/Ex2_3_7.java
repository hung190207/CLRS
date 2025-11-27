package ch02;

import java.util.Arrays;

public class Ex2_3_7 {
    public boolean twoSum(int[] S, int x) {
        Arrays.sort(S);
        int i = 0;
        int j = S.length - 1;
        while (i < j) {
            int sum = S[i] + S[j];
            if (sum == x) return true;
            else if (sum < x) i++;
            else j--;
        }
        return false;
    }
}
