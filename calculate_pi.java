package gitPractice;

import java.util.Scanner;

public class calculate_pi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 0;
		int n = 0;
		int i;
		double sign=1;

		System.out.print("계산횟수를 입력하세요:");
		n = sc.nextInt();
		for(i=1;i<=n;i+=2) {
			pi += (1.0/i)*sign;
			sign = -sign;
		}
		System.out.printf("pi: %f",4*pi);
	}
}
