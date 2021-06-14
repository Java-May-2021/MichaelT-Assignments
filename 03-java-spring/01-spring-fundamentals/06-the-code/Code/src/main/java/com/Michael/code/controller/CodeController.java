package com.Michael.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    
    @RequestMapping(value="/code", method=RequestMethod.POST)
    public String code(RedirectAttributes redirectAttributes, @RequestParam("passcode") String code,  Model codeModel){
    	if (code.equals("bushido")) {
    		return "code.jsp";
    	}
    	else {
    		redirectAttributes.addFlashAttribute("errors", "You must train harder");
    		return "redirect:/";
    	}
    }
}
