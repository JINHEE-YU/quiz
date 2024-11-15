package com.coding.quiz.solution.q_340212;

import com.coding.quiz.solution.QBase;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
* [PCCP 기출문제] 2번 / 퍼즐 게임 챌린지
* - 해결포인트 :  이진탐색(Binary Search)을 사용하여 level 찾기
*/
@Slf4j
@NoArgsConstructor
public class Q340212 implements QBase {
  public void execute() {
    solution(new int[] { 1, 5, 3 }, new int[] { 2, 4, 7 }, 30);
    solution(new int[] { 1, 4, 4, 2 }, new int[] { 6, 3, 8, 2 }, 59);
    solution(new int[] { 1, 328, 467, 209, 54 }, new int[] { 2, 7, 1, 4, 3 }, 1723);
    solution(new int[] { 1, 99999, 100000, 99995 }, new int[] { 9999, 9001, 9999, 9001 }, 3456789012L);
  }

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
