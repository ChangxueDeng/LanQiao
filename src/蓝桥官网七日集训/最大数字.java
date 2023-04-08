package 蓝桥官网七日集训;

import java.util.Scanner;


public class 最大数字 {
	static long ans = -1;
	static char[] num;
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        num = String.valueOf(n).toCharArray();
        dfs(0, a, b);
        System.out.println(ans);
    }
    static void dfs(int u, int a, int b) {
        if(u == num.length) {
            ans = ans > ca() ? ans : ca();
            return;
        }
        char t = num[u];
        if(t == '9')dfs(u + 1, a, b);
        if(9 - (num[u] - '0') <= a && num[u] != '9') {
            num[u] = '9';
            dfs(u + 1,a - (9 - (t - '0')), b);
            num[u] = t;
        }else if(num[u] - '0' != 9){
            num[u] = (char) ((num[u] - '0' + a) + '0');
            dfs(u+1, 0, b);
            num[u] = t;
        }
        if(num[u] - '0'< b && num[u] != '9') {
            num[u] = '9';
            dfs(u+1, a, b - 1 - (t - '0'));
            num[u] = t;
        }
    }
    static long ca() {
        long  res = 1L * num[0] - '0';
        for(int i = 1; i < num.length; i++) {
            res = res * 10 + (num[i] - '0');
        }
        return res;
    }
}
