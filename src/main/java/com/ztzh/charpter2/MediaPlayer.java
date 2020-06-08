package com.ztzh.charpter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MediaPlayer {
	
	private CompactDisc disc;
	
	public void playByDisc() {
		disc.play();
	}
	
	@Autowired(required = false)
	public void insertDisc(CompactDisc disc) {
		this.disc = disc;
	}
}
