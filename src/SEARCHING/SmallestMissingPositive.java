package SEARCHING;
public class SmallestMissingPositive {
    public static void main(String[] args) {
        int [] arr ={1,2,3,5,7,8};
        int n=arr.length;
        int res=arr[0];
        for (int i=1; i<n; i++)
        {
            res^=arr[i];
        }
        System.out.println(res);
    }
}