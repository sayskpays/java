package com.polymorphism.customer.goldcustomer;




import com.polymorphism.customer.Customer;
import com.polymorphism.customer.CustomerVIP;

import java.util.ArrayList;

public class CustomerArrayListTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerLee = new Customer(10100,"a");
        Customer customerShie = new Customer(10101,"b");
        Customer customerhong = new GoldCustomer(10030,"c");
        Customer customerjun = new GoldCustomer(10040,"d");
        Customer customerkoo = new CustomerVIP(10040,"e", 0);

        customerList.add(customerLee);
        customerList.add(customerShie);
        customerList.add(customerhong);
        customerList.add(customerjun);
        customerList.add(customerkoo);

        for(Customer test : customerList){
            System.out.println(test.showCustomerInfo());
        }


        int price = 10000;
        // 다형성 구현
        for(Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(cost);
            System.out.println(customer.bonusPoint);
        }



    }

}
