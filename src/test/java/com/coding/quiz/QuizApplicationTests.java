package com.coding.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.coding.quiz.solution.q_340212.Q340212;
import com.coding.quiz.solution.q_340213.Q340213;
import com.coding.quiz.solution.q_340213.Solution;

@SpringBootTest
class QuizApplicationTests {

	@Test
	void contextQ340212() {
		// new Q340212().execute();

		assertEquals(3,
				new Q340212().solution(new int[] { 1, 5, 3 }, new int[] { 2, 4, 7 }, 30));

		assertEquals(2,
				new Q340212().solution(new int[] { 1, 4, 4, 2 }, new int[] { 6, 3, 8, 2 }, 59));

		assertEquals(294,
				new Q340212().solution(new int[] { 1, 328, 467, 209, 54 }, new int[] { 2, 7, 1, 4, 3 }, 1723));

		assertEquals(39354,
				new Q340212().solution(new int[] { 1, 99999, 100000, 99995 }, new int[] { 9999, 9001, 9999, 9001 },
						3456789012L));
	}

	@Test
	void contextQ340213() {
		// new Q340213().execute();

		assertEquals("00:15",
				new Solution().solution("10:00", "00:03", "00:00", "00:05", new String[] { "prev", "next" }));

		assertEquals("10:00",
				new Solution().solution("10:00", "10:00", "08:00", "09:00", new String[] { "next", "next", "next" }));

		assertEquals("15:40",
				new Solution().solution("30:00", "15:00", "15:10", "15:30", new String[] { "next", "next" }));

		assertEquals("13:00",
				new Solution().solution("34:33", "13:00", "00:55", "02:55", new String[] { "next", "prev" }));

		assertEquals("06:55",
				new Solution().solution("10:55", "00:05", "00:15", "06:55", new String[] { "prev", "next", "next" }));

		assertEquals("04:17",
				new Solution().solution("07:22", "04:05", "00:15", "04:07", new String[] { "next" }));

	}

}
