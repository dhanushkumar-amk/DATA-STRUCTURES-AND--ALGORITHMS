package SORTING;

public class NmeetingINOneRoom {
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Arrays.sort(end);
        int count=1;
        int ends=end[0];
        for(int i=1;i<n; i++)
        {
            if(ends<start[i])
            {
                count++;
                ends=end[i];
            }
            else continue;
        }
        return count;
    }
    public static void main(String[] args) {
        int  [] start ={48, 43, 61, 54 ,99 ,84 ,3 ,3 ,59 ,30 ,45 ,72, 24, 87 ,21 ,48, 54, 88, 8, 67 ,41 ,64, 87, 54, 5 ,62, 87 ,33 ,74 ,92};
        int []  end={};
     maxMeetings();
    }
}
