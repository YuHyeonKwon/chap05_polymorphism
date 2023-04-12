package com.javalab.polymorphism.pkg02;

// Tire를 멤버로 갖는 클래스
public class Car { // class s

	// 필드선언 ( 타이어 클래스 타입을 필드로 갖게 됨 )
	public Tire tire;

	// 메소드선언
	public void run() {
		// tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}
} // class e
