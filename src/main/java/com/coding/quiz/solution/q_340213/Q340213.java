package com.coding.quiz.solution.q_340213;

import com.coding.quiz.solution.QBase;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Q340213 implements QBase {

  public void execute() {

    new Solution().solution("10:00", "00:03", "00:00", "00:05", new String[] { "prev", "next" }); // "00:15"

    new Solution().solution("10:00", "10:00", "08:00", "09:00", new String[] { "next", "next", "next" }); // "10:00"

    new Solution().solution("30:00", "15:00", "15:10", "15:30", new String[] { "next", "next" }); // "15:40"

    new Solution().solution("34:33", "13:00", "00:55", "02:55", new String[] { "next", "prev" }); // "13:00"

    new Solution().solution("10:55", "00:05", "00:15", "06:55", new String[] { "prev", "next", "next" }); // "06:55"

    new Solution().solution("07:22", "04:05", "00:15", "04:07", new String[] { "next" }); // "04:17"

  }

}
