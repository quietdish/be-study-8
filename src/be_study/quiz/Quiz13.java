package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		System.out.print("정수를 입력하시오.");
		int num1 = sc.nextInt();
		
		if ( num1 % 2 == 0 ) {
		// num1%2 == 0 짝
		// num1%2 == 1 홀
		// num1%2 != 0 홀
		// num1%2 != 1 짝
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	
		
		// 2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		System.out.println("정수를 입력하시오.");
		int num2 = sc.nextInt();
		
		if ( num2 % 7 == 0 ) {
			System.out.println("7의 배수입니다");
		} else {  
			System.out.println("아닙니다");
		}
		
		
		//3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		
		int sum = 0;  // 합계 저장할 변수

		for ( int i = 1; i <= 1000; i++ ) {
		    if ( i % 5 == 0 ) {   // 5의 배수면
		        sum = sum + i;  // 더하기 sum += i
		    }
		}
		System.out.println("1~1000 수 중에서 5의 배수의 합 : " + sum);
		
		
		// 4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		System.out.println("1부터 50사이의 숫자를 입력하시오.");
		int num4 = sc.nextInt();
		
		for ( int i = 0; i < num4; i++ ) {
			System.out.print( "*" );
		}
		
		
		// 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		System.out.println();
		System.out.println("1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)");
		
		int result = 0;
		
		for ( int i = 1; i <= 10; i++ ) {
			if ( i % 2 == 1 ) {
				result = result + i;
			} else {
				result = result - i;
			}
			
		}
		
		System.out.println(result);
		
		/* 6. 정수를 1부터(1+2+3+4.....) 계속 누적으로 더한다. 
		 이런 패턴으로 누적으로 더해진 누적 값이 1000 보다 작으면 계속 더하고
		 1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		*/
				
		/* int sum = 0;
		for(int i=1; i<=1000; i++) {
			
			// sum:990	+ 45 -> 1035
			// i : 45 46
		*/
		
		sum = 0;
		int i = 1;
		
		while( sum < 1000 ) {
			sum = sum + i;  // sum += i;
			i = i + 1;
		}
		
		System.out.println( "1000이 넘어간 시점에 누적 합 : " + sum );
		
		
		sum = 0;
		i = 1;
		while(true) {
			sum = sum + i;
			i = i + 1;
			
			if(sum >= 1000) {
				break;
			}
		
		}
		System.out.println( "1000이 넘어간 시점에 누적 합 : " + sum );	
		
		
		/* 7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		ex) 입력 3
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		...
		3 * 9 = 27
		*/
		
		System.out.println("1~9까지 중 보고싶은 구구단은? : ");
		int num = sc.nextInt();
		
		for(int j=1; j<=9; j++) {
			
			System.out.printf("%3d * %3d = %3d\n", num, j, (num*j) );
			// 입력한숫자 * j = 곱한결과
		}
	}	

}
