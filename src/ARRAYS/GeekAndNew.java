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
        boolean numeric=true;
        boolean lowercase=true;
        boolean uppercase=true;
        
        for (int i=0; i<str.length(); i++)
        {
            if()
        }
    }
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int T=scan.nextInt();
        String stringCheck=scan.next();
        String passwordCheck=scan.next();

    }
}
