package be_study.inherit.inherit07;

//자바에 모든 클래스는 기본으로 extends Object 가 숨겨져있음(명시안해도)
// public class Driver extends Object { ..상속..단일..
								//Object.class 257line toString
public class Driver {		
	//운전자 역할 (상호작용)
	
	public void driveBus(Bus bus) {
		System.out.println("운전자 driveBus");
		bus.run();		
	}
	
	public void driveTaxi(Taxi taxi) {
		System.out.println("운전자 driveTaxi");
		taxi.run();
	}
	
	//Vehicle vehicle = ?
	//Vehicle vehicle = new Vehicle() Bus() Taxi()
	public void drive(Vehicle vehicle) {
		System.out.println("운전자 drive");
		vehicle.run();
		
	}
	
	// toString 메서드 선언(생성)
	// -> 실제로 메서드 재정의(오버라이딩)
	public String toString() {
		return "이것은 Driver 입니다.";
	}
}
