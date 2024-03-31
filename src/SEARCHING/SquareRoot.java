package SEARCHING;
public class SquareRoot {
    static float SquareRoot(float x) {
        float l=0;
        float r=x/2;
        float mid=0;
        while (l<=r)
        {
             mid=(l+r)/2;
            if(mid*mid==x)
                return mid;
         else if(mid*mid>x)

             r=(int)mid-1;
         else l=(int)mid+1;
        }
        return mid;
    }
    public static void main(String[] args) {
        float x=23;
     float res= SquareRoot(x);
        System.out.println(res);
    }
}
