package d1prob;

import java.util.Scanner;

public class D1VarAndTypes {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);

        String b = "Hello Variables!";
        System.out.println(b);
        a = 50;
        System.out.println(a);

        int americano = 1500;
        int cappuccino = 2500;
        int caffelatte = 3000;
        int caffemocha = 4000;
        int frape = 10000;
//        한줄에 여러 변수 선언
        int hotTea = 1000, iceTea = 1500;


        System.out.println(americano * 5);
        System.out.println(cappuccino * 3 + caffelatte * 2);
        System.out.println(caffemocha * 1 + americano * 3);

        b = "Hi friends";
        System.out.println(b);

//        뒤에 L을 붙여서 long으로 선언됨을 표시해줌
        long longIntteger = 1000000000000000L;
//      int intInteger = 1000000000000000; <-에러발생

//      float 뒤에 F로 표시 / 주로 double을 사용
        float floatPoint = 2.1447F;
        double doublePoint = 3.14159265359;

        boolean success = false;
        boolean willSucces = true;
        success = true;
        System.out.println(success);

        char alphabat = 'a';
        char digit = '1';
        System.out.println("----------");
    /*
//      Scanner로 입렵받기
        Scanner scanner = new Scanner(System.in);
        String scannedLine = scanner.nextLine();
        System.out.println(scannedLine);

//      scanner.next<자료형>();
        int scannedInt = scanner.nextInt();
        long scannedLong = scanner.nextLong();
        System.out.println(scannedInt);
        System.out.println(scannedLong);

        float scannedFloat = scanner.nextFloat();
        double scannedDouble = scanner.nextDouble();
        System.out.println(scannedFloat);
        System.out.println(scannedDouble);

        boolean scanndedBool = scanner.nextBoolean();
        System.out.println(scanndedBool);
    */

//      "내일 봐" 출력하기
        String quote = "\"내일 봐\"'라고 말했다 ";
        System.out.println(quote);

        String doubleBack = "\\ is backslash";
        System.out.println(doubleBack);

//      엔터키, 백스페이스, 탭키
        System.out.println("개별문자: Enter \n이 다음줄은 다음 줄에 표시");
        System.out.println("name \t score");
        System.out.println("병준 \t 3.5");
        System.out.println("서용준이 \t 2.7");

    /*
        %s 문자열(String)
        %c 문자(Char)
        %d 정수(int)
        %f 실수(float, double)
     */
        String message = "미세먼지 농도 : 10(좋음)";

        int dust = 10;
        String status = "좋음";
        System.out.println(String.format("미세먼지 농도 : %d (%s)", dust, status));

        int dust_1 = 40;
        String status_1 = "매우나쁨";
        String msgTemplete = "미세먼지 노동 : %d (%s)";
        System.out.println(String.format(msgTemplete, dust_1, status_1));

//      배열
        int[] score = {80, 70, 75};
        score[0] = 90;
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);

        int studentCount = 10;
        String[] name = new String[studentCount];
        score = new int[studentCount];

        score[0] = 80;
        score[1] = 90;

        Scanner scanner = new Scanner(System.in);
        score = new int[3];
        score[0] = scanner.nextInt();
        score[1] = scanner.nextInt();
        score[2] = scanner.nextInt();
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);

        //nextLine() 유의점
        scanner.nextInt();
        scanner.nextLine();
        System.out.println(scanner.nextLine());


    }
}
