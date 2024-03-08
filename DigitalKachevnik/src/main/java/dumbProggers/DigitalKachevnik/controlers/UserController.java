package dumbProggers.DigitalKachevnik.controlers;

import dumbProggers.DigitalKachevnik.models.User;
import dumbProggers.DigitalKachevnik.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String createUser(User user){
        if(!userService.createUser(user)){
            return "registration";
        }
        return "redirect:/login";
    }

    @GetMapping("/user/settings")
    public String settings(){
        return "settings";
    }
}
