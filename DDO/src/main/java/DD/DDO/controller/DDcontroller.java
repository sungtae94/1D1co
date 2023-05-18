package DD.DDO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DDcontroller {

	@GetMapping("hello")
	public String hello(Model model) {
		System.out.println("incontroller");
		model.addAttribute("data","hello!!");
		return "hello";
	}
}
