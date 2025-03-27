package Homework;

import java.util.Scanner;

public class Homework0327_2 {
    public static void main(String[] args) {
        //실습문제 7번
        Scanner s = new Scanner(System.in);

        while(true) {
            int money = 0;
            int price = 0;
            while (true) {
                System.out.print("받은돈: ");
                money = Integer.parseInt(s.nextLine());
                if (money > 0) {
                    break;
                }
                System.out.println("받은돈은 양수를 입력해 주세요");
            }
            while (true) {
                System.out.print("상품가격: ");
                price = Integer.parseInt(s.nextLine());
                if (price < 0) {
                    System.out.println("상품가격은 양수를 입력해주세요");
                }else if(price > money){
                    System.out.println("상품가격은 받은돈보다 클 수 없습니다");
                }else{
                    break;
                }
            }

            int tex = price / 10;
            int change = money - price;


            System.out.println("부가세: " + tex);
            System.out.println("잔돈: " + change);

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
