package com.ztzh.di.construct;

public class Knight {
	
	private Quest quest;
	
	public Knight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}

}
