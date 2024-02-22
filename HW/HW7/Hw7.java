//Yeng Her
//2.21.2024
//Minimum servers

import java.util.*;

class Hw7 {
    public static int minMeetingRooms(int[][] intervals) {
        int count = 1;
        if (intervals.length == 0) {
            return 0;
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int[] interval : intervals) {
            while (!minHeap.isEmpty() && interval[0] >= minHeap.peek()) {
                minHeap.poll();
                count++;
            }
            minHeap.offer(interval[1]);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(intervals1));

        int[][] intervals2 = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(minMeetingRooms(intervals2));

        int[][] intervals3 = {{1, 2}, {0, 1}, {2, 3}};
        System.out.println(minMeetingRooms(intervals3));

        int[][] intervals4 = {{5, 10}, {0, 30}, {15, 20}};
        System.out.println(minMeetingRooms(intervals1));
    }
}
