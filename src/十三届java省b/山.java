package 十三届java省b;

public class 山 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 2022; i <= 2022222022; i++) {
			StringBuffer t = new StringBuffer(String.valueOf(i));
			String t1 = t.toString();
			String t2 = t.reverse().toString();
			//System.out.println(t1);
			//System.out.println(t2);
			if(t1.equals(t2)) {
				//是回文
				int k = t1.length();
				boolean key1 = true;
				boolean key2 = true;
				for(int j = 0; j < k / 2; j++) {
					if(t1.charAt(j) > t1.charAt(j+1)) {
						key1 = false;
						break;
					}
				}
				for(int j = k - 1; j > k / 2; j--) {
					if(t1.charAt(j) > t1.charAt(j-1)) {
						key2 = false;
						break;
					}
				}
				if(key1 && key2) {cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
