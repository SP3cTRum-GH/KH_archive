package Homework;

import java.util.Scanner;

public class Homework0326_1 {
    public static void main(String[] args) {
        //빛의 거리 구하기 , 몇일간 가는 거리 구할지 입력받고 결과출력

        final double LIGHT_SPEED = 3e5;
        int day=0;
        double distance = 0;
        char isContinue = 0;
        Scanner s = new Scanner(System.in);

        for(;;) {
            System.out.println("몇일간 가는 거리를 계산하시겠습니까?: ");
            day = Integer.parseInt(s.nextLine());

            distance = LIGHT_SPEED * 60 * 60 * 24 * day;
            System.out.println(distance + "km");

            do {
                System.out.print("계속하시겠습니까? (y/n)");
                isContinue = s.nextLine().toLowerCase().charAt(0);

                if(isContinue != 'n' && isContinue != 'y'){
                    System.out.println("유효하지않은 입력입니다 다시 입력해주세요");
                }
            } while (isContinue != 'n' && isContinue != 'y');

            if (isContinue == 'n') {
                s.close();
                System.out.println("The End");
                break;
            }
        }
    }
}
