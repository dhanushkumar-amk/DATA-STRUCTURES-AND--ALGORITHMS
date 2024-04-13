package SEARCHING;

public class TwoRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1};
        int n = arr.length;
        int i = 0;
        int j = 0;
        int[] arrs = new int[2];
        while (i < n && j < 2) { // Adjusted loop condition
            if (arr[i] <= 0 || arr[i] > n) {
                i++;
                continue;
            }

            if (arr[arr[i] - 1] > 0) {
                arr[i] = arr[arr[i] - 1];
                arr[arr[i] - 1] = -1;
                if (arr[i] == -1) {
                    arrs[j++] = i + 1;
                }
            } else {
                arr[arr[i] - 1]--;
                arr[i] = 0;
                i++;
                if (arr[i] == -1) {
                    arrs[j++] = i + 1;
                }
            }
        }
        for (int k = 0; k < j; k++)
            System.out.print(arrs[k] + " ");
    }
}
