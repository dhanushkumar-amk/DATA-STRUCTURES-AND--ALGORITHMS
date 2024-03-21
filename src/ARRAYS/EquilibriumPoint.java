package ARRAYS;
public class EquilibriumPoint {
    public static void main(String[] args) {
        int [] arr ={3,4,8,-9,20,6};
        int i=1;
        int n= arr.length;
        int l=0;
        int r=n-1;
        int leftSum=0;
        int RightSum=0;
        int Equ=0;
        while (l<r)
        {
            leftSum+=arr[l]+arr[l+1];
            RightSum+=arr[r]+arr[r-1];
            l++;
            r--;
            if (leftSum==RightSum) {
                Equ = 4;
                break;
            }
        }
        System.out.println(Equ);
    }
}
