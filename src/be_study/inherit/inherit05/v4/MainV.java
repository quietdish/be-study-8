package be_study.inherit.inherit05.v4;

import java.util.ArrayList;
import java.util.List;

public class MainV {

	public static void main(String[] args) {
		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();	//부모타입 = 자식객체
		
		//강제 타입변환 해줘야됨..
		DustCleaner dc1 = (DustCleaner)c2;
		//DustCleaner dc2 = (DustCleaner)c1;	//앙됨.!
		
		Cleaner c3 = new FloorCleaner();
		Cleaner c4 = new WindowCleaner();
		
		FloorCleaner fc = (FloorCleaner)c3;
		WindowCleaner wc = (WindowCleaner)c4;
		//WindowCleaner wc2 = (WindowCleaner)c3; 오류남!
		
		
		
		List<Cleaner> list = new ArrayList<>();
		
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		
		//사용법이 같음.
		for(Cleaner c : list) {
			c.doClean();
			// 실행시 각자 재정의된 기능을 실행
			//c.arrangeItem();				//그냥 부르지 못하는 중...
			
			//본체에 들어있는게 어떤 클래스의 인스턴스냐? 출신
			if( c instanceof DustCleaner) {
				DustCleaner dcc = (DustCleaner)c;
				dcc.arrangeItem();
			}
			
			//DustCleaner dcc = (DustCleaner)c;
			//dcc.arrangeItem();
		}
		
	}	

}
		
		// 동일한 사용법으로 다양한 실행 결과를 도출
		// 다형성
		
		
		
		
		
		//list.get(0).removeDust();	//실행안됨...빨간줄
					// 클리너에 붙여넣기해서 이제 인식됨.
		
		//! 씨클리너가 3개 다 하게되버린.?
//		for(Cleaner c : list) {
//			c.removeDust();
//			c.cleanFloor();
//			c.washWindow();
//		}
//		
		
		
		
		
		//V2
//		DustCleaner[] dustArr = new DustCleaner[3];
//		dustArr[0] = new DustCleaner();
//		dustArr[1] = new DustCleaner();
//		dustArr[2] = new DustCleaner();
//		
//		//ArrayList<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
//		//List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
//		List<FloorCleaner> floorList = new ArrayList<>();		//! 임포트
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
//		
//		List<WindowCleaner> windowList = new ArrayList<>();	
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		
//		for(int i=0; i<dustArr.length; i++) {
//			dustArr[i].removeDust();
//		}
//		
//		for(int i=0; i<floorList.size(); i++) {
//			floorList.get(i).cleanFloor();
//		}
//		
//		for(WindowCleaner wc : windowList) {
//			wc.washWindow();
//		}
		
//	}
//
//}
