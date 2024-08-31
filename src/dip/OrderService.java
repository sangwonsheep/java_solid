package dip;

import dip.annotation.Autowired;
import dip.annotation.RequiredArgsConstructor;
import dip.annotation.Service;
import ocp.DiscountPolicy;
import ocp.FixDiscountPolicy;
import ocp.RateDiscountPolicy;

@Service
public class OrderService {

    // DIP 위반
    private final DiscountPolicy fixDiscountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    // DIP 원칙 준수
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
}
