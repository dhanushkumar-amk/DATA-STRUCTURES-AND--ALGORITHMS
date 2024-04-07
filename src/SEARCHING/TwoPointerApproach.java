package SEARCHING;
public class TwoPointerApproach {
    static boolean some () {
        int x = 17;
        int sum = 0;
        int [] arr ={2,5,8,12,30};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            sum=0;
            sum=arr[i];
            for (int j = 0; j < n; j++)
            {
                sum=0;
                sum+=arr[j];
                if (sum==x)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int [] arr ={2,5,8,12,30};
     boolean res= some();
        System.out.println(res);
    }
 }
