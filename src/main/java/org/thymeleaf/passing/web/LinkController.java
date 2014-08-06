/**
 * 
 */
package org.thymeleaf.passing.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.passing.domain.Foo;


/**
 * @author jackho
 *
 */
@Controller
public class LinkController {

	@RequestMapping("/") 
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	
	// 1. passing object
	@RequestMapping(value="/sendObject",method=RequestMethod.GET)
	public String sendObject(Model model) {
		Foo foo = new Foo();
		foo.setI(123);
		foo.setStr("FOOOOOOOOO");
		model.addAttribute(foo);
		return "formPassing";
	}
	// 2. receive object 
	@RequestMapping(value="/receiveObject" , method=RequestMethod.POST)
	public String receiveObject(@ModelAttribute(value="foo") Foo foo ,Model model) {
		System.out.println("Foo :");
		System.out.println(foo.getI());
		System.out.println(foo.getStr());
		return "index";
	}
	// 3. send List<Foo>
	@RequestMapping(value="sendList",method=RequestMethod.GET)
	public String sendList(Model model) {
			List<Foo> foos = new ArrayList<Foo>();
			Foo foo1 = new Foo();
			foo1.setI(1);
			foo1.setStr("foo1");
			foos.add(foo1);
			Foo foo2 = new Foo();
			foo2.setI(2);
			foo2.setStr("foo2");
			foos.add(foo2);
			Foo foo3 = new Foo();
			foo3.setI(3);
			foo3.setStr("foo3");
			foos.add(foo3);
			
			model.addAttribute("foos",foos);
			return "ListPassing";
	}
	
	
	
}
