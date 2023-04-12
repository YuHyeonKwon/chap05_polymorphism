package com.javalab.polymorphism.pkg19;
/**
 * 중첩 인터페이스
 */
public class Button2 { // class s
	
	// 정적 멤버 인터페이스[중첩 인터페이스]
	public static interface ClickListener{		// static이 붙으면 객세 생성 없이 Button2.으로 사용가능
		
		// 추상 메소드
		void onClick();
		
	} // end 인터페이스
	
	// 필드
	private ClickListener clickListener;	// 인터페이스를 필드로 사용
	
	// 메소드
	public void setClickListener(ClickListener clickListener) {		// 자식타입으로 들어올가능성이 높다
		this.clickListener = clickListener;
	}
	
	// 메소드
	public void click() {
		this.clickListener.onClick();		// 버튼 클릭시 실행하는 메소드
	}
} // class e
