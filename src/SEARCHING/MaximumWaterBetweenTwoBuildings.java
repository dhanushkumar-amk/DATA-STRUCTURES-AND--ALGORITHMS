package SEARCHING;
public class MaximumWaterBetweenTwoBuildings {
    public static void main(String[] args) {
        int [] height = {}
        int left=0;
        int right=n-1;
        int sum=0;
        int max=0;
        while(left<right)
        {
            max=Math.max((left+right+1)*Math.min(left+1,right+1),max);
            if(height[left]>height[left+1])
                left++;
            if(height[right]>height[right-1])
                right--;
        }
        return max;
    }
}
