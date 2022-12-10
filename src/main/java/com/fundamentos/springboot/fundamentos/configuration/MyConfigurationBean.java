package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.Bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBennImplemet2();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBEanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        return new MyBEanWithDependencyImplement(myOperation);
    }
}
