package SEARCHING;

public class ToggleTheMiddle {
    static String str="";
    static void     recursion(int n,String str) {
        if(n==0)
            return ;
        recursion(n/2,str);
        str+=n%2;

    }
    public static void main(String[] args) {
        int n=5;
       recursion(n,str);
        System.out.println(str);
    }
}
