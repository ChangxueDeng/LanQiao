package ���Ź������ռ�ѵ;

public class �������� {
	public static void main(String[] args) {
		for(int i = 12114; i <= 1000000000; i++) {
			if(check(i) && i % 2019 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
	static boolean check(int i) {
		String t = String.valueOf(i);
		for(int j = 0; j < t.length(); j++) {
			if(t.charAt(j) == '0' || (t.charAt(j) - '0') % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
