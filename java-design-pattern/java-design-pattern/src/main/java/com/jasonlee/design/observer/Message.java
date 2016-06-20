package com.jasonlee.design.observer;

public class Message {
	private int type;//消息类型
	private String content;//消息内容
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
