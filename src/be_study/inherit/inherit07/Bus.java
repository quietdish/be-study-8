package be_study.inherit.inherit07;

public class Bus extends Vehicle {
	public void run() {
		System.out.println("Bus 버스가 달립니다.");
	}
	
		//이미 부모 Object 에 존재 메소드
		// 재정의
		// 메소드 접근제한다를 좁은 범위로 줄일수 없다.
		//private String toString() { XXX
		//Object.class 257line toString <- public..
		public String toString() {
			return "BusBus";
		}
	

}