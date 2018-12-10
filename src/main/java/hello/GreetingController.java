package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

  @GetMapping("/botan")
  public String botan(@RequestParam(name="name", required=false, defaultValue="Botan") String name, Model model) {
    model.addAttribute("name", name);
    return "botan";
  }

}