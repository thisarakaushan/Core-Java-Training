package com.highradius.struts;

public class Action {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String execute() throws Exception{
		
		return "success";
	}
}
