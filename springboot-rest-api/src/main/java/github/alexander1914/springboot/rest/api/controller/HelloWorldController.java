package github.alexander1914.springboot.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/// @RestController: is an annotation that s a specialized version of the controller.
/// It includes the @Controller and @ResponseBody annotations, and as a result, simplifies the controller implementation

@RestController
public class HelloWorldController {

    /// @GetMapping is an annotation that used to map HTTP GET requests to a specific handler method in a controller,
    /// acting as a shortcut for @RequestMapping(method = RequestMethod. GET)
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
}
