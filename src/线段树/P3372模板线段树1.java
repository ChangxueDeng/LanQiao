package �߶���;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
//��ѯ���� �� �����޸�
public class P3372ģ���߶���1 {
	static int N = 100010;
	static int n;
	static int m;
	//ԭ����
	static long w[] = new long[N];
	//�߶�������
	static Node2 tr[] = new Node2[4 * N];
	public static void main(String[] args) throws Exception{
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		in.nextToken();
		n = (int)in.nval;
		in.nextToken();
		m = (int)in.nval;
		for(int i = 1; i <= n; i++) {
			in.nextToken();
			w[i] = (long)in.nval;
		}
		bulid(1,1,n);
		for(int i = 0; i < m ; i++) {
			in.nextToken();
			int flag = (int)in.nval;
			in.nextToken();
			int a = (int)in.nval;
			in.nextToken();
			int b = (int)in.nval;
			if(flag == 1) {
				//�����޸�
				in.nextToken();
				int k = (int)in.nval;
				for(int x = a; x <= b; x++) {
					//�����޸�
					modify(1, x, k);
				}
			}else {
				//�����ѯ
				pt.print(query(1, a, b));
				pt.print("\n");
			}
		}
		pt.flush();
		pt.close();
	}
	//����
	static void pushup(int u) {
		//��ڵ�ĺͼ��ҽڵ�ĺ�
		tr[u].sum = tr[u << 1].sum + tr[u << 1 | 1].sum;
	}
	//��ʼ������
	static void bulid(int u, int l, int r) {
		tr[u] = new Node2();
		tr[u].l = l; tr[u].r = r;
		if(l == r) tr[u].sum = w[r];
		else {
			int mid  = tr[u].l + tr[u].r >> 1;
			bulid(u << 1, l, mid);
			bulid(u << 1 | 1, mid + 1, r);
			//���½ڵ�
			pushup(u);
		}
	}
	/** �����ѯ���� */
	static long query(int u, int l, int r) {
		if(tr[u].l >= l && tr[u].r <= r) return tr[u].sum;
		int sum = 0;
		int mid = tr[u].l + tr[u].r >> 1;
		if(l <=  mid) {
			sum += query(u << 1, l, r);
		}
		if(r > mid) {
			sum += query(u << 1 | 1, l, r);
		}
		return sum;
	}
	/** ���㡤�޸� ������ڵ㣬�޸Ľڵ㣬�޸�ֵ */
	static void modify(int u, int x, int k) {
		if(tr[u].l == tr[u].r) tr[u].sum += k;
		else {
			int mid = tr[u].l + tr[u].r >> 1;
			if(x <= mid) {
				modify(u << 1, x, k);
			}else {
				modify(u << 1 | 1, x, k);
			}
			pushup(u);
		}
	}
}
class Node2{
	int l, r;
	long sum;
	int f;//�����
}