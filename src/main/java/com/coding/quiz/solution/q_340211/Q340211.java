package com.coding.quiz.solution.q_340211;

import lombok.extern.slf4j.Slf4j;

/**
 * [PCCP 기출문제] 3번 / 충돌위험 찾기
 * - 해결 포인트 : 2차원배열, Map 개념 활용
 ** > HashMap은 key값이 중복되면 해당 값에 value가 여러개 저장 됨.
 ** > 지원함수
 *** // putIfAbsent : 키가 이미 존재? => 기존 유지&반환 : 할당값 저장& null 반환
 *** // getOrDefault : 키가 이미 존재? => 기존값 반환 : 할당값 반환
 */
@Slf4j
public class Q340211 {
  public static void main(String[] args) {

    int points[][] = null;
    int routes[][] = null;

    points = new int[][] { { 3, 2 }, { 6, 4 }, { 4, 7 }, { 1, 4 } };
    routes = new int[][] { { 4, 2 }, { 1, 3 }, { 2, 4 } };
    new Solution().solution(points, routes); // 1
    points = new int[][] { { 3, 2 }, { 6, 4 }, { 4, 7 }, { 1, 4 } };
    routes = new int[][] { { 4, 2 }, { 1, 3 }, { 4, 2 }, { 4, 3 } };
    new Solution().solution(points, routes); // 9
    points = new int[][] { { 2, 2 }, { 2, 3 }, { 2, 7 }, { 6, 6 }, { 5, 2
    } };
    routes = new int[][] { { 2, 3, 4, 5 }, { 1, 3, 4, 5 } };
    new Solution().solution(points, routes); // 0

  }
}
