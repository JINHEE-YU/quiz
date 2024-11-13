package com.coding.quiz.solution.q_340213;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Time {
  private int seconds = 0;

  private String regex = "^(0[0-9]|[1-5][0-9]):([0-5][0-9])$";
  private Pattern pattern = Pattern.compile(regex);

  public Time(String stringTime) {

    Matcher matcher = pattern.matcher(stringTime);

    if (!matcher.matches()) {
      throw new IllegalArgumentException("입력시간 확인 필요 : " + stringTime);
    }
    this.setSeconds(stringTime);
  }

  private void setSeconds(String stringTime) {
    String[] inputTime = stringTime.split(":");
    this.seconds = (Integer.parseInt(inputTime[0]) * 60) + Integer.parseInt(inputTime[1]);
    log.debug("stringTime: " + stringTime);
    log.debug("this.seconds: " + this.seconds);
    log.debug("---------------------------");

  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }

  public void add(int addSeconds) {
    this.seconds = this.seconds + addSeconds;
  }

  public void minus(int minusSeconds) {
    this.seconds = this.seconds - minusSeconds;
  }

  public int getSeconds() {
    return seconds;
  }

  public String toString() {
    return this.getStringTime();
  }

  public String getStringTime() {
    int mm = this.seconds / 60;
    String stringMM = String.format("%2s", Integer.toString(mm)).replace(" ", "0");

    int ss = this.seconds % 60;
    String stringSS = String.format("%2s", Integer.toString(ss)).replace(" ", "0");
    return stringMM + ":" + stringSS;
  }

}