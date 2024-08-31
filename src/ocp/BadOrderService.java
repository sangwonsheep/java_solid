package ocp;

public class BadOrderService {

    // 인터페이스 사용x
    private final FixDiscountPolicy fixDiscountPolicy = new FixDiscountPolicy();
    private final RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    // 인터페이스 사용 == DiscountPolicy
    // OCP, DIP 위반
    private final DiscountPolicy interfaceFixDiscountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy interfaceRateDiscountPolicy = new RateDiscountPolicy();

    // 해결책1 : 별도의 조립, 설정자 이용
    // 해결책2 : OrderService
    private final DiscountPolicy discountPolicy = new Config().getDiscountPolicy();
}
