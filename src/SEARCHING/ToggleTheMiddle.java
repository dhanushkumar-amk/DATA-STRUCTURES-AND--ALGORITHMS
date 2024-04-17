package SEARCHING;

public class ToggleTheMiddle {
    static String    recursion(int n,String str) {
        if(n==0)
            return "";
        recursion(n/2,str);
       return str+=n%2;

    }
    public static void main(String[] args) {
        int n=5;
        String str="";
        System.out.println(  recursion(n,str));
        
    }
}
