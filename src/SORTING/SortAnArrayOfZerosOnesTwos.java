package SORTING;

public class SortAnArrayOfZerosOnesTwos {
    public static void main(String[] args) {
        int [] arr ={0,1,1,0,1,0,1};
        int left=0;
        int right=arr.length-1;
        int pivot=1;
        while(left<right) {
            while (left < right && arr[left] < pivot)
                left++;
            while(left< right && arr[right]>pivot)
                right--;
            if(left<right)
            {
                
            }
        }
    }
}