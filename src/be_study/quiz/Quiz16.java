package be_study.quiz;

public class Quiz16 {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        // 저장 부분
        for (int i = 0; i < arr.length; i++) {
            // [수정 1] j 반복문인데 i++로 되어있던 부분을 j++로 수정
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j) {
                    arr[i][j] = 1; // 대각선은 1
                } else if (i > j) {
                    arr[i][j] = 3; // 아래쪽 삼각형은 3
                } else {
                    arr[i][j] = 2; // 위쪽 삼각형은 2
                }
            }
        }

        // 출력 부분 (확인용)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}