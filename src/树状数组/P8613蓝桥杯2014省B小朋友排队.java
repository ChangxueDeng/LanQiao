package 树状数组;
// 冒泡排序 逆序对 树状数组

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

//一个数前面比他大的数量，后面比他小的数量的和就是交换次数  最后求出，不满意度
public class  P8613蓝桥杯2014省B小朋友排队{
    static int n;
    static int m;
    static int N = 1000010;
    static int nums[] = new int [N];
    static int tr[] = new int [N];
    static int sum[] = new int[N];
    public static void main(String[] args) throws Exception{
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        n = (int)in.nval;
        for(int i = 0; i < n; i++) {
            in.nextToken();
            nums[i] = (int)in.nval;
            nums[i]++;
        }
        for(int i = 0; i < n; i++) {
            sum[i] = query(N - 1) - query(nums[i]);
            add(nums[i], 1);
        }
        Arrays.fill(tr, 0);
        for(int i = n-1; i >= 0 ;i--) {
            sum[i] += query(nums[i] - 1);
            add(nums[i], 1);
        }
        long ans = 0L;
        for(int i = 0; i < n; i++) {
            ans += (long) sum[i] * (sum[i] + 1) / 2;
        }
        printWriter.print(ans);
        printWriter.flush();
        printWriter.close();
    }
    static int lowbit(int x) {
        return x& -x;
    }
    static void add(int x, int v) {
        for(int i = x; i < N; i += lowbit(i)) {
            tr[i] += v;
        }
    }
    static int query(int x) {
        int res = 0;
        for(int i = x; i > 0; i -= lowbit(i)) {
            res += tr[i];
        }
        return res;
    }
}
