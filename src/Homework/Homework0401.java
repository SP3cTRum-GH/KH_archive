package Homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework0401 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //상품등록, 상품출력, 할인적용, 재고확인
        boolean stopFlag = false;
        ArrayList<Product>products = new ArrayList<>();

        int choice;
        while(!stopFlag) {
            Product product = new Product();
            System.out.println("=================");
            System.out.println("1.상품등록");
            System.out.println("2.상품출력");
            System.out.println("3.할인적용");
            System.out.println("4.재고확인");
            System.out.println("5.종료");
            System.out.println("=================");

            System.out.print("번호 선택: ");
            String inputChoice = s.nextLine();
            if(Pattern.matches("^[1-5]$", inputChoice)){
                choice = Integer.parseInt(inputChoice);
            }else {
                System.out.println("유효한 값을 입력해주세요");
                continue;
            }
            switch(choice){
                case 1:
                    System.out.print("상품이름 입력: ");
                    product.setName(s.nextLine());
                    product.setPrice(Integer.parseInt(patternInspection(s, "상품가격: ", "^[0-9]{1,}$")));
                    product.setQuantity(Integer.parseInt(patternInspection(s, "현재 재고: ", "^[0-9]{1,}$")));
                    products.add(product);
                    break;
                case 2:
                    if(products.isEmpty()){
                        System.out.println("등록된 제품이 없습니다.");
                    }else {
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(products.get(i).toString());
                        }
                    }
                    break;
                case 3:
                    for(int i=0; i<products.size(); i++){
                        System.out.println(i+1+"번째 제품"+products.get(i).toString());
                    }
                    int choiceSale = Integer.parseInt(patternInspection(s,"몇번째 제품을 할인할까요?: ","^[0-9]{1,}$"));
                    int salePersent = Integer.parseInt(patternInspection(s, "몇퍼센트 할인할까요?: ","^[0-9]{1,2}$"));
                    int currentPrice = products.get(choiceSale-1).getPrice();
                    products.get(choiceSale-1).sale(salePersent);
                    int salePrice =  products.get(choiceSale-1).getPrice();
                    System.out.println("이전가격:"+currentPrice +"에서 "+salePrice+"로 변경되었습니다.");
                    break;
                case 4:
                    System.out.print("검색할 제품이름을 입력해주세요: ");
                    String searchProduct = s.nextLine();
                    boolean isSearched = false;
                    for(Product i:products){
                        if(i.getName().equals(searchProduct)){
                            isSearched = true;
                            System.out.println(searchProduct+"제품을 찾았습니다");
                            System.out.println(i.toString());
                            char isOrder = patternInspection(s,"주문하시겠습니까?(y/n)","^[y,n]$").charAt(0);
                            if(isOrder == 'y'){
                                int order = Integer.parseInt(patternInspection(s,"몇개 주문하시겠습니까?: ","^[0-9]{1,}$"));
                                if(order>i.getQuantity()){
                                    System.out.println("재고가 부족합니다.");
                                }else {
                                    i.order(order);
                                    System.out.println("주문완료");
                                }
                            }
                        }
                    }
                    if(!isSearched){
                        System.out.println(searchProduct+"제품을 찾을 수 없습니다.");
                    }
                    break;
                default:
                    stopFlag = true;
            }

        }

        s.close();
        System.out.println("The End");
    }
    public static String patternInspection(Scanner s, String request, String regex) {
        String input;
        System.out.print(request);
        input = s.nextLine();
        if (Pattern.matches(regex, input)) {
            return input; // 유효한 입력값 리턴
        }
        System.out.println("유효한값을 입력해주세요");
        return patternInspection(s,request,regex);
    }
}
