package com.insurance.ATD.GoldInsurance;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoldController {
	
    @Autowired
    private GoldRepo goldrepo;
   
	@RequestMapping(value="GoldInsurance")
	public String  GoldInsurance() {	
		return "gold";
	}
	@PostMapping(value="/goldinputs")
	public String goldinputs(GoldBean gb) {
		goldrepo.save(gb);
		return "gold";
	}
	@GetMapping(value="golddetails")
	public ModelAndView golddetails(@RequestParam int Policynumber) {
		ModelAndView mav=new ModelAndView("golddata");
		GoldBean gb=goldrepo.findById(Policynumber).orElse(new GoldBean());
		return mav;	
	}
}

	////////////////////
//	@GetMapping(value = "allresults")
//	public ModelAndView fetch() {
//		ModelAndView mp = new ModelAndView("golddetails");
//		Collection<GoldBean>fb=(Collection<GoldBean>) goldrepo.findAll();
//		mp.addObject("gold",fb);
//		return mp;
//	}

	


