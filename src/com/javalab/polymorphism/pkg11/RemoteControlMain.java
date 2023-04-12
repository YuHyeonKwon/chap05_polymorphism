package com.javalab.polymorphism.pkg11;

public class RemoteControlMain { // class s

	public static void main(String[] args) { // main s

		// 인터페이스  변수 선언
		RemoteControl rc;	// 인터페이스 타입 rc변수 선언
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();		// Television 초기화 rc는 Television 주소를 사용할수 있다.
		rc.turnOn();	//TV켬
		rc.setVolume(11);
		rc.turnOff();	//TV끔
		System.out.println();
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-1);
		rc.turnOff();
		System.out.println();
		
		RemoteControl[] rmt = new RemoteControl[2];
		rmt[0] = new Television();
		rmt[1] = new Audio();
		
		for (RemoteControl remoteControl : rmt) {
			remoteControl.turnOn();
			remoteControl.turnOff();
			remoteControl.setVolume(5);
			System.out.println();
		}
		
	} // main e

} // class e
