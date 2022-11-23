package com.insurance.ATD.WaterInsurence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WaterController {
	WaterRepo repo;
	
	
@RequestMapping(value="WaterInsurance")
public String WaterInsurence() {
	return  "Water";
	
}
@RequestMapping(value="calculate")
public ModelAndView calculations() {
	
	ModelAndView mav=new ModelAndView();
	Waterbean wb=new Waterbean();
	double a=wb.getAmount();
	int b=(wb.getTenure()/12);
	double c=(wb.getPercentage()/100);
	
	double d=a*b*c;
	mav.addObject("calculation",d);
	
	return mav;
	
}
}
