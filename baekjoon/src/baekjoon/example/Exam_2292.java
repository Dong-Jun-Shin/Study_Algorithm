package baekjoon.example;

import java.util.Scanner;

/*
	  육각형으로 이루어진 벌집이 있다. 
	  그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 
	  돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
	  숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 
	  최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지
	  (시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
	  예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
	  
	 입력 - 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
	 출력 - 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
 */
/*
	1		1개 (+1)
	            (+5)
	2~7		2개 (+6) (+7)	(+5)
	            (+6) 		(+5)
	8~19	3개 (+12) (+12)	(+11)
	            (+6)		 (+6)
	20~37	4개 (+18) (+18)	(+17)
		        (+6)		 (+6)
	38~61	5개 (+24) (+24)	(+23)
	
		...
 */
public class Exam_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 2;
		int end = 7;
		int i=0;
		int count = 1;
		
		while(n <= 1000000000){
			if(n==1) break;
						
			if(start <= n && n <= end) {
				count = i + 2;
				break;
			}
			
			i++;
			start += (i*6);
			end += (i*6) + 6;
		}
		System.out.println(count);
		sc.close();
	}
}
