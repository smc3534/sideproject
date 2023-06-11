package hello.core.beanfind;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class staticimporttest {


    public class Test {
        public static void main(String[] args) {
            double radius = 5.0;

            // Math.PI, Math.sqrt 없이 PI와 sqrt를 직접 사용
            double circumference = 2 * PI * radius;
            double squareRoot = sqrt(25);

            System.out.println("Circumference: " + circumference);
            System.out.println("Square root: " + squareRoot);
        }
    }
}
