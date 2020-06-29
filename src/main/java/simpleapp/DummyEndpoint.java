package simpleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DummyEndpoint {

    @GetMapping("/dummy")
    public String dummyMethod() {
        return "dummy";
    }

}