package SEARCHING;

public class ToggleTheMiddle {
    static void    recursion(int n) {
        if(n==0)
            return ;
        recursion(n/2);
        System.out.print(n%2+" ");
    }
    public static void main(String[] args) {
        int n=5;
        recursion(n);

    }
}
