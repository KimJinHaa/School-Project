package com.test01;

import java.util.Scanner;  //다른패키지에있는 걸쓰려면 import 가 필요하다.(있던곳의 경로)

public class Variable02 {

	public static void main(String[] args) {
		//준비
		Variable02 test = new Variable02();
		
		//실행
		test.inputTest();
		
			
	}
	
	
	
	public void inputTest() {
		Scanner sc = new Scanner(System.in);  //다른패키지에있는걸 입력받아 오는것 (Scanner 는 원래 있던것임)
		
		System.out.print("이름 입력: "); //실행했을때 무엇을 입력하여햐하는지 알려주는 것
		String name = sc.nextLine();  //키보드로 입력하면 이걸받아서 name 에 저장하겠다.  nextLine 은 문자열
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();       //nextInt 은 정수
		
	    System.out.print("키 입력(소숫점 첫째 자리까지): ");
	    double height = sc.nextDouble();  //nextDouble 은 실수
	    
	    
		System.out.println(name + "님은 " + age + "세 이고, 키는 "+ height + "cm입니다.");  //내가입력한값을 저장해서 콘솔창에 출력해준다.
		
		
		
		
	}
	
	
	
}
