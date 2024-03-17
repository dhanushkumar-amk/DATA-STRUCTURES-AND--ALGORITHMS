package ARRAYS;

class  MaximumOccuredInteger{
    static int MaximumOccuredInt(int [] l,int [] r, int n) {
        int leftMax=l[0];
        int rightMin=r[0];
        //
        //
        for (int i=1; i<n; i++)
        {
            if (leftMax<l[i]&&rightMin<=l[i])
                leftMax=l[i];
            if(rightMin>r[i]&&leftMax>=r[i])
                rightMin=r[i];
        }
        System.out.println(leftMax+" "+rightMin);
        return -1;
    }
    public static void main(String[] args) {
        int [] arr1={1,5,9,13,21};
        int [] arr2={15,8,12,20,30};
        MaximumOccuredInt(arr1,arr2,arr1.length);
    }
}