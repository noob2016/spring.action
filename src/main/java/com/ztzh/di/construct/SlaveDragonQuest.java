package com.ztzh.di.construct;

import java.io.PrintStream;

public class SlaveDragonQuest implements Quest {
	
	private PrintStream stream;
	
	public SlaveDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void embark() {
		stream.println("¿ªÊ¼ÍÀÁú!");
	}

}
