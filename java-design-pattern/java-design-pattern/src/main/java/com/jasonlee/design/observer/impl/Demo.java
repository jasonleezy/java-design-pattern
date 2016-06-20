package com.jasonlee.design.observer.impl;

import com.jasonlee.design.observer.Message;

public class Demo {
	public static void main(String[] args) {
		//早读由teacher负责教课。
		Teacher teacher = new Teacher();
		//早读班有jeff jasonlee usun三名学生
		Student jeff = new Student();
		jeff.setName("jeff");
		Student jasonlee = new Student();
		jasonlee.setName("jasonlee");
		Student usun = new Student();
		usun.setName("usun");
		
		//每个学生都在等待老师上课
		teacher.addWatcher(jeff);
		teacher.addWatcher(jasonlee);
		teacher.addWatcher(usun);
		
		//上课铃响起。老师说，“开始上课”；每个学生都会起立，说，老师早上好。
		Message begin = new Message();
		begin.setType(1);
		begin.setContent("class begin!");
		teacher.sendMessage(begin);
		//老师说，“开始阅读”，学生进入阅读状态
		Message read = new Message();
		read.setType(2);
		read.setContent("read now!");
		teacher.sendMessage(read);
		
		//jeff 中途假装肚子疼，请假出去吃早餐
		teacher.removeWatcher("jeff");
		
		//下课铃响起。老师说，“下课”；每个在课堂的学生都会起立，说，老师 再见。
		Message googbye = new Message();
		googbye.setType(3);
		googbye.setContent("class over!");
		teacher.sendMessage(googbye);
		
	}
}
