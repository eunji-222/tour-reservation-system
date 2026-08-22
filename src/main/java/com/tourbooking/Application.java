package com.tourbooking;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("===== 기항지 투어 예약 시스템 =====");
            System.out.println("1. 예약 등록");
            System.out.println("2. 예약 조회");
            System.out.println("3. 예약 변경");
            System.out.println("4. 예약 취소");
            System.out.println("5. 종료");
            System.out.println();
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("[예약 등록]");
                    break;
                case 2:
                    System.out.println("[예약 조회]");
                    break;
                case 3:
                    System.out.println("[예약 변경]");
                    break;
                case 4:
                    System.out.println("[예약 취소]");
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("[오류] 1~5 사이의 번호를 입력해주세요.");

            }
        }

        }

    }



