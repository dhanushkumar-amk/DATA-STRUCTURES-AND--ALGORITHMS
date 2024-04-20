package SORTING;
public class MergeSortedArraysWithoutExtraSpace {

    public static void main(String[] args) {
        int left[] = {1,4,8,12};
        int right[]={2,3,5,7,9};
        int lastPointer= left.length-1;
        int firstPointer= 0;
        while(left[lastPointer]>right[firstPointer]) {
            int temp=right[firstPointer];
            right[firstPointer]=left[lastPointer];
            left[lastPointer]=temp;
            lastPointer--;
            firstPointer++;
        }
        for (int i=1; i< left.length;i++)
        {
            if(left[i-1]>left[i])
            {
                int key=left[i];
                int j=i-1;
                while(j>=0 && left[j]>key)
                    left[j+1]=left[j--];
                left[j+1]=key;
            }
        }
        for (int x:left) System.out.print(x+" ");
    }
}