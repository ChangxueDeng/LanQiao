package ���Ź������ռ�ѵ;

public class �������� {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i <= 2020; i++) {
			String t = String.valueOf(i);
			for(int j = 0; j < t.length(); j++) {
				if(t.charAt(j) == '2')cnt++;
			}
		}
		System.out.println(cnt);
	}
}
