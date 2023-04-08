package ¿∂«≈πŸÕ¯∆ﬂ»’ºØ—µ;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ≈‹≤Ω∂Õ¡∂ {
	public static void main(String[] args) {
		LocalDate start_date = LocalDate.of(2000, 1, 1);
		LocalDate end_date = LocalDate.of(2020, 10, 2);
		int res = 0;
		while (!start_date.equals(end_date)) {
			if(start_date.getDayOfMonth() == 1 || start_date.getDayOfWeek() == DayOfWeek.MONDAY) {
				res += 2;
			}else {
				res += 1;
			}
			start_date = start_date.plusDays(1);
		}
		System.out.println(res);
	}
}
