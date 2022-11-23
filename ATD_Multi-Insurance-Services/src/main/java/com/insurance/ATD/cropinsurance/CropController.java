package com.insurance.ATD.cropinsurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class CropController {
	@Autowired
	Service service;
	@RequestMapping(value="crophome")
	public String home() {
		String  views="CropHome";
		return views;
	}
	@RequestMapping(value="cropcost")
	public String cost() {
		String  views="Cropcostestimation";
		return views;
	}
	@RequestMapping(value = "costcrop",method = RequestMethod.POST)
	public ModelAndView cost(@ModelAttribute("cost")Bean lb) {
		
		int n=0;
		int n1=0;
		int n2=lb.getPremiumrate();
	List<Bean>	result=null;
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
		lb.setTotalcost(r);
		
	
		
		
			mav.setViewName("showcost");
			mav.addObject("costestimated",lb);
		
		return mav;
	}

}
