package SEARCHING;
public class RepeatingElements {
    public static void main(String[] args) {
        int []arr ={1,2,2,2,3,3,3,3};
        int ans=1;
        for (int x:arr)
            ans^=x;
        int ans2=ans;
        System.out.println(ans);

    }
}
