package comp31.formdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comp31.formdemo.model.Person;
import comp31.formdemo.services.LoginService;

@Controller
public class MainController {



    LoginService loginService;
    public MainController(LoginService loginService)
    {
        this.loginService = loginService;
    }

    @GetMapping("/")
    String getRoot(Model model) {
        Person person = new Person();
        person.setUserId("bugs");
        model.addAttribute("person", person);
        return "login";
    }

    @GetMapping("/login")
    public String getForm(Person person, Model model) {
        if((loginService.findByUserId(person.getUserId())) != null)
        {
            model.addAttribute("person", person);
            return "welcome";
        }
        return "login";
        
    }

}
