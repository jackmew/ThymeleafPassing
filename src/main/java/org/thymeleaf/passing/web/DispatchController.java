/**
 * 
 */
package org.thymeleaf.passing.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jackho
 *
 */
@Controller
public class DispatchController {

	@RequestMapping("/") 
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
//	@RequestMapping("/passing") 
//	public ModelAndView passing() {
//		return new ModelAndView("passing");
//	}
//	@RequestMapping("/passing")
//	public String passing() {
//		return "passing";
//	}
	
	@RequestMapping("/expression")
	public String expression() {
		return "expression";
	}
	
//	@RequestMapping("/validate")
//	public String validate() {
//		return "formValidating";
//	}
	

}
