package com.coding.quiz.solution.q_340213;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Solution {

  public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
    String answer = "";

    MovieTime mt = new MovieTime(video_len, pos, op_start, op_end);
    mt.move(commands);

    answer = mt.getStringPosT();
    log.info(answer);
    return answer;
  }
}