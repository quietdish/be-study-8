package be_study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
	
		System.out.println("1.");		
		
		int x = 2;
		int y = 3;
		int z;
		
		System.out.println("x="+x + " y="+y);
		System.out.println(x + y);
		System.out.println(x++ + y++);
		System.out.println("x="+x + " y="+y);
		z = ++x + ++y;							// 15줄 참조...
		System.out.println("x="+x + " y="+y);
		z--;
		x += --y;
		System.out.println("x="+x + " y="+y + " z="+z);
		x = 10;				//x:10 y:4 z:8
		z= x/y++;			// 10/4 -> 2  x:10 y:5 z:2
		System.out.println("x="+x + " y="+y + " z="+z);
		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z);
		System.out.println("x="+x + " y="+y + " z="+z);
		
		/*
			x=2 y=3
			5
			5
			x=3 y=4
			x=4 y=5
			x=8 y=4 z=8
			x=10 y=5 z=2
			x=20 y=6 z=2
			x=10 y=6 z=2
		*/
		
		
		System.out.println("2.");
		
		
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a<b) && (c>=a));
		System.out.println( (a == b) || (a >= b) || (c >10));
		boolean result = !(c == 3);
		System.out.println( result );
		
		
		
		System.out.println("3.");
		// 조건식 ? 앞 : 뒤
		//  	  참	  거짓
		/* 점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
			6000원 이하 -> "훌륭"
			6000원 초과 ~ 8000원 -> "선방"
			8000원 초과 ~ 12000원 -> "눈물"
			12000원 초과 -> "물로배채우기"
			
		 	int menuPrice = 30000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
			String result = ________;
			System.out.println(result); */
		
		int menuPrice1 = 5900;
		
		String result1 = (  menuPrice1 <= 6000 ) ? "훌륭" :		
						(  menuPrice1 <= 8000 ) ? "선방" :		
						(  menuPrice1 <= 12000 ) ? "눈물" : "물로배채우기";
		
		int menuPrice2 = 8500;
				
		String result2 = (  menuPrice2 <= 6000 ) ? "훌륭" :		
						(  menuPrice2 <= 8000 ) ? "선방" :		
						(  menuPrice2 <= 12000 ) ? "눈물" : "물로배채우기";
		
		int menuPrice3 = 13000;
		
		String result3 = (  menuPrice3 <= 6000 ) ? "훌륭" :		
						(  menuPrice3 <= 8000 ) ? "선방" :		
						(  menuPrice3 <= 12000 ) ? "눈물" : "물로배채우기";
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
//		int menuPrice4 = 13000;
//		
//		String result = ( menuPrice1 <= 6000 ? "훌륭" :
//						 ( menuPrice2 <= 8000 ? "선방" : ( menuPrice2 <= 12000 ) ? "눈물" : "물로배채우기" ) ) );

	}

}
