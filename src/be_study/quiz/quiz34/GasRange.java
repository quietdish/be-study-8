package be_study.quiz.quiz34;

public class GasRange {
	
	int fireCount;	//화구
	String brand;
	int price;
	
	int fireLevel;	//불세기 상태
	// 불 세기 단계 0 ~ 10
	
	// 인덕션 turnOn..
	void fireOn() {
		fireLevel = 5;
	}
	
	void fireOff() {
		fireLevel = 0;
	}
	
	void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}
	

}
