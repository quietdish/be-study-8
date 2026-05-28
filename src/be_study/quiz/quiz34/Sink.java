package be_study.quiz.quiz34;

public class Sink {

	int width;
	int height;
	int depth;
	
	String color;
	String material; //재질
	
	int getWidth() {	//mm 기준
		return width;
	}
	
	double getWidthAsCm() { //cm 변환 반환
		return width / 10.0;	//205mm -> 20.5cm
	}
	
	double getWidthAsMeter() { //M단위로 변환 반환
		return width / 100.0;		//205mm -> 0.205m	1200mm -> 1.2m
	}
	
	
	
}
