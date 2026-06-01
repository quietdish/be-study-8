package be_study.inter.inter03;

public class GalaxyPhone implements Callable, Connectable  {
				// add..
	
	int callStatus; // 전화 상태변수
	
	@Override
	public void call() {
		System.out.println("GalaxyPhone call()");
		//기능
		//callStatus = 1;
		callStatus = Callable.CALL_ON;	//상수화 해놨대.. (Callable.java)
	}

	@Override
	public void connect() {
		System.out.println("GalaxyPhone connect()");
	}

}
