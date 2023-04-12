package com.javalab.polymorphism.pkg19;

public class ButtonMain { // class s

	public static void main(String[] args) { // main s

		// ok 버튼 객체 생성
		Button2 btnOk = new Button2();
		
		//[중첩클래스] ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class OkListener implements Button2.ClickListener{		// OkListener- 자식
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");		// 코드 구현
			}
		}
		
		// ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());		// 객체 생성
		
		// ok 버튼 클릭하기
		btnOk.click();
		
		// Cansel 버튼 객체 생성
		Button2 btnCancel = new Button2();
		
		// Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class CancelListener implements Button2.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		// Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		// Cancel 버튼 클릭하기
		btnCancel.click();
	} // main e

} // class e
