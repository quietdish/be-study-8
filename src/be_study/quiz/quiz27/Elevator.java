package be_study.quiz.quiz27;

public class Elevator {
	
	public static void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
	}

	public static String guide(int floor) {
		/* 메소드를 완성하시오.
		 * 
		 *  1~10 저층
		 *  11~20 고층
		 *  */
		
		if(floor >= 11) {
			return "고층";
		} else {
			return "저층";
		}
		
//		if(floor >= 11) {
//			return "고층";
//		}
//		
//		return "저층";
		
		
		//return이 보장되지 않아서 잘못된 케이스
//		if(floor >= 11) {
//			reture "고층";
//		}
//		
//		if(floor < 11) {
//		return "저층";
		
	}
}



/* 제미나..ㅋ
//파일명: Elevator.java
public class Elevator {

 // 층수에 따라 엘리베이터 종류를 반환하는 메서드
 public String guide(int floor) {
     if (floor >= 1 && floor <= 10) {
         return "저층 엘리베이터";
     } else if (floor >= 11 && floor <= 20) {
         return "고층 엘리베이터";
     } else {
         return "운행하지 않는 층입니다.";
     }
 }

 public static void main(String[] args) {
     // 객체 생성
     Elevator elevator = new Elevator();

     // 결과 출력
     System.out.println("13층 -> " + elevator.guide(13));
     System.out.println("7층 -> " + elevator.guide(7));
     System.out.println("10층 -> " + elevator.guide(10));
 }
}
*/