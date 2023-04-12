package com.javalab.polymorphism.pkg12;

/**
 * 인터페이스: 자손들이 반드시 구현해야될 빈 껍데기 메소드를 정의해놓은 클래스
 * - 인터페이스에 상수 필드 선언
 */
public interface RemoteControl { // class s
	
	//상수 필드(상수 앞에는 public static이 생략됨)
	// 인터페이스의 상수는 public static이기 떄문에 인터페이스 이름.상수로 접근
	public static int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드	// 인터페이스 추상메소드는 반드시 자식이 구현해야함
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
} // class e
