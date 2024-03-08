package dumbProggers.DigitalKachevnik.controlers;

import dumbProggers.DigitalKachevnik.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;
    @GetMapping("/")
    public String unsecuredData(Principal principal, Model model) {
        model.addAttribute("user",userService.getUserByPrincipal(principal));
        return "main";
    }
}
