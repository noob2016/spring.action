package com.ztzh.charpter2.impl;

import org.springframework.stereotype.Component;

import com.ztzh.charpter2.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {

	@Override
	public void play() {
		System.out.println("play SgtPeppers");
	}

}
