package ���Ź������ռ�ѵ;

public class ������ {
	public static void main(String[] args) {
		int cnt = 0;
		//����������
		String No_p[] = {"0", "1", "4", "6", "8", "9"};
		for(int i = 1; i <= 20210605; i++) {
			if(check(i)) {
				String temp = String.valueOf(i);
				for(int j = 0; j < No_p.length; j++) {
					if(temp.indexOf(No_p[j]) != -1) {
						break;
					}
					if(j == No_p.length - 1)cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	//�ж�����
	static boolean check(int x) {
		if(x == 1)return false;
		if(x == 2)return true;
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0)return false;
		}
		return true;
	}
}
