package SORTING;
public class ShellSort {
    public static void main(String[] args) {
        int [] arr1 ={1,3,5,7};
        int [] arr2 ={0,2,6,8,9};
        int gap=(arr1.length/2)+(arr2.length/2);
        int len=arr1.length+arr2.length;
        int len1=arr1.length;
        int len2=arr2.length;
        while(gap>=1)
        {
            int left=0;
             gap=gap/2;
            int right=gap;
            while(right<len)
            {
                if(left<len1 && right>=len1)
                {
                    if(arr1[left]>arr2[right])
                    {
                        int temp = arr1[left];
                        arr1[left]=arr2[right];
                        arr2[right]=temp;
                        left++;
                        right++;
                    }
                }
                else {
                    
                }
            }
        }
    }
}
