package com.javalab.polymorphism.pkg08;

public class Bus extends Vehicle { // class s

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("버스가 정차합니다.");
	}
} // class e
