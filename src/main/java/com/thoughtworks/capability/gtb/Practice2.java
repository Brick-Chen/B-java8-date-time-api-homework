package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {
  private final static int FRIDAY = 5;
  private final static int SUNDAY = 7;
  public static LocalDate getNextWorkDate(LocalDate date) {
    int dayOfWeek = date.getDayOfWeek().getValue();
    int dayToNextWorkDay = 0;
    if (dayOfWeek < FRIDAY || dayOfWeek == SUNDAY) {
      dayToNextWorkDay += 1;
    } else if (dayOfWeek == FRIDAY) {
      dayToNextWorkDay += 3;
    } else {
      dayToNextWorkDay += 2;
    }
    return date.plusDays(dayToNextWorkDay);
  }
}
