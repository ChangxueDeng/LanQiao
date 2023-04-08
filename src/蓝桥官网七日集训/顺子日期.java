package 蓝桥官网七日集训;

import java.time.LocalDate;


public class 顺子日期 {
	static String m[] = {"012","123", "234","345","456","567","678","789"};
	public static void main(String[] args) {
		int ans = 0;
		LocalDate t = LocalDate.of(2022, 1, 1);
		LocalDate e = LocalDate.of(2023, 1, 1);
		while (!t.equals(e)) {
			String u  = String.valueOf(t.getYear());
			if(t.getMonthValue() < 10) u += "0";
			u += String.valueOf(t.getMonthValue());
			if(t.getDayOfMonth() < 10) u += "0";	
			u += String.valueOf(t.getDayOfMonth());
			//System.out.println(u);
			for(int i = 0; i < m.length ; i++) {
				if(u.indexOf(m[i]) != -1) {
					ans++;
					break;
				}
			}
			t = t.plusDays(1);
		}
		System.out.println(ans);
	}
}
