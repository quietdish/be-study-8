package be_study.cls.cls13;
//출결 체크 도구
public class AttendTool {
			//상태값
	boolean isPowerOn; //전원 켜짐 여부
	String org; //어떤 조직/회사 위한 도구
	
	
	public void powerOn() {	// 전원 켜는 기능
		isPowerOn = true;	// 전원켜진 상태값 -> true -> 켜진상태
		// 필요한 로직 코드
		System.out.println("전원이 켜졌습니다.");
	}


	
	//출결체크
	public boolean checkAttend(Card card) {
		
		//출결 체크
		// 카드 id 확인 -> 누구 카드니-> 
		//로직 판단 ....

		System.out.println(card.owner + " 소유의 ");
		System.out.printf("%s 소유의 %s 카드 확인\n", card.owner, card.brand);
		//출결체크 성공
		return true;
		
		//return false;
		}
	
	// 출결체크 결과 -> 기준코드 	1:출근성공 2:실패 3:퇴근성공 .
	public int checkAttend2(Card card) {
		
		System.out.printf("[checkAttend2] %s 소유의 %s 카드 출결 확인\n", card.owner, card.brand);
		
		return 1; //출석처리성공
		
	}
	
	
	public boolean checkAttend(Card card, Student student) {
		
		
		System.out.println("카드 소유주 : " + card.owner);
		System.out.println("카드 태그 학생 : " + student.name);
		
		if( card.owner.equals(student.name )) {
			return true;
		}
	
		return false;
	
	}
	
	//출결 체크할때 학생정보만 전달 -< 학생정보 내부에 card 객체 존재 -> 카드 내부에 정보
	public boolean checkAttend(Student student) {
		// student.name
		// student.card
		// student.card.owner

		// == 비교 로직			Main 50 boolean.....
		return true;
	
	}
	
}