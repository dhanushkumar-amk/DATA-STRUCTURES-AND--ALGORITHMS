package ARRAYS;

public class GeekAndNew {
    public static void main(String[] args) {
        int T= 2;
        String str="Geek";
        int n=str.length();
        boolean flag=true;
        for(int i=0; i<n; i++) {
            int x = str.charAt(i);
            if (x < 64) {
                flag = false;
                break;
            }
        }
        if(flag==true)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
