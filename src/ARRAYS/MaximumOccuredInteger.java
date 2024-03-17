package ARRAYS;

class  MaximumOccuredInteger{
    static int MaximumOccuredInt(int [] l,int [] r, int n) {
        int leftMax=l[0];
        int rightMin=r[0];

        for (int i=1; i<n; i++)
        {
            if (leftMax<l[i]&&l[i]<=rightMin)
                leftMax=l[i];
            if(rightMin>r[i]&&r[i]>=leftMax)
                rightMin=r[i];
        }
        return leftMax;
    }
    public static void main(String[] args) {
        int [] arr1={1,4,3,1};
        int [] arr2={15,8,5,4};
     int result=   MaximumOccuredInt(arr1,arr2,arr1.length);
        System.out.println(result);
    }
}