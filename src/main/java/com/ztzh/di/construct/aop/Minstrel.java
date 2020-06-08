package com.ztzh.di.construct.aop;

import java.io.PrintStream;

public class Minstrel {
	
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	public void beforeQuest() {
		stream.println("勇士quest前");
	}
	
	public void afterQuest() {
		stream.println("勇士quest后");
	}

}
