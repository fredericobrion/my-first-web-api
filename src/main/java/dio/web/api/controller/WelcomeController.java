package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Para transformar a classe em um componente Rest
// A partir de agora essa classe é um RestController e algum dos seu métodos serão serviços http
@RestController
public class WelcomeController {
  // Para dizer que é um recurso http do tipo GET
  @GetMapping
  public String welcome(){
    return "Welcome to My Spring Boot Web API";
  }
}
