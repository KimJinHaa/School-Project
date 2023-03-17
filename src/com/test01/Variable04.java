package com.test01;

//형변환
public class Variable04 {

	public static void main(String[] args) {
		//준비
		//클래스명    변수명 =  new  클래스명
		Variable04 test = new Variable04();
		//실행
		//변수명.메소드명();
		 test.test1();
		 test.test2();
				
	}
	  	
    public void test1() {
		// "a" + 1 => "a1"
	    // "a" + "1" => "a1" (자동형변환)  
    	
    	//자동 형변환이 일어남
    	int num = 'A';   // A에 부여대어있는 숫자가 자동으로 변환되어 저장된다(65)  'A' = 65  
        System.out.println(num);
        
        char ch = 97;    // 97이 문자로 형변환되어 부여되어있던 a가 저장된다.
        System.out.println(ch);
        //-는 저장이 불가능하다.
        //ch = -97;
        
        //char ch2 = num;
        //int 자료형변수에 이미 저장되어있으면 강제적으로 형변환을해야함
        //강제 형변환을하면 데이터로스가 발생할수있으니 조심
        char ch2 = (char)num;
        System.out.println(ch2);
        
        //문법상 문제는 없음. 안에 들어있는 없는 숫자를 억지로 사용하니 값이 이상하게 저장된다.(인식을못해 아무기호나 저장)
        int no = -97;
        char ch3 = (char)no;
        System.out.println(ch3);
                
        }
      
    
    public void test2() {
    	int inum = 10;
    	long lnum = 100;
    	
    	// long을 int타입으로 변환해 더할려고하니 long타입으로 결과가나와 int에 담을수없다.
    	// int isum = inum + lnum; (에러 발생)
    	
    	//1.
    	int isum = (int)(inum + lnum);   //long을 int로 강제형변환을 하자.
    	System.out.println(isum);
    	
    	//2.
    	int isum2 = inum + (int)lnum;
    	System.out.println(isum2);
    	
    	//3.
    	long lsum = inum + lnum;
    	System.out.println(lsum);
    	 
    }
		
		
		
}
