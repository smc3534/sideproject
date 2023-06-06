package mamba.backend.sideproject;

import mamba.backend.calculator.Calculator;
import mamba.backend.calculator.addition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Calculator calculator() {
        return new addition();
    }


}
