package ARRAYS;
public class MajorityElement {
    static int MajorityElement(int[] arr, int n) {
        int majority=arr[0];
        int count=1;
        for (int i=1; i<n; i++)
        {
            if (majority == arr[i]) {
                count++;
                continue;
            }
            else {
                count--;
            }
            if (count==0)
            {
                majority=arr[i];
                count=1;
            }
        }
        if (count>n/2)
            return count;
        return -1;
    }
        public static void main (String[]args){
            int[] arr = {3,1,3,3,2};
            int res = MajorityElement(arr, arr.length);
            System.out.println(res);
        }
    }
