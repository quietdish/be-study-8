package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		/* +자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 5
		결과 : 90
		*/
		
					
//		int[] arr1 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
//		System.out.print( "몇번째 수인가요?" );
//		int index = sc.nextInt();
//		
//      System.out.println("결과 : " + arr1[index - 1]);
        
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];  // 5개 정수형 int 배열 선언 (?스페이스로 1줄로 입력)
		
		System.out.print("정수 5개를 입력하시오.");
		//배열없이
		//arr[0] = sc.nextInt();
		//arr[1] = sc.nextInt();
		//arr[2] = sc.nextInt();
		//arr[3] = sc.nextInt();
		//arr[4] = sc.nextInt();
		
		//index 0 ~ 4
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}	
		
		System.out.print( "몇번째 수인가요?" );
		int num = sc.nextInt();

		//순서	: 1 2 3 4 5
		//index : 0 1 2 3 4
		
		System.out.println("결과 : " + arr[num - 1]);
        
		
        System.out.println("------------------------");       
//		거꾸로 출력
// 		입력 1 2 3 4 5
//      출력 5
//      출력	  4
//		출력     3
//		출력	      2
//		출력			1
        
        int[] numbers = new int[5];
        
        System.out.print("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("결과 : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        
        
        
        System.out.println();
        System.out.println("------------------------");
//		반복문
        
// 		배열을 사용하지 않고 숫자 규칙만 이용할 때
        for (int i = 0; i < 4; i++) {       // 4줄을 만들겠다
            for (int j = 1; j <= 4; j++) {  // 한 줄에 4개씩 숫자를 쓰겠다
                System.out.print((i * 4 + j) + "\t");
            }
            System.out.println();
        }
        
        
		
	}

}	

/* 
	+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
	몇번째 수인가요? : 그에 해당하는 수를 출력
	ex) 10 20 30 50 90
	몇번째 수인가요? 5
	결과 : 90
	
	2.
	+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
	받은후에 순서를 거꾸로 출력하세요.
	ex) 1 2 3 4 5
	결과 : 5 4 3 2 1
	
	3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
	(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
	1   2   3   4
	5   6   7   8
	9  10 11 12
	13 14 15 16
*/