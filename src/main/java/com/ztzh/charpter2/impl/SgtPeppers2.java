package com.ztzh.charpter2.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ztzh.charpter2.CompactDisc;

@Component("SgtPeppers2")
@Primary
public class SgtPeppers2 implements CompactDisc {

	@Override
	public void play() {
		System.out.println("play SgtPeppers2");
	}

}
