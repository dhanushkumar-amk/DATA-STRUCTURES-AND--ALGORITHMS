package ARRAYS;
public class MinimumConsecutiveFlips {
    static int MinimumConsecutiveFlip(int [] arr,int n) {
        int Zeros=0;
        int Ones=0;
        boolean LargeGroup=false;
        for (int i=0; i<n; i++)
        {
            if(arr[i]==0)
                Zeros++;
            else  Ones++;
        }
        LargeGroup=Zeros>Ones?false:true;
        for (int i=0;i<n; i++)
        {
            if(LargeGroup==false)
                if(arr[i]==0&& (arr[i+1]==1||arr[i-1]==1))
                    System.out.println("From "+i+" to "+i);
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={0,1,0,0};
        int n= arr.length;
        MinimumConsecutiveFlip(arr,n);
    }
}