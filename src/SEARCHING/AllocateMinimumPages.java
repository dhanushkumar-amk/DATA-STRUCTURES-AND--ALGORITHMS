package SEARCHING;

public class AllocateMinimumPages {
    static int recursive(int [] arr,int n,int student){

    }
    public static void main(String[] args) {
        int [] arr ={12,34,67,90};
        int res= recursive(arr, arr.length,4);
        System.out.println(res);
        int left=0;
        int leftMid= arr.length/3;
        int right= arr.length;
        System.out.println(leftMid );
    }
}
