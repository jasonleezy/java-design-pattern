package com.jasonlee.design.observer.impl;

import com.jasonlee.design.observer.Message;

public class ClassTeacher extends People {

	@Override
	public void doMessage(Message msg) {
		if(msg.getType() == 3){
			System.out.println("ClassTeacher come in and say:have a roll call now!");
		}
	}

}
