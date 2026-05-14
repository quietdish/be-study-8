package be_study.refer;

public class Arr03 {

	public static void main(String[] args) {
		
		
		int[] arr1 = {1,2,3};
		
		//			ㅁ ㅁ ㅁ
		//			1 2 3
		//	index	0 1 2
		
		// arr[0] <-- int 타입변수
		
		System.out.println( arr1[0] == arr1[0] );
		System.out.println( arr1[0] == arr1[2] );	//값 == 값
		
		String[] arr2 = {"A", "B", "C"};

		System.out.println(arr2[0] == arr2[2]);  //스트링은 주소 비교
		//					String		String
		//					참조 주소		참조 주소
		//					"A"			"C"
		System.out.println( arr2[0].equals(arr2[2]) ); //내부 문자열 값 비교
	
		String[][] arr3 = { {"A", "B", "C"}, {"D", "E", "F"} };
		
		//				A B C
		//				D E F
		
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
	
		System.out.println( arr3[0] == arr3[1]);		//주소 비교
		System.out.println( arr3[0][0] == arr3[1][1]);	//주소 비교
		System.out.println( arr3[0][0].equals(arr3[1][1]) );	//값 비교
	
	
	}
	

}
