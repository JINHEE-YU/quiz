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
    new Solution().solution(new int[] { 1, 5, 3 }, new int[] { 2, 4, 7 }, 30); // 3
    new Solution().solution(new int[] { 1, 4, 4, 2 }, new int[] { 6, 3, 8, 2 }, 59); // 2
    new Solution().solution(new int[] { 1, 328, 467, 209, 54 }, new int[] { 2, 7, 1, 4, 3 }, 1723); // 294
    new Solution().solution(new int[] { 1, 99999, 100000, 99995 }, new int[] { 9999, 9001, 9999, 9001 }, 3456789012L); // 39354
  }
}
