package com.smartpos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author wangchunlan
 * @ClassName Application.java
 * @Description
 * @createTime 2019年03月28日 11:02:00
 */
@SpringBootApplication
@ComponentScan
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Application  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    /**
     * JSR303 validator.
     * @return validator
     */
    @Bean(name = "validator")
    public Validator localValidatorFactoryBean() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setProviderClass(org.hibernate.validator.HibernateValidator.class);

        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages.ValidationMessages");
        messageSource.setDefaultEncoding("utf-8");
//        messageSource.setUseCodeAsDefaultMessage(true);
        bean.setValidationMessageSource(messageSource);
        return bean;
    }
}
