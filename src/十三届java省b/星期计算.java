package ʮ����javaʡb;

import java.math.BigInteger;
import java.time.LocalDate;

public class ���ڼ��� {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 4, 9);
		//System.out.println(date.getDayOfWeek());
		date = date.plusDays(BigInteger.valueOf(20).pow(22).mod(BigInteger.valueOf(7)).intValue());
		System.out.println(date.getDayOfWeek().getValue());
	}
}
