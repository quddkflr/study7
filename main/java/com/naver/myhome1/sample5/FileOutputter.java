package com.naver.myhome1.sample5;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter{
	
	private String filePath; // 출력파일 경로와 파일이름을 저장할 변수
	
	public FileOutputter() {
		System.out.println("여기는 FileOutputter 생성자입니다.");
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath; //out.txt 주입되었습니다.
		System.out.println("여긴는 FileOutputter.java의 setFilePath() 입니다. ");
	}// 스프링에서 setter메서드를 활용한 setter DI 설정

	public void output(String message) throws IOException{
		System.out.println("여기는 FileOutputter.java의 output() 입니다.");
		FileWriter out = new FileWriter(filePath);
		out.write(message);// 메시지를 기록함
		out.close();// 출력 객체(파일)를 닫음
	}
}
