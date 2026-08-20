/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(i -> i.start));
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        for (Interval meeting : intervals) {
            if(!rooms.isEmpty() && rooms.peek() <= meeting.start) {
                rooms.poll();
            }
            rooms.offer(meeting.end);
        }
        return rooms.size();
    }
}
