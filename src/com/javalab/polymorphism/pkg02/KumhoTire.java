package com.javalab.polymorphism.pkg02;

//자식클래스 (금호타이어)
public class KumhoTire extends Tire { // class s

	// 메소드 재정의(오버라이딩)
	@Override
	public void roll() {
		System.out.println("금호 타이어가 회전합니다.");
	}
} // class e
