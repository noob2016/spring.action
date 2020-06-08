package com.ztzh.di.construct.aop;

import java.io.PrintStream;

public class Minstrel {
	
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	public void beforeQuest() {
		stream.println("��ʿquestǰ");
	}
	
	public void afterQuest() {
		stream.println("��ʿquest��");
	}

}
