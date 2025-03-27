package Homework;

import java.util.Scanner;

public class Homework0327_1 {
    public static void main(String[] args) {
        //실습문제 5번
        Scanner s = new Scanner(System.in);
        final int SOUND_SPEED = 340;

        while(true) {
            int time = 0;
            int distence = 0;

            while(true) {
                System.out.print("시간간격을 입력하시오(단위: 초): ");
                time = Integer.parseInt(s.nextLine());

                if(time > 0){
                    break;
                }
                System.out.println("양수값을 입력해 주세요");
            }
            distence = time * SOUND_SPEED;
            System.out.println("번개가 발생한 곳까지의 거리: " + distence);

            char isContinue = 0;
            while (true) {
                System.out.print("계속하시겠습니까? (y/n)");
                String inputContinue = s.nextLine();
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
