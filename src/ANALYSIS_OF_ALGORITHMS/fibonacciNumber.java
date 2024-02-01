package ANALYSIS_OF_ALGORITHMS;

public class fibonacciNumber {
    static void Iterative(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        for (int temp : arr) {
            System.out.print(temp + "");
        }
    }

    static int Recursion(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return Recursion(n - 2) + Recursion(n - 1);
    }

    static int fibonacciOptimized(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int a, b, c = 0;
        a = 0;
        b = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 121;
//        int answer = Recursion(n);
//        System.out.println(answer);
        System.out.println(fibonacciOptimized(n));


    }
}
