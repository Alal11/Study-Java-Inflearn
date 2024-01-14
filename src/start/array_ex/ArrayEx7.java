package start.array_ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int[4][3];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수: ");
            scores[i][0] = sc.nextInt();
            System.out.print("영어 점수: ");
            scores[i][1] = sc.nextInt();
            System.out.print("수학 점수: ");
            scores[i][2] = sc.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            int sum = scores[i][0] + scores[i][1] + scores[i][2];
            System.out.println(i + 1 + "번 학생의 총점: " + sum + ", 평균: " + sum / 3.0);
        }
    }
}
