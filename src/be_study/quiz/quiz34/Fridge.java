package be_study.quiz.quiz34;

public class Fridge {
	
	String brand;
	int liter;
	int doorCount;	//문 2개 4개..
	
	IceTray iceTray;				//안에 뭔가 있따!
	
	boolean isPowerOn;	//상태변수
	
	int temperature;	//현재 온도	(상태변수)
	
	//온도 조절 	+200도 -500도
	//온도 조절이 가능한 범위 -20 ~ 10
	//				모델별로 다르........
	int maxTemperature; //최대 온도
	int minTemperature; //최저 온도
	
	void powerOn() {	//켜졌다고해-
		isPowerOn = true;
	}

	void powerOff() {	//전원끄기
		isPowerOn = false;
	}
	
	//온도조절하기
	
	// up down 
	// 온도세팅()
	// 온도조절(매개변수)
	
	void tempUp() {		//온도 1 올리기 return 없음
		if(temperature < maxTemperature)
			temperature++;
	}
	
	void tempDown() {
		if(temperature > minTemperature)
			temperature--;
	}
	
	int tempUp2() {		//온도 1 올리고 올린값 return
		temperature++;
		return temperature;
	}
	
	int tempDown2() {
		temperature--;
		return temperature;
	}
	
	boolean tempDown3() {
		if(temperature < maxTemperature) {
			temperature++;
			return true;
		} else {
			return false;
		}
	}
	
	int tempDown4() {
		temperature--;
		return temperature;
	}
	
	void setTemperature(int temperature) {
		
		if(temperature > maxTemperature)
			temperature = maxTemperature;
		
		if(temperature < minTemperature)
			temperature = minTemperature;
		
		this.temperature = temperature;
	}
	
	//한개로 매개변수를 잘 넘겨
	// controlTemperature(1)	controlTemperature(2) ..
	
	void controlTemperature(int flag) {
		if(flag == 1)
			temperature++;
		else
			temperature--;
	}
	
	//
	void controlTemperature(boolean isUp) {
		if(isUp)
			temperature++;
		else
			temperature--;
	}
	
	void controlTemperature2(int change) {
		//최대 최저 온도 필터
		temperature += change;
		
	}
}

/* 냉장고
- 어느 브랜드인지
- 몇리터 짜리인지

- 전원을 켤수 있다 -메소드
- 온도조절을할수있다(온도 up 또는 온도 down)
- 문이 몇개인지 */
