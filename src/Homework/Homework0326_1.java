package Homework;

import java.util.Scanner;

public class Homework0326_1 {
    public static void main(String[] args) {
        //빛의 거리 구하기 , 몇일간 가는 거리 구할지 입력받고 결과출력

        final double LIGHT_SPEED = 3e5;
        int day=0;
        double distance = 0;
        String inputContinue;
        char isContinue = 0;
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        String inputDay;

        for(;;) {
            while (true) {
                System.out.print("몇일간 가는 거리를 계산하시겠습니까?: ");
                inputDay = s.nextLine();
                try {
                    day = Integer.parseInt(inputDay);
                    if(day < 0) {
                        System.out.println("양수를 입력해주세요");
                    }else{
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("유효한 날짜를 입력해주세요");
                }
            }

            distance = LIGHT_SPEED * 60 * 60 * 24 * day;
            System.out.println(distance + "km");

           while(true) {
               System.out.print("계속하시겠습니까? (y/n)");
               inputContinue = s.nextLine();
               if (inputContinue.length() != 1) {
                   System.out.println("한글자만 입력해주세요");
                   continue;
               }
               isContinue = inputContinue.charAt(0);
               if (isContinue == 'n' || isContinue == 'y') {
                   break;
               }
               System.out.println("유효하지않은 입력입니다 다시 입력해주세요");
           }


            if (isContinue == 'n') {
                s.close();
                System.out.println("The End");
                break;
            }
        }
    }
}
