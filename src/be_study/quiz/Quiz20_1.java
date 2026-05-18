package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//메뉴1 메뉴2 메뉴3
		//수량1 수량2 수량3
		//가격1 가격2 가격3
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ배열활용버전
		
		
		//추가-----------------------------------------------------------------------------
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼", "카푸치노"}; //메뉴이름
		int[] priceArr = {3500, 4100, 4300, 4600}; //메뉴가격
		//int[] countArr = new int[3]; //메뉴주문수량
		int[] countArr = new int[menuArr.length];
		
		
		//개별 각각 변수 처리 + 하드코딩 버전 --------------
		
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		int menu; //메뉴선택입력
		int count; //수량입력
		String addOrder; //추가주문여부 입력받는 용도
		
		while(true) {
			
			
			while(true) //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ추가
			//메뉴 보여주기
			System.out.println("======메뉴======");
			for(int i=0; i<menuArr.length; i++) {
				System.out.println("%d. %-8s %7d원\n", (i+1), menuArr[i], priceArr[i]);
			}
			//System.out.println("1.아메리카노 3500원");
			//System.out.println("2.카페라떼 4100원");
			//System.out.println("3.바닐라라떼 4300원");
			System.out.println("==============");
			
			//메뉴 선택
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			if(menu>=1 && menu<=menuArr.length) { //정상범위 선택 ㅡㅡㅡㅡㅡㅡㅡㅡㅡ여기 숫자였음.
				break; //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ추가
			} else { //메뉴 잘못 선택
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				// continue; //밑에 생략
			}
		}
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ메뉴 선택은 정상적으로 완료했다 ------------보장
				
		
		
		
				//수량 선택
				System.out.print("수량 선택 : ");
				count = sc.nextInt();
				
				countArr[menu-1] += count;		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡ선택한 메뉴번호-1 위치 인덱스에 수량 추가
				
				
				/* if(menu == 1) {
					menu1Count += count;
				} else if (menu == 2) {
					menu2Count += count;
				} else { // 1 ~ 3
					menu3Count += count;
				} */
				
				//추가 주문 여부
				
				sc.nextInt(); //기존 입력값 엔터 청소용
				
				//끝나면? 주문금액 내역 출력 끝
				
				while(true) {	//y/n 제대로 입력할때까지 계속 시킴
					System.out.print("추가 주문 하시겠습니까?(y/n)");
					addOrder = sc.nextLine();
					
					
					//y 나 n 으로 입력했는가?
					if(addOrder.equals("y") || addOrder.equals("n")) {
						break;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				}
				
				//if .. y -> 계속 진행
				//if .. n -> 종료 -> 최종내역 금액출력
				
				if(addOrder.equals("n")) {
					
					//최종 수량 금액 보여주고 종료
					
					System.out.println("====================");
					int total = 0; //ㅡㅡㅡㅡㅡㅡㅡㅡㅡ추가
					for(int i=0; i<menuArr.length; i++) { //ㅡㅡㅡㅡㅡㅡㅡㅡㅡ추가
						if(countArr[i] > 0 ) { //ㅡㅡㅡㅡㅡㅡㅡㅡㅡ추가
							System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
							total = total + countArr[i]*priceArr[i];
						}
					}
					
					/* ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ필요없어져.
					if(menu1Count > 0) //추가
						System.out.printf("아메리카노 %잔 : %d원\n", menu1Count, menu1Count*3500);
					if(menu2Count > 0) //추가
						System.out.printf("카페라떼 %잔 : %d원\n", menu2Count, menu1Count*4100);
					if(menu3Count > 0) //추가
						System.out.printf("바닐라라떼 %잔 : %d원\n", menu3Count, menu1Count*4300);
					*/
					
					//총 금액
					int total = menu1Count*3500 + menu1Count*4100 + menu1Count*4300;
					System.out.println("====================");
					System.out.println("총액 : " + total);
					
					break;
				}
				
				
				
				
			} else { //메뉴 잘못 선택
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue; //밑에 생략
			}
			
			
			
			
			
		}
 
		
		
		
		
	}
}
