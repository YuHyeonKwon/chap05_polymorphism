package com.javalab.polymorphism.pkg09;
/**
 * 스포츠 선수
 */
public class Player { // class s

	// 매개 변수의 다형성
	public void play(Sports sports) {
		sports.play(sports);
	}
} // class e
