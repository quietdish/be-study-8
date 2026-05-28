package be_study.cls.cls13;

public class Student {
	
	String name;
	int stuNum;
	String phone;
	//..학생에 대한 속성
	
	Card card;	//학생이 들고다니는 카드
	
	// getter setter
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	
	
}
