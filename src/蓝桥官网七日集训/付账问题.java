package 蓝桥官网七日集训;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;


//如果每个人都能满足，那么把金额平均，则标准差是。
//否则存在有人小于平均值，则不够的由其他补上，直到恰好为S。
public class 付账问题 {
	static int n;
	static BigDecimal ans[];
	static BigDecimal res[];
	static BigDecimal S;
	static BigDecimal avr;
	static BigDecimal L;
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		n = (int)input.nval;
		input.nextToken();
		S = BigDecimal.valueOf(input.nval);
		avr = S.divide(BigDecimal.valueOf(n),100,RoundingMode.UP);
		ans = new BigDecimal[n];
		res = new BigDecimal[n];
		for(int i = 0; i < n; i++) {
			input.nextToken();
			ans[i] = BigDecimal.valueOf(input.nval);
			res[i] = ans[i];
		}
		Arrays.sort(ans);
		Arrays.sort(res);
		boolean key = false;
		for(int i = 0; i < n; i++) {
			if(ans[i].compareTo(avr) == -1) {
				key = true;
				break;
			}
		}
		if(!key) {
			System.out.println("0.0000");
		}else {
			while (S.compareTo(BigDecimal.valueOf(0.000000001)) == 1) {
				int min = -1;
				int t = -1;
				boolean fin = false;
				for(int i = n - 1; i >= min + 1; i--) {
					if(ans[i].compareTo(avr) == 0 || ans[i].compareTo(avr) == 1) {
						ans[i] = ans[i].subtract(avr);
						S = S.subtract(avr);
					}else {
						S = S.subtract(ans[i]);
						ans[i] = BigDecimal.valueOf(0);
					}
					if(!fin && ans[i].compareTo(BigDecimal.valueOf(0)) == 0) {
							t = i;
							fin = true;
					}
				}
				if(t != -1) {
					min = t;
				}
				if(min != -1) {
					long y = (long)n - min - 1;
					avr = S.divide(BigDecimal.valueOf(y),100,RoundingMode.UP);
				}
				
			}
			//计算每一个
			BigDecimal sum = BigDecimal.valueOf(0);
			for(int i = 0; i < n; i++) {
				res[i] = res[i].subtract(ans[i]);
				sum = sum.add(res[i]);
			}
			avr = sum.divide(BigDecimal.valueOf(n),100,RoundingMode.UP);
			BigDecimal e = BigDecimal.valueOf(0);
			for(int i = 0; i < n; i++) {
				e = e.add(res[i].subtract(avr).pow(2));
			}
			e = sqrt(e.divide(BigDecimal.valueOf(n),100,RoundingMode.UP));
			System.out.format("%.4f", e);
		}
	}

    public static BigDecimal sqrt(BigDecimal num) {
        if(num.compareTo(BigDecimal.ZERO) < 0) {
            return BigDecimal.ZERO;
        }
        BigDecimal x = num.divide(new BigDecimal("2"), MathContext.DECIMAL128);
        while(x.subtract(x = sqrtIteration(x, num)).abs().compareTo(new BigDecimal("0.0000000000000000000001")) > 0);
        return x;
    }
    
    private static BigDecimal sqrtIteration(BigDecimal x, BigDecimal n) {
        return x.add(n.divide(x, MathContext.DECIMAL128)).divide(new BigDecimal("2"), MathContext.DECIMAL128);
    }
    
}
