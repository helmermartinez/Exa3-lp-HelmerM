package pe.edu.upeu.exa3backendhelmermartinez.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

	@GetMapping("/home")
	public String mensaje() {
		return "Spring Oracle";
	}
}
