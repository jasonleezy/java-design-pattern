package com.jasonlee.design.observer.impl;

import com.jasonlee.design.observer.Message;

public class Student extends People{
	
	public void doMessage(Message msg) {
		switch(msg.getType()){
			case 1:System.out.println(this.getName()+":\ngood morning,teacher!");break;
			case 2:System.out.println(this.getName()+":\nI am reading now");break;
			case 3:System.out.println(this.getName()+":\ngood bye,teacher!");break;
		}
	}
	
}
