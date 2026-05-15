package be_study.quiz;

import java.util.Scanner;

public class Quiz17_1 {

	public static void main(String[] args) {
		
	/* 2x + 4y = 10 이 만족하는
	모든 x, y 쌍을 구하시오.
	(x와 y는 자연수 1~10)
	
	2x + 4y = 10
	x:1 y:2
	2*1 + 4*2 = 10
	
	s:3 y:1
	2*3 + 4*1 = 10
	
	x:1~10
	y:x~10	
	*/
		// 1번째 방법
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(2*x + 4*y == 10) {
					System.out.printf("(x:%d y:%d)\n", x, y);
				}
			}
		}
		
		// 2번째 방법
		//
		//
		
		System.out.println();
		// 3번째 방법
		for(int x=1; 2*x<=10; x++) {
			for(int y=1; 4*y<=10; y++) {
				
				if(2*x + 4*y == 10) {
					System.out.printf("(x:%d y:%d)\n", x, y);
				}
			}
		}
		
		/*
		2. 정수 2개를 입력 받아서,
		아래 계산 결과를 출력하시오.
		큰수 - 작은수
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하시오.");		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println();
		if (a > b) {
			System.out.println("결과 : " + (a - b) );
		} else {
			System.out.println("결과 : " + (b - a) );
		}
		
		System.out.println();
		
		System.out.println("4개의 윷을 입력하시오. (0 또는 1)");
		
		// 0 = 모, 1 = 도, 2 = 개, 3 = 걸, 4 = 윷
		int sum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		
		
		if (sum == 1) System.out.println("도");
		else if (sum == 2) System.out.println("개");
		else if (sum == 3) System.out.println("걸");
		else if (sum == 4) System.out.println("윳");
		else if (sum == 0) System.out.println("모");
		
		System.out.println();
		
		System.out.println("숫자를 입력하시오.");
		int num = sc.nextInt();
		
		for ( int i = 0; i < num; i++ ) {
			System.out.print( "*" );
		}
		
	}

}

/*

1.
2x + 4y = 10 이 만족하는
모든 x, y 쌍을 구하시오.
(x와 y는 자연수 1~10)

2.
정수 2개를 입력 받아서,
아래 계산 결과를 출력하시오.
큰수 - 작은수

3.
윷놀이 게임
4개의 윷을 입력받고 결과를 출력하시오.
(뒷도는 없습니다!)
0 : 안 뒤집어진 상태
1 : 뒤집어진 상태
ex) 입력 0 0 1 0
결과 도
입력 0 1 0 1
결과 개

4. 입력받은 수 만큼 별 출력하기
ex) 4
****
5
*****

*/