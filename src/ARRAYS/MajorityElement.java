package ARRAYS;
public class MajorityElement {
    static int MajorityElement(int[] arr, int n) {
        int majority = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = arr[i];
                    count = 1;
                }
            }
        }

        count = 0; // Reset count to count occurrences of majority element
        for (int i = 0; i < n; i++) {
            if (arr[i] == majority) {
                count++;
            }
        }
        // Check if the majority element actually appears more than n/2 times
        if (count > n / 2) {
            return majority;
        } else {
            return -1;
        }
    }
        public static void main (String[]args){
            int[] arr = {3,1,3,3,2};
            int res = MajorityElement(arr, arr.length);
            System.out.println(res);
        }
    }
