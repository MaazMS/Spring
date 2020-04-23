package com.hmkcode.event;

import java.sql.Date;

import org.springframework.context.ApplicationEvent;
import com.hmkcode.beans.Login;
public class LoginEvent extends ApplicationEvent {

	private Date date;

	public LoginEvent(Object source) {
		super(source);
		this.date = new Date(getTimestamp());
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
