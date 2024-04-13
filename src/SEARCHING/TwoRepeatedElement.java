package SEARCHING;

public class TwoRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,3};
        int n = arr.length;
        int i = 0;
        int j=0;
        while (i < n) {

            if (arr[i] <= 0 || arr[i] > n) {
                i++;
                continue;
            }

            if (arr[arr[i] - 1] > 0) {
                arr[i] = arr[arr[i] - 1];
                arr[arr[i] - 1] = -1;

            } else {
                arr[arr[i] - 1]--;
                arr[i] = 0;
                i++;
            }
        }
    }
}
