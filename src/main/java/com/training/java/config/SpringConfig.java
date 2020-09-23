package com.training.java.config;

import com.training.java.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringConfig.
 *
 * @author Aleksey_Lukyanov
 */
@Configuration
public class SpringConfig {

    @Bean
    public TestBean getTestBean() {
        return new TestBean("hello!");
    }
}
