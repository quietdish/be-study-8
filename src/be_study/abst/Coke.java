package be_study.abst;

public class Coke extends Beverage {

	int sugar; //당분 함량
	
	//재정의?
	public void introduce() {
		System.out.println("저는 Coke 입니다.");
	}

	@Override	//Coke 위에 마우스 add
	public void checkSafety() {
		System.out.println("당분 함량 확인");
	}
	
	
}
