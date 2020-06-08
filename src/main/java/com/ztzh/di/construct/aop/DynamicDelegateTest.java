package com.ztzh.di.construct.aop;

import java.lang.reflect.Proxy;

import com.ztzh.di.construct.Quest;
import com.ztzh.di.construct.SlaveDragonQuest;

public class DynamicDelegateTest {

	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		SlaveDragonQuest q = new SlaveDragonQuest(System.out);
		
		Quest quest = (Quest)Proxy.newProxyInstance(q.getClass().getClassLoader(), q.getClass().getInterfaces(), new MyHandler(q));
		quest.embark();
	}
}
