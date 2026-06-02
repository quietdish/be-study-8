package be_study.quiz.quiz38.v1;

//프로그램 실행을 위한 클래스 추가
class RunMain {
	public static void main(String[] args) {
		
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Dropship d1 = new Dropship();
		
		Unit[] arr = {t1, m1, d1};
		
		for(Unit u : arr) {
			u.move(10, 20);
			u.stop();
		}
		
		t1.changeMode();
		m1.stimPack();
		d1.load();
		d1.unload();
		
		
//		Unit u1 = new Unit();	//?? 어색함..
//		Unit u2 = new Unit();	//빨간줄..
		
//		// 1. 설계도를 바탕으로 진짜 마린을 한 마리 만듭니다.
//		Marine marine = new Marine();
//
//		// 2. 마린에게 움직이라고 명령을 내립니다.
//		marine.move(10, 20);
//
//		// 3. 마린에게 멈추라고 명령을 내립니다.
//		marine.stop();
	}
}