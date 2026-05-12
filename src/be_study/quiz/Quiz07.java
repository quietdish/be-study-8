package be_study.quiz;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {
		
		/* Scanner sc = new Scanner(System.in);
		
		System.out.print("1~24 사이의 숫자를 입력하세요:");
		
		int time = sc.nextInt();
		
		//
		 if( Time < 1 || nowTime > 24 ) {
		 } else { 
		 } 
		
		
		if( time >= 1 && time <= 24 ) {
			System.out.println("잘못입력했습니다.");
		}
				
			if( time <= 12 ) { //오전 1 ~ 12
			
				if( time < 7 ) {
				System.out.println("오전입니다.");
				System.out.println("이른 오전입니다.");		
				} else {
					System.out.println("오후입니다.");
					System.out.println("늦은 오전입니다.");
				}
				
			} else {
				
				if( time < 19 ) {
					System.out.println("오후입니다.");
					System.out.println("이른 오후입니다.");		
					} else {
						System.out.println("오후입니다.");
						System.out.println("늦은 오후입니다.");
				}
			*/
		
		//3번 아래 코드를 swtich 문으로 변경

		/* String localNum = "031";
		// switch 문으로 변경
		if ( localNum.equals("031") ){
		System.out.println("경기도입니다");
		}
		if ( localNum.equals("02") ){
		System.out.println("서울입니다.");
		}
		if ( localNum.equals("041") ){
		System.out.println("충남입니다");
		}
		if ( localNum.equals("051") ){
		System.out.println("부산입니다");
		}
		
		*/
		
		
		//3번 아래 코드를 swtich 문으로 변경

		
		/* String localNum = "031";
		// switch 문으로 변경
		if ( localNum.equals("031") ){
			System.out.println("경기도입니다");
		}
		if ( localNum.equals("02") ){
			System.out.println("서울입니다.");
		}
		if ( localNum.equals("041") ){
			System.out.println("충남입니다");
		}
		if ( localNum.equals("051") ){
			System.out.println("부산입니다");
		}
		
		switch(localNum) {
		case "031":
			System.out.println("경기도입니다");
			break;
		case "02":			
			System.out.println("서울입니다.");
			break;
		case "041":
			System.out.println("충남입니다");
			break;
		case "051":
			System.out.println("부산입니다");
			break;
		}
		
		*/
		
		
		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다. <<<<<<<<<<

		/* if( score >= 90) {
		System.out.println("학점 A");
		} else if ( score >= 80) {
		System.out.println("학점 B");
		} else if (score >= 70) {
		System.out.println("학점 C");
		} else if (score < 70) {
		System.out.println("학점 F");
		} */
		
		int score = 71
				
		if( score >= 90) {
			System.out.println("학점 A");
			} else if ( score >= 80) {
			System.out.println("학점 B");
			} else if (score >= 70) {
			System.out.println("학점 C");
			} else if (score < 70) {
			System.out.println("학점 F");
			}
		
		switch(score) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println("학점 A");
			break;
		switch(score) {
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:
			System.out.println("학점 B");
			break;
		switch(score) {
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
		case 70:
			System.out.println("학점 C");
			break;
		default :
			System.out.println("학점 F");
			break;
		}
		
//		int score10 = score/10;	// 10의 자리 위쪽 숫자!
//		
//		switch(score10)
//		
		
		
		
		
		
	}
			
}
		
	
		
	

