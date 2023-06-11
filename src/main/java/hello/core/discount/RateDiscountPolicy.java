package hello.core.discount;

import hello.core.member.Member;
import hello.core.member.grade;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private final int DiscountPercent = 10;

    @Override
    public int discount(Member member, int price) {


        if(member.getGrade()== grade.VIP)
        {
            System.out.println("selected price : "+price*(DiscountPercent/100));
            return price*DiscountPercent/100;
        }
        else{
            return 0;
        }
    }
}
