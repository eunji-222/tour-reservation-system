package com.tourbooking;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("===== 기항지 투어 예약 시스템 =====");
            System.out.println("1. 예약 등록");
            System.out.println("2. 예약 조회");
            System.out.println("3. 예약 수정");
            System.out.println("4. 예약 취소");
            System.out.println("5. 종료");
            System.out.println();
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            System.out.println(choice + "번을 선택하셨습니다.");
            System.out.println();
        }

        }

    }



