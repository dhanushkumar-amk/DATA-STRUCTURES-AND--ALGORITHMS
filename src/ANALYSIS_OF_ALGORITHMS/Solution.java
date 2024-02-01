package ANALYSIS_OF_ALGORITHMS;

class Solution {
    static void method(int n, int[] arr) {
        int x = arr[0];
        for (int i = 1; i < n; i++) {
            x = x ^ arr[i];
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        int[] arr = {9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2};
        int n = arr.length;
        method(n, arr);
        System.out.println(5 ^ 3);
    }
}