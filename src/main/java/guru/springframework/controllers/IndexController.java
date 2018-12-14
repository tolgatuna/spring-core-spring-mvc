package guru.springframework.controllers;

import guru.springframework.eventpublishers.MyCustomEventPublisher;
import guru.springframework.events.MyCustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 11/6/15.
 */
@Controller
public class IndexController {

    @Autowired
    MyCustomEventPublisher myCustomEventPublisher;

    @RequestMapping({"/", ""})
    public String index(){
        myCustomEventPublisher.publish(new MyCustomEvent("Index Called and While Loop started!"));
        return "index";
    }

    @RequestMapping("/access_denied")
    public String notAuth(){
        return "access_denied";
    }

    @RequestMapping("login")
    public String loginForm(){
        return "login";
    }
}
