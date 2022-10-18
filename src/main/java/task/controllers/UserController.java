package task.controllers;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/main")
    public String main(Model model, @ModelAttribute("message") String message) {
        model.addAttribute("message", message);
        return "user/user_main";
    }

}
