package be_study.inter.inter01;

//상속 : 부모클래스를 상속받는다. 확장한다. extends

//인터페이스를 구현하겠다
public class TempObject implements TempInterface, TempInterface2 {
			//ctrl 메뉴... 오버라이드 +
						//인터페이스 다중구현 가능 (1가지이상)
	
	@Override
	public void method1() {
		// 재정의 필수
		System.out.println("method1()");
	}
	
	public void method99() {
		// 재정의 필수
		System.out.println("method99()");
	}

	@Override
	public void method2() {							//ctrl 메뉴...로 만들어짐!
		// TODO Auto-generated method stub
		System.out.println("method2()");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub			//ctrl 메뉴...로 만들어짐!
		System.out.println("method3()");
	}

}
