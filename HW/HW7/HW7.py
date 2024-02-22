import heapq
from typing import List


def minMeetingRooms(intervals: List[List[int]]) -> int:
  count = 1
  if len(intervals) == 0:
    return 0
  intervals.sort(key=lambda x: x[0])
  minHeap = []
  for i in range(len(intervals)):
    while minHeap and intervals[i][0] >= minHeap[0]:
      heapq.heappop(minHeap)
      count += 1
    heapq.heappush(minHeap, intervals[i][1])
  return count


print(str(minMeetingRooms([[0, 30], [5, 10], [15, 20]])))
print(str(minMeetingRooms([[0, 1], [1, 2], [2, 3]])))
print(str(minMeetingRooms([[1, 2], [0, 1], [2, 3]])))
