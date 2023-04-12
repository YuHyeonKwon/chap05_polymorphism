package com.javalab.polymorphism.pkg04;

public class Taxi extends Vehicle { // class s

	// Vechile 객체의 run() 메소드 재정의 (오버라이징)
	@Override
	public void run() {
		System.out.println("택시가 손님을 싣고 목적지까지 달립니다.");
	}
} // class e
