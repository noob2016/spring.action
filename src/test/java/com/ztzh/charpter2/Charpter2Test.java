package com.ztzh.charpter2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayConfig.class})
public class Charpter2Test {
	
	@Autowired
	private CompactDisc disc;
	@Autowired
	private MediaPlayer mediaPlayer;
	
	@Test
	public void cdShouldNotBeNull() {
		Assert.assertNotNull(disc);
		disc.play();
	}
	
	@Test
	public void testMedia() {
		mediaPlayer.playByDisc();
	}

}
