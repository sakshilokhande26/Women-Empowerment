package com.lti.core;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class LocalDateControllerAdvice {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat=new SimpleDateFormat();
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

}
