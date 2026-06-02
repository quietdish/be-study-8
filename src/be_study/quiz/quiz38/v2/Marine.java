package be_study.quiz.quiz38.v2;

public class Marine extends Unit { // 보병
	//int x, y; // 현재 위치

	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		this.x = x;
		this.y = y;
		System.out.println("걸어서" + x + ", " + "위치로 이동");
	}

//	void stop() {
//		/* 현재 위치에 정지 */ 
//		System.out.println("현재 위치에 정지");
//		}

	void stimPack() {
		/* 스팀팩을 사용한다 */}

}