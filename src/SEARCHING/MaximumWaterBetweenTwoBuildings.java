package SEARCHING;
public class MaximumWaterBetweenTwoBuildings {
    public static void main(String[] args) {
        int [] height = {2,1};
        int n=height.length;
        int left=0;
        int right=n-1;
        int sum=0;
        int max=0;
        while(left<right)
        {
            max=Math.max((left+right)*Math.min(left,right),max);
                left++;
                right--;
        }
        System.out.println(max);
    }
}
