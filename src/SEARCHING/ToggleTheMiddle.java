package SEARCHING;

public class ToggleTheMiddle {
    static String str="";
    static void     recursion(int n) {
        if(n==0)
            return ;
        recursion(n/2);
        str+=n%2;
    }
    public static void main(String[] args) {
        int n=5;
       recursion(n);
        System.out.println(str);
        int len=str.length();
        int left=0;
        int right=len;
        String strs="";
        for (int i=0; i<n; i++) {
            if ((len & 1) == 1 && i + 1 == len / 2)
                strs += '0';
             if ((len & 1) == 0 && (i == len / 2) || (i + 1 == len / 2))
                strs += "1";
            else {
                strs += n % 2;
            }
        }
        System.out.println(strs);
    }
}
