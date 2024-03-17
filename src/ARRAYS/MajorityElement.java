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
        if (arr[n-1]==currMajor)
            return -1;
        return currMajor;
    }
        public static void main (String[]args){
            int[] arr = {4,1,1,4,3,4};
            int res = MajorityElement(arr, arr.length);
            System.out.println(res);
        }
    }
