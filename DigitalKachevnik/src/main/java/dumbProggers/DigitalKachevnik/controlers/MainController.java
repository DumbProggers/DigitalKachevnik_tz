package dumbProggers.DigitalKachevnik.controlers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    @GetMapping(path = "/")
    public String unsecuredData() {
        return "main";
    }
}
