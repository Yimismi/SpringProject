package spittr.web;

import javax.validation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import spittr.*;
import spittr.data.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/spitter")
public class SpitterContorller {
    private SpitterRepository spitterRepository;

    public SpitterContorller() {

    }

    @Autowired
    public SpitterContorller(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }

}
