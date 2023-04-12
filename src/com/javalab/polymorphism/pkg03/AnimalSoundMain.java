package com.javalab.polymorphism.pkg03;
/**
 * 매개변수의 다형성 예제 - 객체를 매개변수로 전달할 떄 받는 쪽에서 부모 타입으로 받을 수 있는
 */
public class AnimalSoundMain { // class s

	public static void main(String[] args) { // main s

		// 동물울음소리를 구현해주는 객체 생성
		AnimalSound animalSound = new AnimalSound();
		Dog dog = new Dog();		// 자식 객체를 생성해서 부모 타입에 저장 (다형성)
		Cat cat = new Cat();		// 자식 객체를 생성해서 부모 타입에 저장 (다형성)
		Tiger tiger = new Tiger();	// 자식 객체를 생성해서 부모 타입에 저장 (다형성)
		
		Animal tiger2 = new Tiger();
		
		// 동물울음소리 구현 객체의 메소드에 객체 전달
		animalSound.makeAnimalSound(dog);
		animalSound.makeAnimalSound(cat);
		animalSound.makeAnimalSound(tiger);
		
		animalSound.makeAnimalSound(tiger2);
	} // main e

} // class e
