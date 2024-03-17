package ARRAYS;
public class MajorityElement {
    static int MajorityElement(int[] arr, int n) {
        int majority=0;
        int count=0;
        for (int i=0; i<n-1; i++)
        {
            if (count>n/2)
                return majority;
            if(arr[i]==arr[i+1])
                count++;
            else {
               if(count>0) {
                   count--;
               }
               else {
                   majority=arr[i+1];
                   count=1;
               }
            }
        }
        return -1;
    }
        public static void main (String[]args){
            int[] arr = {3,1,3,3,2};
            int res = MajorityElement(arr, arr.length);
            System.out.println(res);
        }
    }
