package SEARCHING;
public class SquareRoot {
    static int SquareRoot(int x) {
        int l=0;
        int r=x;
        int range=x/2;
        while (l<=r)
        {
            int mid=range/2;
            if(mid*mid==x)
             return mid;
         else if(mid*mid>x)
             r=mid;
         else l=mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int x=25;
        SquareRoot(x);
    }
}
