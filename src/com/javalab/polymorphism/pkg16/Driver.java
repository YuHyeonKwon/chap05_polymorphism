package com.javalab.polymorphism.pkg16;
/**
 * 드라이버 클래스
 * 인터페이스를 통한 매개 변수의 다형성 구현을 위한 객체
 */
public class Driver { // class s
	
	// 운전 메소드 (파라미터가 Vehicle 인터페이스 타입)
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
} // class e
