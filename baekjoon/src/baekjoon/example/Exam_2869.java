package baekjoon.example;

import java.util.Scanner;

public class Exam_2869 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] data = sc.nextLine().split(" ");
//		int a = Integer.parseInt(data[0]);
//		int b = Integer.parseInt(data[1]);
//		int v = Integer.parseInt(data[2]);
//		
		int ing = 0;
		int day = 0;
		
		int a = 50;
		int v = 100;
		if(v <= 1000000000) {
			for (int b = 1; b < a; b++) {
				while(ing < v) {
					ing = (a-b)/2;
					
					if(((a-b)/2)%2 == 0) {
						ing += 1; 
					}else {
						ing += 2;
					}
					
					day++;
				}
				System.out.println(a + " " + b + " " + v + " " + day);
				System.out.println("-------------");
				ing=0;
				day=0;
			}
		}
		
//		sc.close();
	}
}
