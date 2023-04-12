package com.javalab.polymorphism.pkg08;

public class VehicleMain { // class s

	public static void main(String[] args) { // main s

		// 운전기사 클래스 객체 생성
		Driver driver = new Driver();
		
		// 부가 타입 배열 변수 준비 두칸짜리
		Vehicle[] vehicles = new Vehicle[2];
		
		// 배열에 자식 객체 저장(2개)
		vehicles[0] = new Taxi();
		vehicles[1] = new Bus();
		
		//반복문으로 운행시키기
		for (Vehicle vehicle : vehicles) {
			driver.drive(vehicle);
		}
	} // main e

} // class e
