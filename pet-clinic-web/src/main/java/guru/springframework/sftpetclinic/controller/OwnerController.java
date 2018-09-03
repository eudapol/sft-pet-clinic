package guru.springframework.sftpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This will be prefix /owners | /owners/ etc...
@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners() {
		
		return "owners/index";
	}
}
