package com.jasonlee.design.observer.impl;

import com.jasonlee.design.observer.Message;
import com.jasonlee.design.observer.Watcher;

public abstract class People implements Watcher{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
