package com.tienda;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Bean
    public SessionLocaleResolver localeResolver(){
    var slr= new SessionLocaleResolver();
    slr.setDefaultLocale(new Locale("es"));
    return slr;
    }
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
    var lci= new LocaleChangeInterceptor();
    lci.setParamName("lang");
    return lci;
    }
    
    public void addIntercepters(InterceptorRegistry registro){
    registro.addInterceptor(localeChangeInterceptor());
    }
}
