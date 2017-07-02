package com.odontoweb.microservice.rest.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date getDataInicial(Date date){
		if(date == null) return getDataInicial(new Date());
		return new Date(getDataInicial(date.getTime()));
	}
	
	public static Long getDataInicial(Long date){
		if(date == null) date = (new Date()).getTime();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(date);
		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH));
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.AM_PM, Calendar.AM);
		
		return cal.getTimeInMillis();
	}
	
	public static Date getDataFinal(Date date){
		if(date == null) return getDataFinal(new Date());
		return new Date(getDataInicial(date.getTime()));
	}
	
	public static Long getDataFinal(Long date){
		if(date == null) date = (new Date()).getTime();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(date);
		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH));
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.AM_PM, Calendar.AM);
		
		return cal.getTimeInMillis();
	}
	
}
