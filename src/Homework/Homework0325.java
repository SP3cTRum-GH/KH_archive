package Homework;

import java.util.*;

public class Homework0325 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2 = 0;
        char flag = 0;
        int add=0;
        int sub=0;
        int mul=0;
        double avg = 0;
        int bigNum =0;
        int smallNum=0;

        Set<Character>set = new HashSet<>();
        set.add('n');
        set.add('y');

        for(;;){
            System.out.print("x: ");
            num1 = Integer.parseInt(s.nextLine());
            System.out.print("y: ");
            num2 = Integer.parseInt(s.nextLine());

            add = num1+num2;
            sub = num1-num2;
            mul = num1*num2;
            avg = (double)add/2;
            bigNum = (num1>num2) ? num1 : num2; //Math.max(num1,num2)
            smallNum = (num1<num2) ? num1 : num2; //Math.min(num1,num2)

            System.out.println("두수의 합: " +add);
            System.out.println("두수의 차: " +sub);
            System.out.println("두수의 곱: " +mul);
            System.out.println("두수의 평균: " +avg);
            System.out.println("큰수: " + bigNum);
            System.out.println("작은수: " + smallNum);

            do {
                System.out.print("계속하시겠습니까? (y/n)");
                flag = s.nextLine().toLowerCase().charAt(0);

            }while(!set.contains(flag));

            if (flag == 'n') {
                s.close();
                System.out.println("The End");
                break;
            }
        }
    }
}
