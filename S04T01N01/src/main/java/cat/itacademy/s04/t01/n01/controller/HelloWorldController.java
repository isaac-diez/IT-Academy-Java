package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

//    @RequestMapping (value="/HelloWorld", method= RequestMethod.GET)
    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Maven project.";
    }

//    @RequestMapping (value={"/HelloWorld2", "/HelloWorld2/{name}"}, method= RequestMethod.GET)
    @GetMapping({
            "/HelloWorld2/{name}",
            "/HelloWorld2"})
    public String greet2(@PathVariable(required = false) String name) {
        if (name==null) {name = "UNKNOWN";}
        return "Hello, " + name + ". You are running a Maven project.";
    }

}
