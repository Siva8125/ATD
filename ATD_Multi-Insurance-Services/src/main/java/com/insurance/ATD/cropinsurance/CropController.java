package com.insurance.ATD.cropinsurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CropController {
	@RequestMapping(value = "costcrop",method = RequestMethod.POST)
	public ModelAndView cost(@ModelAttribute("cost")Bean lb) {
		
		int n=0;
		int n1=0;
		int n2=lb.getPremiumrate();
		ModelAndView mav = new ModelAndView();
		String s=lb.getCropname();
		if(s.equalsIgnoreCase("paddy")) {
			lb.setEstimatedcropvalue(800000);
			n=lb.getEstimatedcropvalue();
			lb.setInsuranceperiod(6);
			n1=lb.getInsuranceperiod();
		}else if(s.equalsIgnoreCase("wheat")) {
			lb.setEstimatedcropvalue(700000);
			n=lb.getEstimatedcropvalue();
			lb.setInsuranceperiod(6);
			n1=lb.getInsuranceperiod();
		}else if(s.equalsIgnoreCase("mustard")) {
			lb.setEstimatedcropvalue(1200000);
			n=lb.getEstimatedcropvalue();
			lb.setInsuranceperiod(12);
			n1=lb.getInsuranceperiod();
		}else if(s.equalsIgnoreCase("jowar")) {
			lb.setEstimatedcropvalue(700000);
			n=lb.getEstimatedcropvalue();
			lb.setInsuranceperiod(12);
			n1=lb.getInsuranceperiod();
		}else if(s.equalsIgnoreCase("tea")) {
			lb.setEstimatedcropvalue(1300000);
			n=lb.getEstimatedcropvalue();
			lb.setInsuranceperiod(12);
			n1=lb.getInsuranceperiod();
		}
		
		int i=(n2/100)*n;
		int r=i*n1;
		
		return mav;
	}

}
