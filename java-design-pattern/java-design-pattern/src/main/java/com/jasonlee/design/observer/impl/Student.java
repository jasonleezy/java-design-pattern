package com.jasonlee.design.observer.impl;

import com.jasonlee.design.observer.Message;
import com.jasonlee.design.observer.Watcher;

public class Student implements Watcher{
	private String name;
	
	public void doMessage(Message msg) {
		switch(msg.getType()){
			case 1:System.out.println(this.name+":\ngood morning,teacher!");break;
			case 2:System.out.println(this.name+":\nI am reading now");break;
			case 3:System.out.println(this.name+":\ngood bye,teacher!");break;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
