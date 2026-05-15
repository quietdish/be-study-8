package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		//1번 문제
		// 바깥 반복문: 줄(행)을 결정 (5줄이니까 5부터 1까지 줄어듬)
		 for (int i = 5; i >= 1; i--) {

		    // 안쪽 반복문: 별의 개수를 결정 (현재 i의 값만큼 별 찍기)
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println(); 		    
		}
		
		System.out.println();
		
		//2번 문제	
		for (int a = 1;  a <= 4; a++) {
		    for (int b = 1; b <= a; b++) {
		        System.out.print("*");
		    }
		    /* [ 실행 과정 상세 설명 ]
             * a = 1 일 때 : b는 1부터 1까지 (1번 실행)  -> 결과: *
             * a = 2 일 때 : b는 1부터 2까지 (2번 실행)  -> 결과: **
             * a = 3 일 때 : b는 1부터 3까지 (3번 실행)  -> 결과: ***
             * a = 4 일 때 : b는 1부터 4까지 (4번 실행)  -> 결과: ****
             */
		    System.out.println();
		}
		
		
		//4번 문제
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = scanner.nextInt();
		
		
		for (int i = 1;  i <= 4; i++) {

		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}    
		for (int i = 5; i >= 1; i--) {

		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		*/
		
		
		//3번 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구할 숫자를 입력하시오: ");

		int c = sc.nextInt(); // 목표 숫자

		// 1부터 목표 숫자까지 하나씩 커지며 확인
		for (int d = 1; d <= c; d++) {

		    // 목표 숫자를 현재 숫자로 나누었을 때 나머지가 0이면?
		    if (c % d == 0) {
		        // 그 숫자가 바로 '약수'입니다!
		        System.out.print(d + " ");
		    }
		}
		
		System.out.println();
		
		
		//5번 문제
		//1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산
		//최종결과는?

		/*
		
		1+
		(1+2)+
		(1+2+3)+
		(1+2+3+4)+
		...+
		...+
		(1+2+3+...+10)
		
		*/
		
		//5-1.
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				// j:1	 1 2	1 2 3	1 2 3 4 ....
				sum = sum + j;
			}
		}
		System.out.println("누적된 총합 : " + sum);
		
		//5-2.
		sum = 0;
		int currentSum = 0;
		for(int i=1; i<=10; i++) {
			// i : 1 -> 2 -> 3
			//currentSum : 0 -> 1 -> 3 -> 6
			//sum : 0 -> 1 -> 4 -> 10
			currentSum = currentSum + i; // 0+1		1+2		3+3
			sum = sum + currentSum; // 0+1	1+3		4+6
		}
		System.out.println("누적된 총합 : " + sum);
		
		//5-3.
		sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + (i * (10 - (i-1)));
		}
		System.out.println("누적된 총합 : " + sum);
		
		/* 6번 문제
		1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서
		100이 넘었는지 찾으세요.
		*/
		
		//1-2+3-4... >= 100 이 시점에 멈추기! 마지막 더한 값
		
		//6-1.
		
		int i = 1;
		int total = 0;
		
		while(true) {
			
			if(i%2 == 0) {	//짝수
				total = total - i;		//	+ (   ) ? -i : i
			} else { //홀수
				total = total + i;
			}
			// ? 아래 i++;가 이쪽에 오면 200까지 더한다네 ~
			if(total >= 100) {
				break;
			}
			
			i++;
		}
		
		System.out.println("100이 넘은 시점에 누적합 : " + total);
		System.out.println("얼마까지 계산했는가? : " + i);
		
		
		//6-2.
		
		total = 0;
		for(i=1; total<100; i++) {
			if(i%2 == 0) {
				total = total - i;
			} else {
				total = total + i;
			}
		}
		
		// i--;
		System.out.println("100이 넘은 시점에 누적합 : " + total);
		System.out.println("얼마까지 계산했는가? : " + (i-1));
		
		
		//6-3.
		
		i = 0;	//시작을 0
		total = 0;
		
		while(true) {
			i++;	// 0 -> 1로 바뀌면서 1부터 연산에 참여
			
			if(i%2 == 0) {	//짝수
				total = total - i;		//	+ (   ) ? -i : i
			} else { //홀수
				total = total + i;
			}
			
			if(total >= 100) {
				break;
			}
			
			
		}
		
		System.out.println("100이 넘은 시점에 누적합 : " + total);
		System.out.println("얼마까지 계산했는가? : " + i);
	}

}
