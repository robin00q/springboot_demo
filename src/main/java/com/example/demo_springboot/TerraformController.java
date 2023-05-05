package com.example.demo_springboot;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerraformController {

  @GetMapping("/")
  public String hello() throws UnknownHostException {
    InetAddress localhost = InetAddress.getLocalHost();
    return String.format("hello terraform from [%s]", localhost.getHostAddress());
  }
}
