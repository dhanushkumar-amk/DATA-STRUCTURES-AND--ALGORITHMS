package RECURSION;
import java.util.Arrays;
public class PrintingAllPermutations {
    static void PrintAllPermutations(int arr[] ,int Fi, int end) {
        if (Fi ==arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        PrintAllPermutations(swap(arr,Fi,end),Fi,end+1);
        PrintAllPermutations(swap(arr,Fi,end),Fi+1,end);
    }
    static int [] swap(int arr[],int Fi,int end) {
        int temp =arr[Fi];
        arr[Fi ]= arr[end];
        arr[end] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int Fi =0;
        int end =0;
        PrintAllPermutations(arr,Fi,end);
    }
}