package com.cg.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
// 	  @Bean
// 	   public WebMvcConfigurer corsConfigurer() {
// 	      return new WebMvcConfigurerAdapter() {
// 	         @Override
// 	         public void addCorsMappings(CorsRegistry registry) {
// 	            registry.addMapping("/api/m3/websocket/*").allowedOrigins("*");
//          }
// 	      };
// 	   }
	 
	

}
