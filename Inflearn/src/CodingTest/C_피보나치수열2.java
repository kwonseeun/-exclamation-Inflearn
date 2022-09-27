package CodingTest;

import java.util.Scanner;

// 피보나치 배열 없이 구현하기 
public class C_피보나치수열2 {	
	public void solution(int n) {
		int a =1 , b = 1, c;
		System.out.print(a + " " + b + " " );
		for (int i = 2; i < n; i++) {
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		C_피보나치수열 c = new C_피보나치수열();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		c.solution(n);
	}
}
