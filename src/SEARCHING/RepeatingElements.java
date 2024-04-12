package SEARCHING;
public class RepeatingElements {
    public static void main(String[] args) {
        int []arr ={1,2,2,2};
        int ans=0;
        for (int x:arr)
            ans^=x;
        int ans2=ans;
        for (int y:arr)
            ans2^=y;
        System.out.println(ans);
        System.out.println(ans2);
    }
}
