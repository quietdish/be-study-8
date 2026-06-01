package be_study.abst;

public class Hite extends Beverage {

	double alcol; //몇도짜리냐 6도?
	
	public void checkAlcol() {
		System.out.println("Hite 알콜 도수 확인");
	}
	
	//Hite에 빨간 줄 사라짐..
	public void checkSafety() {
		System.out.println("알콜도수문제 확인");
	}
}
