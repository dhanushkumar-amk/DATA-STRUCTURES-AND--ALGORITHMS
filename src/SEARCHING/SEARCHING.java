package SEARCHING;

public class SEARCHING {
    // Pair Class
    static class Pair{
        long x;
        long y;

        Pair(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
    //Function to find repeated element and its frequency.
    public static Pair findRepeating(Long arr[],int n)
    {
        long c=1;
        long ele=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                c++;
                ele=(long)arr[i-1];
            }
        }
        if(c==0 ||ele==0)
            return new Pair(-1,-1);
        return new Pair(ele,c);
    }

    public static void main(String[] args) {
        
    }
}
