package DD.DDO.controller;

import javax.management.modelmbean.RequiredModelMBean;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DDcontroller {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data","hello!!");
		return "hello";
	}
	
	//첫 MVC 패턴 2023-05-22 
	@GetMapping("hello-mvc")
	public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model) {
		model.addAttribute("name",name);
		return "hello-template";
	}
	@GetMapping("hello-string")
	@ResponseBody
	public String helloString(@RequestParam(value="name",required=false) String name) {
		
		return"hello "+name;
	}
	
	// 기본적으로 json형태로 return
	@GetMapping("hello-api")
	@ResponseBody 
	public Hello helloApi (@RequestParam("name") String name) {
		Hello hello = new Hello();
		hello.setName(name);
		return hello;
	}
	
	static class Hello{
		private String name;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
	}
}
