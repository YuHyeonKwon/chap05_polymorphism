package com.javalab.polymorphism.pkg16;

public class Bus implements Vehicle { // class s

	@Override
	public void run() {
		System.out.println("버스가 정류장에서 손님을 태우고 운행중입니다.");
	}
	

	public void stop() {
		System.out.println("버스가 정차합니다.");
	}
} // class e
