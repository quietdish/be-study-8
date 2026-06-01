package be_study.inter.inter03;

public interface Callable {
	//기능 : 전화를 걸수있는.. 구현해라,,
	
	//전화 상태 코드 관리
	public static final int CALL_ON = 1; //전화 중 상태 선언..
	public int ALL_OFF = 2; //전화 안하는 중 상태
	
	// Callable.CALL_ON  	인터페이스명.(쩜) 
	// Callable.CALL_OFF
	
	
	
	
	public void call(); //전화걸기 기능 필수
	
	
}
