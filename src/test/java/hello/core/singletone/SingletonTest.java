package hello.core.singletone;

import hello.core.AppConfig;
import hello.core.Order.OrderService;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class SingletonTest {
    
    
    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest(){
        SingletonService singletonTest1 = SingletonService.getInstance();
        SingletonService singletonTest2 = SingletonService.getInstance();

        System.out.println("singletonTest1 = " + singletonTest1);
        System.out.println("singletonTest2 = " + singletonTest2);

        // same ==
        // equal equals
        assertThat(singletonTest1).isSameAs(singletonTest2);

    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService1 = ac.getBean("memberService", MemberService.class);
        OrderService orderService1 = ac.getBean("orderService", OrderService.class);


        System.out.println("singletonTest1 = " + memberService1);
        System.out.println("singletonTest2 = " + orderService1);

        // same ==
        // equal equals
        assertThat(memberService1).isSameAs(orderService1);


    }
}
