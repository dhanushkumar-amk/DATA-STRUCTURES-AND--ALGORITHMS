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
        int []  end={150 ,67 ,137, 131, 139 ,115 ,49, 6 ,117 ,126, 59 ,109, 27 ,96 ,73, 60, 99 ,108, 50, 145, 68 ,104 ,102, 82, 7 ,126 ,118 ,93, 148 ,150};
        System.out.println(start.length);
        System.out.println(end.length);
     maxMeetings(start,end,start.length);
    }
}
