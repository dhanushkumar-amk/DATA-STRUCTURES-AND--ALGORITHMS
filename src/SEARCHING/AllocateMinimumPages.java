package SEARCHING;

public class AllocateMinimumPages {
    static int recursive(int [] arr,int n,int student){
return 1;
    }
    public static void main(String[] args) {
        int [] arr ={12,34,67,90};
        int res= recursive(arr, arr.length,4);
//        System.out.println(res);
        int left=0;
        int leftMid= (arr.length/2)-1;
        int rightMid=( arr.length/2);
        int right= arr.length-1;
        System.out.println(left);
        System.out.println(leftMid);
        System.out.println(rightMid);
        System.out.println(right);
    }
}
