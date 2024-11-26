package com.naver.myhome1.sample5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		/*
		   Spring 컨테이너 구동 환경 설정 파일인 applicationContext.xml을 로딩하여 스프링 컨테이너 중 하나인
		   GenericXmlApplicationContext 객체가 생성되어 스프링 컨테이너가 구동합니다.
		   스프링 컨테이너는 applicationContext.xml에 설정대로 빈을 생성합니다.
		 */
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("com/naver/myhome1/sample5/applicaitonContext.xml");
		
		System.out.println("=================getBean() 전 =====================");
		// Object getBean(String name) :
		// argument로 지정된 이름의 bean 인스턴스를 반환합니다.
		// applicationContext.xml에서 id가 "m3"인 bean을 가져옵니다.
		MessageBean bean = (MessageBean) ctx.getBean("m3");
		
		bean.sayHello();//메서드 호출합니다.
		
		ctx.close();
	}
}
