package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageServiceImpl implements WishMessageService {
	
	@Override
	public String getWishMessage() {
		Calendar calender=null;
		int hour=0;
		//get calender obj
		calender=calender.getInstance();
		//get current hour
		hour=calender.get(calender.HOUR_OF_DAY);
		//get wish msg
		
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "good after noon";
		else if(hour<20)
			return "good evening";
		else 
			return "good Night";

	}
	

}
