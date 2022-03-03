package io.github.mokaim.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"io.github.mokaim.user","io.github.mokaim.common"})
@EnableJpaRepositories(basePackages = "io.github.mokaim.common")
@EntityScan(basePackages = "io.github.mokaim.common")
public class UserApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class, args);
  }

}
