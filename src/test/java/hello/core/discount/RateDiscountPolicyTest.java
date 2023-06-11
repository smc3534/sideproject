package hello.core.discount;

import hello.core.member.Member;
import hello.core.member.grade;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    // 실제 RateDiscountPolicy가 10퍼센트할인이 되는 지 확인

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10퍼센트 할인이 적용되어야 한다.")
    void vip_o(){

        // given
        Member member = new Member(1L, "SMC", grade.VIP);

        // when
        int discount = rateDiscountPolicy.discount(member, 10000);
        // then

        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("Basic은 할인을 못받아야요")
    void vip_x(){
        Member member = new Member(2L, "ordinary", grade.BASIC);

        int discount = rateDiscountPolicy.discount(member, 20000);

        assertThat(discount).isEqualTo(0);

    }


}