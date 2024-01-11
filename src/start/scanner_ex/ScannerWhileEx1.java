package start.scanner_ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = sc.next();  // nextLine은 \n을 읽음. 따라서 next로 바꿔줌

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();  // 10/n에서 10만 가져감

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }


        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();  // 10/n에서 10만 가져감
            sc.nextLine();  // 숫자 입력 후의 줄바꿈을 처리하도록 추가해줌.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }

    }
}
