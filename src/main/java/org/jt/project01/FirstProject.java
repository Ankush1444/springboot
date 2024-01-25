package org.jt.project01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstProject {
@GetMapping("/home")
   public String homepage(Model model) {
    String name="ankush";
    model.addAttribute("name", name);
    return "home";
   }
}
