package ARRAYS;

public class WhoIsMajor {
    static int Major(int[] arr,int n) {
        int x1=0;
        int y1=0;
        int result=0;

        for(int i=0; i<n; i++)
        {

            if(x==arr[i])
                x1++;

            if(y==arr[i])
                y1++;
        }
        result=x1>y1?x:y
        if(x1==y1)
            return Math.min(x,y);
        return result;
    }
    public static void main(String[] args) {
        int [] arr ={}
        Major()
    }
}
