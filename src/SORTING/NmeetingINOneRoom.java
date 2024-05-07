package SORTING;

import java.util.Arrays;
import java.util.Comparator;

public class NmeetingINOneRoom {
    static class Meeting {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "(" + start + ", " + end + ")";
        }
    }

    public static int maxMeetings(int start[], int end[], int n) {
        // Create an array of meetings
        Meeting[] meetings = new Meeting[n];

        // Insert meetings into the array and print details after insertion
        System.out.println("Inserted Meetings:");
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
            System.out.println(meetings[i]);
        }

        // Sort meetings based on end times
        Arrays.sort(meetings, (a, b) -> Integer.compare(a.end, b.end));

        int count = 1;
        int currentEnd = meetings[0].end;

        // Iterate through the sorted meetings
        for (int i = 1; i < n; i++) {
            if (meetings[i].start > currentEnd) {
                count++;
                currentEnd = meetings[i].end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start1 = {1, 3, 0, 5, 8, 5};
        int[] end1 = {2, 4, 6, 7, 9, 9};
        int res1 = maxMeetings(start1, end1, start1.length);
        System.out.println("Output for Example 1: " + res1);

        int[] start2 = {10, 12, 20};
        int[] end2 = {20, 25, 30};
        int res2 = maxMeetings(start2, end2, start2.length);
        System.out.println("Output for Example 2: " + res2);
    }
}
