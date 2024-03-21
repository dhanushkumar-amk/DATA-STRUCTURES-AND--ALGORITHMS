package ARRAYS;

import java.util.Scanner;

public class GeekAndNew {
    static void StringCheck(String str) {
        int n=str.length();
        boolean valid=true;

        for (int i=0; i<n; i++)
        {
            int x=str.charAt(i);
            if(x<64)
            {
                valid=false;
                break;
            }
            else valid=true;
        }
    }
    static void PasswordCheck(String str) {
        boolean numeric=false;
        boolean lowercase=false;
        boolean uppercase=false;

        for (int i=0; i<str.length(); i++)
        {
            int x=str.charAt(i);
            if(x>=48 && x<=57)
                numeric=true;
            if(x>=97 && x<=122)
                lowercase=true;
            if(x>=65 && x<=90)
                uppercase=true;
        }
        
    }
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int T=scan.nextInt();
        String stringCheck=scan.next();
        String passwordCheck=scan.next();

    }
}
