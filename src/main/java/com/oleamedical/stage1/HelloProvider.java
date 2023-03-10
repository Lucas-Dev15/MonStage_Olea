package com.oleamedical.stage1;

public class HelloProvider {

	private String name;

	public HelloProvider(String nameParam) {
		this.name = nameParam;
	}

	public String getHello() {
		return "Hello " + name;
	}

}