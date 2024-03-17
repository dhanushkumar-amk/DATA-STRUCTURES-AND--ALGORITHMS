package ARRAYS;

class  MaximumOccuredInteger{
    static int MaximumOccuredInt(int [] l,int [] r, int n) {
        int leftMax=l[0];
        int rightMin=r[0];

        for (int i=1; i<n; i++)
        {
            if (leftMax<l[i]&&l[i]<=rightMin)
                leftMax=l[i];
            if(rightMin>r[i])
                rightMin=r[i];
        }
        System.out.println(leftMax);
        return -1;
    }
    public static void main(String[] args) {
        int [] arr1={1,5,9,13,21};
        int [] arr2={4,5,6,6,8};
        MaximumOccuredInt(arr1,arr2,arr1.length);
    }
}