package BIT_WISE;

public class countBit {
    static int setBits(int N) {
        // code here
        int count=0;

        while(N>0)
        {
            if((N&1)==1){
                count++;
            }
            N=N>>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        setBits(6);
    }
}
