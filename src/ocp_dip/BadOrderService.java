package ocp_dip;

public class BadOrderService {

    //  인터페이스 사용x
    private final FixDiscountPolicy fixDiscountPolicy = new FixDiscountPolicy();
    private final RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    // 인터페이스 사용o
    // OCP, DIP 위반
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    // 별도의 조립, 설정자 이용
    private final DiscountPolicy discountPolicy = new Config().getDiscountPolicy();
}
