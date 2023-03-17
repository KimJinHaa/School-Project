package com.test01;

import java.awt.TexturePaint;

public class Variable01 {

	public static void main(String[] args) {     //메인 메소드 향상똑같음
	
		// 준비
		// 클래스명  변수명  = new 클래스명();
		// 실행
		// 변수명.메소드명();
		
		//준비
		Variable01 test = new Variable01();
		
		//실행
		test.declareVariable();
		test.initVariable();  //밑에 다른 변수를 작성시 추가해주면된다
		
		
	}

	        // 타입 변수명 = 값 !!!
			// 타입 - 생성할 변수에 어떤 종류의 값이 들어갈지 타입 지정
			// 변수명 - 변수의 이름
			// 값 - 변수에 저장할 데이터
			
	public void declareVariable() {
		//변수의 선언 , 똑같은이름은 사용할수없다. *다른영역이면 사용가능
		
		//슛저형
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수형
		float fnum;
		double dnum;
		
		
		//논리형
		boolean isTrue;
		
		//문자형
		char ch;
		
		//문자열 *참조형(주소저장) 기본형으로 사용할수있다
		String str;
		
		//----------------------------------------------------------
		//대입
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;  // L은 롱타입의 데이터라고 표시해주면 좋음
		
		fnum = 4.0f;
		dnum = 8.0;
	    
		isTrue = true;
		
		ch = 'A';  //무조건 문자 하나만 인식
		str = "A";
		
		//변수에 저장된 값 출력
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(isTrue);
		System.out.println(ch);
	}
	
	
	
	public void initVariable( ) {
		//변수 선언과 동시에 초기화
		int inum = 4;
		double dnum = 8.0;
		boolean isTrue = false;
		String str = "안녕하세요.";
		
		//변수 값 출력하기
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(isTrue);
		System.out.println(str);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






	