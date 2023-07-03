package hello.core.Order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class helloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        helloLombok helloLombok = new helloLombok();
        helloLombok.setAge(10);
        int age = helloLombok.getAge();
        System.out.println("age = " + age);
        System.out.println("helloLombok = " + helloLombok);
    }

}
