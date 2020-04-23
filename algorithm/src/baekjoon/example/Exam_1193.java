package baekjoon.example;

import java.util.Scanner;

public class Exam_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//모범 답안 (분자와 분모를 각각의 수열로 보고 계산)
		
		int x=1;
		//분자 수열
		if(n>=1 && n<=10000000) {
				while(!(n>(x*x-x)/2 && n<=(x*x+x)/2)) {
					x++;
				}
		}
		//분모 수열
		int m = x*(x+1)/2 - n;
		if(x%2==0) {
			System.out.printf("%d/%d",x-m,1+m);
		}
		else {
			System.out.printf("%d/%d",1+m,x-m);
		}
		
		//내 답안
//		int a = 1, b = 2, addNum = 1;
//		int cnt = 2;
//		
//		String output = "1/1";
//
//		if(n == 2) {
//			output = "1/2";
//		}
//		
//		if(n >= 3 && n <= 10000000) {
//			outerLoop :
//			for (int i = 1; cnt < n; i++) {
//				if (a < b) {
//					for (int j = 0; j < i; j++) {
//						a += addNum;
//						b += addNum * (-1);
//						cnt++;
//						if(cnt == n) break outerLoop;
//					}
//					a += addNum;
//					cnt++;
//					if(cnt == n) break outerLoop;
//					
//				} else {
//					for (int j = 0; j < i; j++) {
//						a += addNum;
//						b += addNum * (-1);
//						cnt++;
//						if(cnt == n) break outerLoop;
//					}
//					b += addNum * (-1);
//					cnt++;
//					if(cnt == n) break outerLoop;
//				}
//				addNum = addNum * (-1);
//			}
//			output = a + "/" + b;
//		}
//		
//		System.out.println(output);
		sc.close();
	}
}
