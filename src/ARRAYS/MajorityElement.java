package ARRAYS;
public class MajorityElement {
    static int MajorityElement(int[] arr, int n) {
        int majority=0;
        int count=0;
        for (int i=0; i<n; i++)
        {
            if(arr[i]==arr[i+1])
                count++;
            count--;
            
        }
    }
        public static void main (String[]args){
            int[] arr = {4,1,1,4,3,4,4};
            int res = MajorityElement(arr, arr.length);
            System.out.println(res);
        }
    }
