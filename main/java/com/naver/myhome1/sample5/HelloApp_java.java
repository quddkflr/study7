package com.naver.myhome1.sample5;

public class HelloApp_java {
	public static void main(String[] args) {
		
		MessageBeanImpl bean = new MessageBeanImpl("Spring");
		FileOutputter outputter = new FileOutputter();
		outputter.setFilePath("out.txt");
		
		bean.setGreeting("안녕하세요!");
		bean.setOutputter(outputter);
		bean.sayHello();
	}
}
