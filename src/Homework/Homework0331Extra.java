package Homework;

public class Homework0331Extra {
    public static void main(String[] args) {
        int width = 9;
        int height = 9;

        //일차함수 그래프 방식
        System.out.println("일차함수 이용방식");
        for(int y=height-1; y>=0; y--){
            for(int x=0; x<width; x++){
                if((y<=x && y<=-x+8)|| (y>=x && y>=-x+8)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        //절댓값 그래프 방식
        System.out.println("절댓값함수 이용방식");
        for(int y=height-1; y>=0; y--){
            for(int x=0; x<width; x++){
                if(y>=Math.abs(x-width/2)+4 || y<= -Math.abs(x-width/2)+4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
