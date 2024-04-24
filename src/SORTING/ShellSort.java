package SORTING;
public class ShellSort {
    public static void main(String[] args) {
        int [] arr1 ={1,3,5,7};
        int [] arr2 ={0,2,6,8,9};
        int gap=(arr1.length/2)+(arr2.length/2);
        int len=arr1.length+arr2.length;
        while(gap>=1)
        {
            int left=0;
             gap=gap/2;
            int right=gap;
            while(right<len)
            {
                if(left<arr1.length && right<arr1.length)
                {
                    if(arr1[left]>arr1[right])
                    {
                        int temp=arr1[left];
                        arr1[left]=arr1[right];
                        arr1[right]=temp;
                    }
                }
                if(left>arr1.length && right>arr1.length)
                {

                }
                if(left<arr1.length && right<arr2.length )
                {

                }
            }
        }
    }
}
