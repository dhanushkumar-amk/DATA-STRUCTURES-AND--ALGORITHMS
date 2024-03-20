package ARRAYS;

public class BettingGame {
    public static void main(String[] args) {
        int bet =1;
        int res=0;
        int balance=4;
        for(int i=0; i<result.length(); ++i)
        {
            if(balance<=0)
                return -1;
            if(result.charAt(i)=='W')
            {
                balance+=bet;
            }
            if(result.charAt(i)=='L')
            {
                balance-=bet;
                bet*=2;
            }
        }
        return balance;
    }
}
