package spittr.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import spittr.data.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;
    private static final String MAX_LONG_AS_STRING = "" + Long.MAX_VALUE;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = GET)
    public String spittles(
            Model model,
            @RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count", defaultValue = "20") int count
    ) {
        model.addAttribute(spittleRepository.findSpittles(max, count));
        return "spittles";
    }

    @RequestMapping(value = "/{spittleID}", method = GET)
    public String spittles(Model model, @PathVariable long spittleID) {
        model.addAttribute(spittleRepository.findOne(spittleID));
        return "spittle";
    }

}
