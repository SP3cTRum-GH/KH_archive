package Homework;

public class Homework0324_1 {
    public static void main(String[] args) {
        //영화 이름, 상영시간(h), 연령등급, 상영중여부 , 추천도 입출력
        //step1. 변수에 직접 저장 입출력
        String movie = "";
        double runtime = 0.0;
        int rating = 0;
        boolean isRun = false;
        char recommendation = 0;

        movie = "타짜";
        runtime = 2.3;
        rating = 19;
        isRun =false;
        recommendation = 'A';

        System.out.println("영화이름: " + movie);
        System.out.println("상영시간: " + runtime);
        System.out.println("연령등급: " + rating + "세 이용가");
        System.out.println("현재상영여부: " + isRun);
        System.out.println("추천도: " + recommendation);
    }
}
