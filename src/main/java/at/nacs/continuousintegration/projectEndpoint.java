package at.nacs.continuousintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class projectEndpoint {

  @GetMapping
    String get(){
    return "Hi nacs 100";
  }
}
