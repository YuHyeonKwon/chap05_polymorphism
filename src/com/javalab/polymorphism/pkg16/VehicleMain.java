package com.javalab.polymorphism.pkg16;

public class VehicleMain { // class s

	public static void main(String[] args) { // main s

		System.out.println("[1] 다형성이 아닌 일반적인 객체 활용====================");
		Bus bus = new Bus();
		bus.run();
		Taxi taxi = new Taxi();
		taxi.run();
		System.out.println();
		
		
	    System.out.println("[2] 인터페이스와 매개 변수를 활용한 다형성 구현 =================");
	    // 운전기사 클래스 객체 생성
	    Driver driver = new Driver();
		driver.drive(bus);
		driver.drive(taxi);
		System.out.println();
		
		// 부가 타입 배열 변수 준비 두칸짜리
		Vehicle[] vehicles = new Vehicle[2];
		
		System.out.println("[3] 반복문을 통해서 운행을 자동화 시====================");

		// 배열에 자식 객체 저장(2개)
		vehicles[0] = new Taxi();		// 자동 타입 변환
		vehicles[1] = new Bus();		// 자동 타입 변환
		
		//반복문으로 운행시키기
		for (Vehicle vehicle : vehicles) {
			driver.drive(vehicle);
			
		}
	} // main e

} // class e
