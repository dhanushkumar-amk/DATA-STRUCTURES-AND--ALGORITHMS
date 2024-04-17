package SEARCHING;
public class MaximumWaterBetweenTwoBuildings {
    public static void main(String[] args) {
        int [] height = {2,1,3,4,6,5};
        int n=height.length;
        int left=0;
        int right=n-1;
        int sum=0;
        int max=0;
        while(left<right)
        {
            max=Math.max((left+right+1)*Math.min(left,right+1),max);
                left++;
                right--;
        }
        System.out.println(max);
    }
}
