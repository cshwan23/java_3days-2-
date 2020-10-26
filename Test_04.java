


	package com.daum.erp;

	public class Test_04 {
 
		public static void main(String[] args) {
	
			
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// kor 변수 선언하고 90 저장	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		int kor = 90;		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// kor 변수 안의 데이터를 1증가 (방법 3가지가 있다.)
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//방법 1		kor = kor + 1;         //잠시 지움
		// kor = 90  + 1
		// 이퀄(=) 오른쪽의 변수는 데이터로 보면 된다.
		
//방법 2           ++kor;   // 증감연산자****
		
//방법 3			     kor++;
	/*
		++은 증감연산자라고 부른다. 
		왼쪽에 붙거나 오른쪽에 붙으면 +1씩 증가한다.
		변수가 하나일 경우
*/
//		--kor;   // 증감 연산자.
		
/*		kor++;
		kor++;
		++kor;          //증감연산자가 몇번썼는지만 알면 계산 가능.
		++kor;
		*/ 
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// kor 변수 안의 데이터를 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		System.out.println("kor => " +kor);
		
		
		
		
		kor = kor + 1;
		kor = kor + 1;
		kor = kor + 4;
		kor = kor - 1;
		kor = kor + 1;
		kor = kor + 1;
		kor = kor - 3;
		kor = kor + 1;
		
		System.out.println("kor => " + kor); //=> 96
		
	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//num1 변수 선언하고 20 저장
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int num1 = 20;
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//num2변수 선언하고 num1 변수안에 데이터를 1감소하고 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int num2 = num1 - 1;
		
		System.out.println("num2 => " + num2 );
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
		int num3 = 20;
	
		
// ******중요**********(내가 어려워하는 부분)(이해하고 넘어가자)(시험에 나올만 하다)
	
	
		//1. 변수가 남의 변수에 들어가있을 때
		// ++혹은 --가 왼쪽에 붙으면* 먼저 증감하고 남의 변수에 저장된다.
		int num4 = --num3;
		//2. 변수가 남의 변수에 들어가있을 때
		// ++혹은 --가 오른쪽에 붙으면*** 좌항 변수에 먼저 들어간 다음 감소가된다.
		int num5 = num3--;
		
		System.out.println("num4 => " + num4 );
		System.out.println("num5 => " + num5 );
	//******************************************************	
// 무슨 차이점이 있을까??????????????????? 
//<문제1>
		
		int num7 = 20;
		int num8 = ++num7 - num7;
		System.out.println("num7 => " + num7);
		System.out.println("num8 => " + num8);
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//<문제2>		
		
		int num9 = 20;
		int num10 = num9++ - num9;
		System.out.println("num9 => " + num9);
		System.out.println("num10 => " + num10);
			

		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//<문제3>
		
		int num11 = 20;
		int num12 = num11++ - ++num11;
			
		System.out.println("num11 => " + num11);
		System.out.println("num12 => " + num12);
			
			

		//***********************
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//<문제5>
				int num13 = 20;
				int num14 = num13++ + num13++;
					
				System.out.println("num13 => " + num13);
				System.out.println("num14 => " + num14);
				
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//<문제6>	
				int num15 = 20;
				int num16 = num15++ + num15--;
					
				System.out.println("num15 => " + num15);
				System.out.println("num16 => " + num16);				
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//<문제7>	
				int num17 = 20;
				int num18 = ++num17 + ++num17;
					
				System.out.println("num17 => " + num17);
				System.out.println("num18 => " + num18);
				
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//<문제8>	
				int num19 = -3;
				int num20 = 6;
				int num21 = num19 - --num19 + num19-- + num20--;
				
				System.out.println("num19 => " + num19);
				System.out.println("num20 => " + num20);
				System.out.println("num21 => " + num21);
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//<문제9>	
				int num22 = 0;
				int num23 = -3;
				int num24 = num22*2 - --num23 + num23++ - ++num22*3;
				
				System.out.println("num22 => " + num22);
				System.out.println("num23 => " + num23);
				System.out.println("num24 => " + num24);
			
	}

}
