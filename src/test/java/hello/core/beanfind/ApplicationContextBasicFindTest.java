package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.Order.OrderService;
import hello.core.Order.OrderServiceImpl;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    void findByName() {
        OrderService orderService = ac.getBean("orderService", OrderService.class);
        assertThat(orderService).isInstanceOf(OrderServiceImpl.class);
    }

    @Test
    void findByType() {
        OrderService orderService = ac.getBean(OrderService.class);
        assertThat(orderService).isInstanceOf(OrderServiceImpl.class);
    }


//
//    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//
//    @Test
//    @DisplayName("빈 이름으로 조회")
//    void findBeanByName() {
//        MemberService memberService = ac.getBean("memberService", MemberService.class);
//        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
//    }
//
//    @Test
//    @DisplayName("빈 Type으로 조회")
//    void findBeanByType() {
//        MemberService memberService = ac.getBean(MemberService.class);
//        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
//    }
//
//    // 구체로 조회해도 된다.(실제 빈에서 MemberServiceImple로 의존관계형성되어 있기 때문에) 근데 구현과 역할을 구분해야 하는 데 이렇게 하면 구분이 잘 안된다. 좋은 방법이 아니다.
//    @Test
//    @DisplayName("빈 Type으로 조회")
//    void findBeanByType2() {
//        MemberServiceImpl memberService = ac.getBean(MemberServiceImpl.class);
//        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
//    }
//
//    @Test
//    @DisplayName("빈 이름으로 조회X")
//    void findBeanByNameX(){
//    //    ac.getBean("xxxxx",MemberService.class);
//        assertThrows(NoSuchBeanDefinitionException.class,
//                ()->ac.getBean("xxxxx",MemberService.class));
//    }
}
