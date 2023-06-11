package hello.core.discount;

import hello.core.member.Member;
import hello.core.member.grade;

public class FixDiscountPolicy implements DiscountPolicy{


    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        // enum은 부등호로 비교
        if(member.getGrade()== grade.VIP){
            return discountFixAmount;
        }
        else
        {
            return 0;
        }
    }
}
