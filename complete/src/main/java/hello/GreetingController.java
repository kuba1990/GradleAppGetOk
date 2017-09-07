package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s";


    @RequestMapping("/bisnode")
    public Greeting greeting(@RequestParam(value="name", defaultValue="ok") String name) {
        return new Greeting(String.format(template, name));

    }
}
