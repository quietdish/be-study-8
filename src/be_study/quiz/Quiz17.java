package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 10; x++) {
		    for (int y = 1; y <= 10; y++) {
		        if (2 * x + 4 * y == 10) {
		            System.out.println("1. x=" + x + ", y=" + y);
		        }
		    }
		}

		System.out.println();				

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
