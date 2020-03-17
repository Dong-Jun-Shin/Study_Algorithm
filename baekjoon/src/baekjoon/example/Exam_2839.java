package baekjoon.example;

import java.util.Scanner;

/*
상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 
봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 

예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

입력 - 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
출력 - 상근이가 배달하는 봉지의 최소 개수를 출력한다. 
           만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
           
*/
/* 4 7 
 * 
 * 3	3
 * 6	3 3
 * 9	3 3 3
 * 12	3 3 3 3
 
 * 4개씩
 * 
 * 5	5
 * 10	5 5
 * 15	5 5 5
 * 20	5 5 5 5
 * 25	5 5 5 5 5
 * 30	5 5 5 5 5 5	
 */
public class Exam_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//내 답안
		int n = sc.nextInt();
		int total = 0;
		
		for (int i = 0; i < 5; i++) {	
			if((n-(3*i))%5 == 0 ) total = (n-(3*i))/5 + i;
		}
		if(n == 4 || n == 7 || total == 0) total = -1;
		
		System.out.println(total);
		
		//모범 답안
//		int count=0;
//        
//        while(N>0){
//            if(N%5==0){
//                N-=5; count++;
//            }else if(N%3==0){
//                N-=3; count++;
//            }else{
//                N-=3; count++;
//            }
//        }
//        
//        if(N<0)
//            count=-1;
//        
//        System.out.println(count);
		
		sc.close();
	}
}
