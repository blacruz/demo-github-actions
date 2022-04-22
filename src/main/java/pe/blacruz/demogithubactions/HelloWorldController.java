package pe.blacruz.demogithubactions;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {
  
  @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
  public String sayHello() {
    return "Hola mundo";
  }

}
