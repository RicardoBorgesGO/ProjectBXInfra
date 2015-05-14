package br.com.infra.config;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class RegisterBeansConfig {

	//Beans
	@Bean
	public SpringUtils springUtils() {
		return new SpringUtils();
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public static AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor() {
		return new AutowiredAnnotationBeanPostProcessor();
	}
}
