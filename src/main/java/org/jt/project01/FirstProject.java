package org.jt.project01;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstProject {
@GetMapping("/home")
   public String homepage(Model model) {
    var student1 = new Demo("Ankush", "Bbsr", "MCA");
    var student2 = new Demo("Jyoti", "Cuttack", "MCA");
    var student3 = new Demo("Mona", "CRP", "Physics");

    var students = List.of(student1, student2, student3);

    model.addAttribute("students", students);
    return "home";
   }
}
