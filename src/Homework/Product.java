package Homework;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public void sale(int salePercent){
        price = price - (price * salePercent / 100);
    }

    public void order(int order){
        quantity = quantity - order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "상품이름:'" + name + '\'' +
                ", 가격:" + price +
                ", 재고:" + quantity +
                '}';
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
