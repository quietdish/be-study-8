package be_study.quiz.quiz34;

public class TrashCan {
	
	int liter;	// 최대용량 20L	50L
	String color;
	
	int trashPercentage; //몇퍼센트 찼는가?
	
	boolean isCoverOpened;
	
	
	//- 쓰레기통을 연다
	
	void openCover() {
		isCoverOpened = true;
	}
	
	//- 쓰레기통을 닫는다
	void closeCover() {
		isCoverOpened = false;
	}

	//- 쓰레기를 채운다
	
	void setTrashPercentage(int trashPercentage) {
		this.trashPercentage = trashPercentage;
	}
	
	void insertTrash(int addPercentage) {
		trashPercentage += addPercentage;
	}
	
	void insertTrashLiter(int trashLiter) {
		
		// (현재 리터 + trashLiter) / liter -> 0.3 0.5 0.05
		//0.3 * 100 = 30%
		
	}
	
	void cleanTrash() {
		this.trashPercentage = 0;
	}
	
}

/* 쓰레기통
(*주방에 여러개가 있다)
- 몇리터
- 색상
- 용량이 몇퍼센트나 찼는지
- 쓰레기를 채운다
- 쓰레기통을 연다
- 쓰레기통을 닫는다
- 쓰레기통을 비운다 */
