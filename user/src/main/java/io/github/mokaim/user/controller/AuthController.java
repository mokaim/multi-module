package io.github.mokaim.user.controller;

import io.github.mokaim.common.User;
import io.github.mokaim.common.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/user")
  public String test() {
    List<User> list = userRepository.findAll();
    User user = new User();
    user.setName("Hello");
    return null;
  }
}
