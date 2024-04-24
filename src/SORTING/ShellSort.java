package SORTING;
public class ShellSort {
    private  static void swap(int [] first,int [] second,int l,int r) {
            int temp = first[l];
            first[l]=second[r];
            second[r]=temp;
    }
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
            int right=left+gap;
            while(right<len)
            {
                if(left<len1 && right>=len1)
                {
                    if(arr1[left]>arr2[right])
                        swap(arr1,arr2,left,right);

                }
                else if(left>=len1){
                    if(arr2[left]>arr2[right])
                        swap(arr2,arr2,left,right);

                }
                else {
                    if (arr1[left] > arr1[right])
                        swap(arr1, arr1, left, right);
                }
                left++;right++;
            }
        }
    }
}
