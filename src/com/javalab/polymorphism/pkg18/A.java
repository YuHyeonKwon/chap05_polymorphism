package com.javalab.polymorphism.pkg18;

/**
 * 중첩 클래스
 */
public class A { // classA s

	// 1. 인스턴스 멤버(필드) 클래스(필드 위치에 중첩 클래스 정의)
	public class B { // 내부 클래스
		// B 생성자
		public B() {
			System.out.println("B 중첩 내부 클래스의 생성자");
		}
		int field1; // 중첩 클래스의 필드

		void method1() { // 중첩 클래스의 메소드
			System.out.println("여기는 중첩클래스 method1 입니다.");
		}
	} // class B e

	// 2. 인스턴스 멤버(필드) B 객체 대입
	B field = new B();

	// 생성자
	public A() {
		System.out.println("A 클래스의 생성자");
		// B b = new B();
	}
	
	// 인스턴스 메소드
	void method() {
		System.out.println("여기는 바깥 클래스의 method()메스도");
		B b = new B();
		b.field1 = 3;
		b.method1();
		
	}
} // classA e
