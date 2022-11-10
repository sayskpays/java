package cs.design_pattern;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy{
    public void pay(int amount);
}

class KAKAOCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KAKAOCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid using KAKAOCard");
    }
}

class NaverPayStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public NaverPayStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid using NaverPay");
    }
}
class Item{
    private String name;
    private int price;

    public Item(String name, int cost){
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class ShoppingCart{
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item: items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}


public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("단백질바",100);
        Item B = new Item("프로틴", 300);

        cart.addItem(A);
        cart.addItem(B);

        cart.pay(new NaverPayStrategy("@naver.com", "123123"));
        cart.pay(new KAKAOCardStrategy("Hong","12345678","123","12/01"));

    }
}
