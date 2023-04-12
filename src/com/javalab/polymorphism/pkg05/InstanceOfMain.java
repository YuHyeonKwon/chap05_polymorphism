package com.javalab.polymorphism.pkg05;

/**
 * instanceOf 부모 타입으로 받은 자식 객체의 타입(type)을 알아내는 메소드
 */
public class InstanceOfMain { // class s

	public static void main(String[] args) { // main s

		Animal animal1 = new Dog();
		Animal animal2 = new Cat();

		if (animal1 instanceof Dog) {
			System.out.println("개 입니다.");
		}

		if (animal2 instanceof Dog) {
			System.out.println("animal2는 개입니다.");
		} else if (animal2 instanceof Cat) {
			System.out.println("animal2는 고양이입니다.");
		}
	} // main e

} // class e
