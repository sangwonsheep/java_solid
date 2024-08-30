package ocp_dip;

public class OrderController {

    private final OrderService orderService = new OrderService(new FixDiscountPolicy());
}
