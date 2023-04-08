package 蓝桥官网七日集训;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class 时间显示 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Instant in = Instant.ofEpochMilli(scanner.nextLong());
		scanner.close();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime time = LocalDateTime.ofInstant(in, ZoneOffset.systemDefault());
		System.out.println(time.format(formatter));
	}
}
