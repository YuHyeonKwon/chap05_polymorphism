package com.javalab.polymorphism.pkg02;

//실행클래스
public class CarMain { // class s

	public static void main(String[] args) { // main s

		// Car 객체 생성
		Car myCar = new Car();

		// Tire 객체 생성
		myCar.tire = new Tire();		// 아무런 타이어가 장착되지 않은 상태 // Tire 타입의 필드 tire
		myCar.run();

		// HankookTire 객체 장착
		myCar.tire = new HankookTire();		// 자동형변환
		myCar.run();

		// KumhoTire 객체 장착
		myCar.tire = new KumhoTire();		// 자동형변환
		myCar.run();
		
	} // main e

} // class e
