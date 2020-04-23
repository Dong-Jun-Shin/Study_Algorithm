package baekjoon.example;

import java.util.Scanner;

public class Exam_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		int v = Integer.parseInt(data[2]);
		
		/* 모범 답안 */
//		double A = Double.parseDouble(data[0]);
//		double B = Double.parseDouble(data[1]);
//		double V = Double.parseDouble(data[2]);
//		
//		System.out.println((int)Math.ceil((V-A)/(A-B))+1);
		
		
		/* 내답안 */
		// 정상에 도착하는 경우를 뺀 거리를(-a) 가는데, 걸리는 날짜
		int day = (v-a)/(a-b);
		
		// 마지막 a만큼 거리가 남아있을 때, 
		// 올라가는 정도(a)로 도착하지 못하는 경우
		if((v-a)%(a-b) > 0) {
			// 올라가는데 걸리는 1일, 거리가 남아있을 때 소요될 1일
			day += 2; 
		// 올라가는 정도(a)로 도착하는 경우
		}else if((v-a)%(a-b) == 0) {
			// 1일동안 올라가는 정도로, 정상에 도착
			day += 1;
		}
		
		System.out.println(day);
		sc.close();
	}
}