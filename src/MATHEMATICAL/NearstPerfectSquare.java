package MATHEMATICAL;
public class NearstPerfectSquare {
    public static void main(String[] args) {
        int n=5;
        long first = 0;
        long second = 0;
        if ((n - 1) % 2 == 0)
            first = n - 1;
        if ((n + 1) % 2 == 0)
            second = n + 1;
       Math.max(first, second);
        System.out.println(Math.max(first,second));
    }
}
