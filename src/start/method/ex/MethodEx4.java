package start.method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;

        while (true) {
            menu();
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                balance = deposit(balance);
            } else if (choice == 2) {
                balance = withdraw(balance);
            } else if (choice == 3) {
                printBalance(balance);
            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                return;
            } else {
                System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    public static void menu() {
        System.out.println("----------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("----------------------------------");
    }

    public static int deposit(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입금액을 입력하세요: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;

    }

    public static int withdraw(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int amount = sc.nextInt();
        if (balance < amount) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        return balance;
    }

    public static void printBalance(int balance) {
        System.out.println("현재 잔액: " + balance + "원");
    }

}
