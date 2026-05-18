package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		/* 1.
		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		모든 경우의 수를 출력하는 프로그램을 작성하시오. */
		
		int count = 0; //필수
		
		for (int k=1; k<=6; k++) {
			for (int l=1; l<=6; l++) { //주사위1 : 1~6
				if (k+l == 6) {
					System.out.println(k + "," + l);
					count++;
				}
			}
		}
		
		System.out.println("총 경우의 수 : " + count + "가지");
		
		System.out.println();
		
		/* 2.
		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		1) Math.random() 활용
		2) int[] lotto = new int[6]; 활용
		
		ㅡ 6개를 1개씩 중복 체크하면서 순서대로 뽑기
		-> 하나 뽑기
			-> 지금 하나 뽑은게 기존에 중복되는 수가 있나? -> 다시 뽑기
			-> 중복되는게 없다? -> 저장하고 다음 숫자 뽑기
		-> 언제까지? 6개 다 뽑을떄까지
		-> 지금 몇개까지 뽑은 상태? -> 관리 (별도의 변수로.. 기록/저장)
		
		
		0	0	0	0	0	0
		20	30	21	35	12	13
		*/
		
		int[] lotto = new int[6];	//6개의 서로 다른 수		index: 0 1 2 3 4 5
		int index = 0; // 0
		boolean isDuplicated = false; //중복여부
		
		//while문 활용
		//흐름 그대로 코드화
		while(true) {		
			//랜덤값 뽑기 1~45
			int value = (int)(Math.random()*45) + 1;
			
			isDuplicated = false;
			
			for(int i=0; i<index; i++) {
				if(lotto[i] == value) {
					isDuplicated = true;
					break;
				}
			}
		
		
			//중복여부
			//
			/*
			if(isDuplicated) {
				continue;
			} else {
				lotto[index] = value;
				index++;
			}
			*/
			
			if(!isDuplicated) {
				lotto[index] = value;
				index++;
			}
			
			if(index == 6) { //6개 숫자 다채움
				break;
			}
		}
		
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	
		System.out.println();
		//for문 활용
		
		//단순 랜덤값 순서대로 1회 저장 -> 중복 발생
		
		for (int i=0; i<lotto.length; i++) {
			// 		   (int)(Math.random()*갯수(범위)) + 시작숫자
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//출력
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		
        /*
        4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
        
        각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.

        ex)
        int[][] arr =
        {
        {10, 20, 30},
        {20, 30, 40},
        {30, 40, 50}
        };
        이 주어지는 경우 최종 결과는
        10 20 30 60
        20 30 40 90
        30 40 50 120
        60 90 120 270
        
        각행의 마지막 열 인덱스 3 -> 누적 합
        각열의 마지막 행 인덱스 3 -> 누적 합
        전체 마지막 행/열 인덱스 3 3 -> 누적 합
        */
	        
        int[][] arr = {
				            {10, 20, 30},
				            {20, 30, 40},
				            {30, 40, 50}
        				};
        
        int[][] resultArr = new int[arr.length + 1][arr[0].length + 1];
        				 // new int[4][4];
        
        for (int i=0; i<arr.length; i++) { //int i=0; i<3; i++
        	for (int j=0; j<arr[i].length; j++) { //int j=0; j<3; j++
        		resultArr[i][j] = arr[i][j]; //원래 위치 복사
        		
        		resultArr[i][arr[i].length] += arr[i][j]; 
        				//[i][3]
        		resultArr[arr.length][j] += arr[i][j]; 
        				//[3][j]
        		resultArr[arr.length][arr[i].length] += arr[i][j]; 
        				//[3][3]
        	}
        }
        
        // 최종 결과 출력하기
        for (int i = 0; i < resultArr.length; i++) {
        				//i<4;
            for (int j = 0; j < resultArr[i].length; j++) {
            				//j<4;
                System.out.printf(resultArr[i][j] + " ");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
	    
        System.out.println();
        
        //3. (퀴즈원문 맨아래)
  		// 3개 반, 각 반 5명 평균점수
  		// 이차원 배열 선언
  		
  		/*
  		 
  		전체 반 + 점수 통합
  		전체반점수[3][5]
  	
  		i:0	1반 ㅁㅁㅁㅁㅁ
  		i:1	2반 ㅁㅁㅁㅁㅁ
  		I:2	3반 ㅁㅁㅁㅁㅁ
  		 
  		 */
  		
  		Scanner sc = new Scanner(System.in);
  		
  		int[][] scoreArr = new int[3][5];
  		
  		int totalSum = 0;
  		//15명 총점 누적할 변수
  		
  		//데이터 입력, 반별 평균 계산
  		for (int i = 0; i < scoreArr.length; i++) { //반의 개수
  			int classSum = 0;
  			
  			System.out.println((i + 1) + "반 학생들의 점수 :");
  			
  			for (int j = 0; j < scoreArr[i].length; j++) { //반의 학생 수
  				// int ??
  				scoreArr[i][j] = sc.nextInt();
  				
  				classSum += scoreArr[i][j];
  				totalSum += scoreArr[i][j];
  			}
  			
  			double classAvg = classSum / 5;
              System.out.println((i + 1) + "반 평균 : " + classAvg);
              System.out.println();

  	        double totalAvg = totalSum / 15;
  	        
  	        System.out.println("전체 평균 : " + totalAvg);
  		}
      	        
	}
}

/*

3번 문제래~
우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
(*가능한 효율적인 구조를 생각해보세요)

ex)
1반 : 10 10 10 10 10
2반 : 20 20 20 20 20
3반 : 30 30 30 30 30

1반 평균 : 10
2반 평균 : 20
3반 평균 : 30
전체 평균 : 20

*/