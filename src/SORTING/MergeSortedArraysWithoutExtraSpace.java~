package SORTING;
public class MergeSortedArraysWithoutExtraSpace {

    public static void main(String[] args) {
        int left[] = {1,4,8,12};
        int right[]={2,3,5,7,9};
        int lastPointer= left.length;;
        int firstPointer= right.length;
        while(left[lastPointer]>right[firstPointer]) {
            int temp=right[firstPointer];
            right[firstPointer]=left[lastPointer];
            left[lastPointer]=temp;
            lastPointer--;
            firstPointer++;
        }
        
    }
}