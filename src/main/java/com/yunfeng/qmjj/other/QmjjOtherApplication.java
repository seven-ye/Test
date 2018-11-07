package com.yunfeng.qmjj.other;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@EnableJpaRepositories("com.yunfeng.qmjj.other.main")
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@ComponentScan({"com.yunfeng"})
@EntityScan("com.yunfeng")
public class QmjjOtherApplication {
  public static void main(String[] args) {
    SpringApplication.run(QmjjOtherApplication.class, args);
  }
  
//  @Bean
//  @LoadBalanced
//  RestTemplate restTemplate() {
//      return new RestTemplate();
//  }
  
}
