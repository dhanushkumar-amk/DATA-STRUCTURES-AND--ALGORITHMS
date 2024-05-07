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
        int  [] 
     maxMeetings();
    }
}
