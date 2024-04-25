package  SORTING;

import java.util.ArrayList;


    class SORTING
    {
        static long count=0;
        static void  mergeSort(long []arr,int low,int mid,int high) {
            int left=low;
            int right=mid+1;
            ArrayList<Long> list = new ArrayList();

            while(left<=mid && right <=high)
            {
                if(arr[left]<arr[right]){
                    list.add(arr[left++]);

                }
                else {
                    list.add(arr[right++]);
                    count++;
                }
            }
            while(left<=mid) list.add(arr[left++]);
            while(right<=high)list.add(arr[right++]);
            for(int i=low; i<=high; i++)
                arr[i]=list.get(i-low);
        }
        static void merge(long arr[],int l,int r) {
            if(l<r)
            {
                int mid=(l+r)/2;
                merge(arr,l,mid);
                merge(arr,mid+1,r);
                mergeSort(arr,l,mid,r);
            }
        }


        public static void main(String[] args) {
            long [] arr = {2, 3, 4, 5, 6};
            merge(arr, 0,arr.length-1);
            for (long x:arr) System.out.print(x+" ");
            System.out.println(count);

        }
    }
