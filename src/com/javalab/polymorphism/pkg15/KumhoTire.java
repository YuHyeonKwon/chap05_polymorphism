package com.javalab.polymorphism.pkg15;
/**
 * 구현 클래스
 */
public class KumhoTire implements Tire { // class s

	// 인터페이스에 있는 추상 메소드 재정의(오버라이딩)
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
} // class e
