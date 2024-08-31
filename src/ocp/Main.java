package ocp;

import dip.OrderService;

public class Main {

    public static void main(String[] args) {
        DiscountPolicy discountPolicy = new FixDiscountPolicy();
        OrderService orderService = new OrderService(discountPolicy);
    }
}
