package be_study.quiz.quiz26;

public class Circle {
	private double radius;
    
    //Circle(){		
	//}
	
    void setRadius(double radius) {
        this.radius = radius;
    }
    
    //int radius; //반지름 저장용	필드변수
    
//    void setRadius(int radius) {
//    	this.radius = radius;
//    }

    double getArea() {
    	//원 넓이 : 반지름 * 반지름 * 3.14

        return radius * radius * 3.14;
    }
}