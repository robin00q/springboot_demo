package com.example.demo_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerraformController {

  @GetMapping("/")
  public String hello() {
    return "hello terraform";
  }
}
