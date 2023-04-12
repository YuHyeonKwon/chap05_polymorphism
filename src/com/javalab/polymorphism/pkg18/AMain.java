package com.javalab.polymorphism.pkg18;
/**
 * 중첩 클래스를 사용할 실행 클래스
 */
public class AMain { // class s

	public static void main(String[] args) { // main s

		/*
		 * 1. 바깥의 A 객체가 생성되기 전에 먼저
		 * - 내부 클래스 B가 정의되고
		 * - B클래스가 객체로 생성
		 * 2. A 객체가 생성됨(초기화)
		 */
		A a = new A();
		
		// 2. 안쪽의 중첩 B 객체 생성
		A.B b = a.new B();		// 바깥쪽클래스 안쪽클래스 순으로 접근  // 이건 B타입 
		b.field1 = 25;
		b.method1();
	} // main e

} // class e
