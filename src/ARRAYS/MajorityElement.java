package ARRAYS;
public class MajorityElement {
    static int MajorityElement(int[] arr, int n) {

        int currMajor = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                currMajor = arr[i];
                count = 1;
                continue;
            }
            if (currMajor == arr[i])
                count++;
            else {
                count--;
            }
        }
        return currMajor;
    }


        public static void main (String[]args){
            int[] arr = {1, 15};
            int res = MajorityElement(arr, arr.length);
            System.out.println("\n" + res);
        }
    }
}