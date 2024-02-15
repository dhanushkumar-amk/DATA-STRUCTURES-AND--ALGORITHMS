package RECURSION;
class  Recursion {
    static void Josephus(int n, int k) {
        int arr[] = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        JosephusUsingRecursion(arr, n, k, 0);
    }

    static void JosephusUsingRecursion(int arr[], int n, int k, int start) {
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        int nextIndex = (start + k - 1) % n;
        leftShiftArray(nextIndex, arr);
        JosephusUsingRecursion(arr, n - 1, k, nextIndex);
    }

    static void leftShiftArray(int i, int arr[]) {
        for (; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        Josephus(n, k);
    }
}
// STOPSHIP: 25-10-2023