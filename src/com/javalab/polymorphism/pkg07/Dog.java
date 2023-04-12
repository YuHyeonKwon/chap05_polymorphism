package com.javalab.polymorphism.pkg07;

/**
 * 자식클래스로서 추상 클래스인 Animal을 상속함
 * 부모 클래스의 추상 메소드를 오버라이드(재정의) 해야함.
 * 이클립스의 자동 완성으로 오버리딩 메소드 생성할것
 */
public class Dog extends Animal { // class s

	@Override
	public void sound() {		// 시그니처 자동생성 , 부모꺼랑 다르면 컴파일 오류
		System.out.println("멍멍");
	}
} // class e
