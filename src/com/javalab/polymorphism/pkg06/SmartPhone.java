package com.javalab.polymorphism.pkg06;

public class SmartPhone extends Phone { // class s

	// 생성자 선언
	SmartPhone(String owner) {
		// 부모생성자 호출
		super(owner);
	}

	// 메서드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

} // class e