package be_study.inherit.inherit04;

import java.util.ArrayList;
import java.util.List;

import be_study.inherit.Inherit03.BluetoothMike;		//패키지 달라~ 임포트..
import be_study.inherit.Inherit03.Mike;
import be_study.inherit.Inherit03.WirelessMike;

public class Inherit04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입변환
		//메소드재정의
		//다형성
		
		int n = 10;
		double d = 10.5;
		double d2 = 50;
		
		Mike m1 = new Mike();	//마이크 타입 = 마이크 객체
		BluetoothMike bm1 = new BluetoothMike();	//블투마이크 타입 = 블투마이크 객체
		WirelessMike wm1 = new WirelessMike();
		
		m1.volumeUp();
		bm1.volumeUp();
		wm1.volumeUp();
		
		//부모타입 변수 = 자식타입 객체
		Mike m2 = bm1;
		Mike m3 = wm1;
		
		Mike m4 = new BluetoothMike();
		Mike m5 = new WirelessMike();
		
		//BluetoothMike bm2 = new Mike(); 			//!빨간줄 	자식타입 변수 = 부모타입 객체	불가능
		//BluetoothMike bm2 = new WirelessMike();	//			다른타입 변수 = 다른타입 객체 불가능
		
		m4.volumeUp();
		m5.volumeUp();
		m4.check();
		
		
		//다형성
		
		
		
		
		
		
		
		BluetoothMike[] bArr = {bm1, new BluetoothMike(), new BluetoothMike()};
		
		Mike[] arr = { m1, bm1, wm1 };
		Mike[] arr2 = { new Mike(), new BluetoothMike(), new WirelessMike() };
			//Mike m = new Mike()			부모/자식
			//Mike m = new BluetoothMike()	다 담을수있어~
			//Mike m = new WirelessMike()
		Mike[] arr3 = new Mike[3];	//공간만 선언
		arr3[0] = new Mike();
		arr3[1] = new BluetoothMike();
		arr3[2] = new WirelessMike();
		
		ArrayList<Mike> mList = new ArrayList<Mike>();	//!임포트
		mList.add(new Mike());
		mList.add(new BluetoothMike());
		mList.add(new WirelessMike());
		
		//! 3줄 출력하네 ㅇㅅㅇ......
		for(Mike m : mList) {
			m.volumeUp();
		}
		
		
		List<Mike> mList2 = new ArrayList<Mike>();		//!임포트
		
		
		//BluetoothMike bm1 = new BluetoothMike();
		//Mike m4 = new BluetoothMike();
		
		//타입변수 기준 사용법을 알고있는 메소드만 호출 가능
		//bm1.connect();
		//m4.connect(); 	빨간줄.. 못써
	}

}
