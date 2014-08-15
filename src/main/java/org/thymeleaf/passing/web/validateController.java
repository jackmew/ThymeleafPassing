/**
 * 
 */
package org.thymeleaf.passing.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.passing.model.Person;

/**
 * @author jackho
 *
 */
@Controller
@RequestMapping("/validate")
public class validateController {//extends WebMvcConfigurerAdapter{


	
/***************************************send Person object***************************************************/
//	@RequestMapping(value="/", method=RequestMethod.GET)
//    public String showForm(Person person) {
//        return "formValidating";
//    }
	@RequestMapping(value="/",method=RequestMethod.GET)
		public String showForm (Model model) {
		Person person = new Person();
		model.addAttribute("person",person);
		return "formValidating";
	}
/****************************************the same as sen Person object**************************************************/
	@RequestMapping(value="/", method=RequestMethod.POST)
    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "formValidating";
        }
        
      //return "redirect:/validatingResults";
      return "redirect:/validate/validatingResults";
    }
	
/*************************************redirect *****************************************************/
	@RequestMapping(value="/validatingResults")
	public String validatingResults() {
		return "validatingResults";
	}
	
//	@Override
//  public void addViewControllers(ViewControllerRegistry registry) {
//      registry.addViewController("/validatingResults").setViewName("validatingResults");
//  }
/*************************************the same as redirect*****************************************************/
}
