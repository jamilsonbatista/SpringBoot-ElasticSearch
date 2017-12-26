package elastic;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Mehmet Ali Sahinogullari on 26-Dec-17.
 */

@RestController
public class HelloController {


    private String message = "Hello World";

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
