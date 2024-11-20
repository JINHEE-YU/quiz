package com.coding.quiz.solution.q_340212;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Solution {
  public int solution(int[] diffs, int[] times, long limit) {
    int answer = 0;

    long end = limit;
    long start = 1;

    long mid = 0;
    while (start < end) {
      mid = (start + end) / 2;
      if (calculatePlayTime(diffs, times, mid) <= limit) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    answer = (int) end;
    log.info(Integer.toString(answer));
    return answer;
  }

  private long calculatePlayTime(int[] diffs, int[] times, long level) {
    long timesSum = 0;
    for (int i = 0; i < diffs.length; i++) {
      if (diffs[i] <= level) {
        timesSum += times[i];
      } else {
        timesSum += (diffs[i] - level) * (times[i] + times[i - 1]) + times[i];
      }
    }
    return timesSum;
  }
}
