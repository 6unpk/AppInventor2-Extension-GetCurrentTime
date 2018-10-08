package com.parkjunu.extension;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.YaVersion;
import com.google.appinventor.components.runtime.util.AppInvHTTPD;
import com.google.appinventor.components.runtime.util.PackageInstaller;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.*;

@DesignerComponent(version = 2, description = "Made by Junu Park",
	category = ComponentCategory.EXTENSION,
	nonVisible = true,
	iconName = ""
	)
@SimpleObject(external = true)
public class GetCurrentTime extends AndroidNonvisibleComponent implements Component {

	private ComponentContainer container;
	public Calendar calendar;

	public GetCurrentTime(ComponentContainer container){
		super(container.$form());
		this.container = container;
		calendar = new GregorianCalendar();
		getMonth();
		getDate();
		getYear();
		getHour();
		getMinute();
	}

	@SimpleProperty(category = PropertyCategory.BEHAVIOR)
	public int getMonth(){
		calendar = new GregorianCalendar();
		return calendar.get(Calendar.MONTH);
	}

	@SimpleProperty(category = PropertyCategory.BEHAVIOR)
	public int getDate(){
		calendar = new GregorianCalendar();
		return calendar.get(Calendar.DATE);
	}

	@SimpleProperty(category = PropertyCategory.BEHAVIOR)
	public int getYear(){
		calendar = new GregorianCalendar();
		return calendar.get(Calendar.YEAR);
	}

	@SimpleProperty(category = PropertyCategory.BEHAVIOR)
	public int getHour(){
		calendar = new GregorianCalendar();
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	@SimpleProperty(category = PropertyCategory.BEHAVIOR)
	public int getMinute(){
		calendar = new GregorianCalendar();
		return calendar.get(Calendar.MINUTE);
	}

	@SimpleProperty(category = PropertyCategory.BEHAVIOR)
	public int getSecond(){
		calendar = new GregorianCalendar();
		return calendar.get(Calendar.SECOND);
	}

	@SimpleProperty(category = PropertyCategory.BEHAVIOR)
	public int getDayOfWeek(){
		calendar = new GregorianCalendar();
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

}