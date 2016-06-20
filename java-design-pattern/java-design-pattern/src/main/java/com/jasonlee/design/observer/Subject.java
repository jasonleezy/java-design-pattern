package com.jasonlee.design.observer;

public interface Subject {
	
	public void addWatcher(Watcher watcher);
	
	public void sendMessage(Message msg);

}
