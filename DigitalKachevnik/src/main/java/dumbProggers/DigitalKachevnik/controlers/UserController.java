package dumbProggers.DigitalKachevnik.controlers;

import dumbProggers.DigitalKachevnik.models.User;
import dumbProggers.DigitalKachevnik.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

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

    @GetMapping("/user/edit")
    public String settings(Principal principal, Model model){
        model.addAttribute("user",userService.getUserByPrincipal(principal));
        return "settings";
    }

    @PostMapping("/user/edit")
    public String editUser(@RequestParam(name="name",required = false) String name,@RequestParam(name="email",required = false) String email,@RequestParam(name="phoneNumber",required = false) String phoneNumber,@RequestParam(name="id",required = false) Long id){
        if(!userService.changeParams(id,name,email,phoneNumber)) return "/user/settings";
        return "redirect:/";
    }
}
