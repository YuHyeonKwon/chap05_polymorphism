package com.javalab.polymorphism.pkg07;


public class AnimalMain { // class s

	public static void main(String[] args) { // main s

		// 1. 객체를 생성해서 타입에 저장 ( 타형성 아님 )
		System.out.println("[1. 자손 객체를 생성해서 자손 타입 변수에 저장(다형성 아님)]");

		// 자손 객체 생성해서 자손 타입에 저장
		Dog dog = new Dog();
		Cat cat = new Cat();

		// 자손이 갖고 있는 메소드 호출해서 동물 소리 내기
		dog.sound();
		cat.sound();

		// 2. 다형성 적용, 변수의 자동 타입변환
		// 객체를 생성해서 부모 타입에 저장함.

		System.out.println("[2. 다형성 적용, 자동 타입 변환 + 오버라이딩 메소드 호출]");

		// 부모 타입 변수 선언
		Animal animal = null;		// 추상클래스 객체 생성 안됨.

		// 자손 객체(구현클래스)를 생성해서 부모 타입에 저장함
		animal = new Dog(); // 자동 타입 변환
		animal.sound();		// 오버라이딩 메소드 호출
		
		animal = new Cat(); // 자동 타입 변환
		animal.sound();		// 오버라이딩 메소드 호출
		System.out.println();

		// 3. 매개변수의 다형성
		System.out.println("[3. 다형성 적용 매개 변수의 다형성 + 자동 타입 변환]");
		animalSound(dog);
		animalSound(animal);	// animal에는 Cat객체의 주소 있음.
		
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();		// 자동 형변환
		animals[1] = new Cat();
		for (Animal animal2 : animals) {
			animalSound(animal2);
		}
	} // main e

	private static void animalSound(Animal animal) {
		animal.sound();		// 오버로딩 메소드 호출
	}

//	private static void animalSound(Dog dog) {
//		dog.sound();
//}

		
	

} // class e
