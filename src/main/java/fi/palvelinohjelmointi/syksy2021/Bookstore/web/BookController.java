package fi.palvelinohjelmointi.syksy2021.Bookstore.web;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.palvelinohjelmointi.syksy2021.Bookstore.domain.Book;


@Controller
public class BookController {
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String friendForm(Model model) {
		model.addAttribute("book", new Book()); 
		return "index"; 
		
	}
}
