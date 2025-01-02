package vn.hieuSpring.propertiesConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/test")
    public String oke(){
        return "xin chao123";
    }
    @GetMapping("/h2")
    public String h2(){
        return " h2";
    }
}
