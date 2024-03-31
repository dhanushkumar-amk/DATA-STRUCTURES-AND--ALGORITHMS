package SEARCHING;
public class SquareRoot {
    static float SquareRoot(float x) {
        float l=0;
        float r=x/2;
        float res=0;
        float mid=0;
        while (l<=r)
        {
             mid=(l+r)/2;
            if(mid*mid==x)
                return mid;
         else if(mid*mid<x) {
                l = mid + 1;
                res=mid;
            }
         else r=mid-1;
        }
        return res;
    }
    public static void main(String[] args) {
        float x=23;
     int  res= (int)SquareRoot(x);
        System.out.println(res);
    }
}
