package com.ztzh.di.construct;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructDITest {

	@Test
	public void testConstructDI() {
		Quest mockQuest = Mockito.mock(Quest.class);
		Knight knight = new Knight(mockQuest);
		knight.embarkOnQuest();
		Mockito.verify(mockQuest, Mockito.times(1)).embark();
	}
	
	@Test
	public void testXmlDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
