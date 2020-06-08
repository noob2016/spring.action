package com.ztzh.di.construct.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private Object obj;
	
	public MyHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---------���÷���ǰ");
		method.invoke(obj, args);
		System.out.println("---------���÷�����");
		return null;
	}

	
}
