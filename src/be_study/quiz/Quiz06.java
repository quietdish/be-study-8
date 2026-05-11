package be_study.quiz;

import java.util.Scanner; // 1. Scanner를 쓰기 위해 상단에 추가

public class Quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 2. 입력 도구 준비

	    /* 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
	    삼각형의 넓이 = 밑변 * 높이 / 2 ; */
        // --- 1번. 삼각형 넓이 ---
        System.out.print("1. 삼각형의 밑변과 높이 입력: ");
        int width = sc.nextInt();  // 밑변 변수 선언 및 입력 [cite: 300, 302]
        int height = sc.nextInt(); // 높이 변수 선언 및 입력
        
        // 정수끼리 나누면 소수점이 버려지므로 2.0으로 나눕니다 [cite: 233, 305]
        double result1 = width * height / 2.0; 
        System.out.println("삼각형 넓이: " + result1);
        
	     /* 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
	     사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2; */
        // --- 2번. 사다리꼴 넓이 ---
        System.out.print("2. 사다리꼴 윗변, 밑변, 높이 입력: ");
        int top = sc.nextInt();
        int bottom = sc.nextInt();
        int h = sc.nextInt();
        
        // 덧셈을 먼저 하도록 반드시 괄호를 사용하세요 [cite: 234, 252]
        double result2 = (top + bottom) * h / 2.0; 
        System.out.println("사다리꼴 넓이: " + result2);
        
        
	    /* 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
	    모두에게 공정하게 동일한 숫자의 과자를 나누어주면
	    한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요. */
        // --- 3번. 과자 나누기 ---
        int snacks = 100;
        int students = 24;
        
        int perPerson = snacks / students; // 한 명당 받는 개수(몫) [cite: 236, 253]
        int remains = snacks % students;   // 남는 개수(나머지) [cite: 237, 254]
        
        System.out.println("3: 1인당: " + perPerson + "개, 남은 과자: " + remains + "개");

        
	    /* 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
	    158
	    백의자리 : 1
	    십의자리 : 5
	    일의자리 : 8 */
        // --- 4번. 자릿수 분리 (예: 158) ---
        System.out.print("4. 세 자리 정수 입력: ");
        int num = sc.nextInt(); // 158 입력 가정
        
        int hundred = num / 100;        // 100으로 나눈 몫 (1) [cite: 239, 255]
        int ten = (num % 100) / 10;     // 100으로 나눈 나머지(58)를 다시 10으로 나눈 몫 (5) [cite: 239, 256]
        int one = num % 10;             // 10으로 나눈 나머지 (8) [cite: 239, 257]
        
        System.out.println("백의자리: " + hundred + ", 십의자리: " + ten + ", 일의자리: " + one);

        // --- 5번. x와 y 값 바꾸기 (Swap) ---
        int x = 10;
        int y = 20;
        System.out.println("5. x=" + x + ", y=" + y);
        
        // 값을 잠시 보관할 임시 변수 temp가 핵심입니다 [cite: 241, 271, 288]
        int temp = x; // 1. x(10)를 temp에 보관 [cite: 242, 257]
        x = y;        // 2. x 자리에 y(20)를 넣음
        y = temp;     // 3. y 자리에 보관했던 temp(10)를 넣음 [cite: 243]
        
        System.out.println("바뀐 결과: x=" + x + ", y=" + y);
    }
}