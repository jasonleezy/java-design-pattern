package com.jasonlee.design.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.jasonlee.design.observer.Message;
import com.jasonlee.design.observer.Subject;
import com.jasonlee.design.observer.Watcher;

public class Teacher implements Subject {

	private List<Watcher> watchers = new ArrayList<Watcher>();
	
	public void addWatcher(Watcher watcher) {
		this.watchers.add(watcher);
	}

	public void removeWatcher(String name) {
		for(Watcher watcher:this.watchers){
			if(((Student) watcher).getName().equalsIgnoreCase(name)){
				watchers.remove(watcher);
				System.out.println(name + " went away");
				break;
			}
				
		}
	}
	
	public void sendMessage(Message msg) {
		System.out.println("teacher:\n"+msg.getContent());
		for(Watcher watcher:this.watchers){
			watcher.doMessage(msg);
		}
	}

}
