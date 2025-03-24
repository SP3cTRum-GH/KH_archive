package Homework;

import java.util.Scanner;

public class Homework0324_4 {
    public static void main(String[] args) {
        //영화 이름, 상영시간(h), 연령등급, 상영중여부 , 추천도 입출력
        //step4. 변수에 입력받아 무한 입출력 후 플래그이용해 탈출
        String movie = "";
        double runtime = 0.0;
        int rating = 0;
        boolean isRun = false;
        char recommendation = 0;
        boolean flag = false;
        char isContinue = 0;

        Scanner s = new Scanner(System.in);

        for(;!flag;) {
            System.out.print("영화이름 입력:");
            movie = s.nextLine();
            System.out.print("상영시간 입력:");
            runtime = Double.parseDouble(s.nextLine());
            System.out.print("연령등급 입력:");
            rating = Integer.parseInt(s.nextLine());
            System.out.print("현제상영여부 입력:");
            isRun = Boolean.parseBoolean(s.nextLine());
            System.out.print("추천도 입력:");
            recommendation = s.nextLine().charAt(0);

            System.out.println("영화이름: " + movie);
            System.out.println("상영시간: " + runtime);
            System.out.println("연령등급: " + rating + "세 이용가");
            System.out.println("현재상영여부: " + isRun);
            System.out.println("추천도: " + recommendation);
            System.out.println("*********************************");

            System.out.println("계속하시겠습니까? (y/n)");
            isContinue = s.nextLine().charAt(0);

            if(isContinue == 'n' || isContinue == 'N'){
                s.close();
                System.out.println("The End");
                flag = true;

            }
        }
    }
}
