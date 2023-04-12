package com.javalab.polymorphism.pkg12;

// 실행클래스
public class RemoteControlMain { // class s

	public static void main(String[] args) { // main s

		RemoteControl remocon;	//리모컨 기능만 있는 인터페이스 타입 변수 선언
		
		// 1. 리모컨 기능만 있는 Television 사용
		// 텔레비전 객체 생성해서 인터페이스 타입에 저장
		remocon = new Television();		// 구현 객체 대입(자동타입변환)
		remocon.turnOn();		// 구현 객체의 메소드가 호출
		remocon.turnOff();		// 구현 객체의 메소드가 호출
		System.out.println();
		
		//Searchable sh = new Television();		// 부모한테만 할수있음
		// sh.search("www.naver.com")
		
		// 2. SmartTV를 작동하는 경우
		SmartTelevision sTv = new SmartTelevision();
		
		// 인터페이스 타입 변수에 저장
		RemoteControl remocon2 = sTv;		// 리모콘 기능이 있는 인터페이스로 자동타입변환
		Searchable sh = sTv;				// Searchable 인터페이스 타입으로 자동변환
		remocon2.turnOn();					//구현 객체의 메소드가 호출					
		remocon2.setVolume(6);				//구현 객체의 메소드가호출
		sh.search("www.naver.com");
		remocon2.turnOff();
	} // main e

} // class e
