package ���Ź������ռ�ѵ;

//�� 12�� �� 2 12
public class �������� {
	public static void main(String[] args) {
		long res = 0;
		for(int i = 1900; i <= 9999; i++) {
			String t = String.valueOf(i);
			//�������2
			if(t.indexOf("2") != -1) {
				res += 365;
			}
			else {
				res += 120;
				res += 31;
				res += 28;
			}
			if(is_year(i)) res++;
		}
		System.out.println(res); 
	}
	static boolean is_year(int year) {
		if(year % 4 == 0 && year % 100 != 0) {
			return true;
		}else if (year % 400 == 0) {
			return true;
		}
		return false;
	}
}

