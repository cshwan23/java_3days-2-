# java_3days-2-
kosmo/ 1.변수/2.형변환/3.연산자

<교재물 보면서 필기 다시 할것.>
<//증감연산자 코딩 연습 더하기>

1.교재물 (6번 페이지 )

#1 <변수>

		변수 :  데이터가 저장되는 [메모리 기억장소]에 붙인 이름인데,
		변하는 수를 갖고있다는 말.
		데이터가 자꾸 갱신된다.

		결국, * 변수란   => 변수 자체가 데이터가 된다.
		=> 변수안에 들어있는 데이터를 봐야한다.(이걸 명심해야)
		
#2 <* 변수 선언과 데이터 저장 형식 *>

[1] 지역변수 : (1회성 변수이다.)

	1. 자료형 + 지역변수명 = 데이터;    

// 지역변수 선언과 동시에 개발자가 데이터를 저장(개발자가 초기화 함)

	2-1. 자료형 + 지역변수명;          

// 지역변수 선언, 데이터 저장 X (자동 초기화 실패)

	2-2. 지역변수명 = 데이터;
	
// 개발자가 데이터를 저장 O (개발자가 초기화 함) (= 수동 초기화 함) 

[2] 속성변수 : 

	1. 자료형 + 속성변수명 = 데이터;
	
// 속성변수 선언과 동시에 개발자가 데이터를 저장. (= 수동 초기화 함)

	2. 자료형 + 속성변수명; 
	
// 속성변수 선언과 동시에 프로그램(자바)이 자동으로 기본값 데이터를 저장. (= 자동 초기화 됨)

[3] 초기화 : (initialization) (= init)
변수 선언 이후 처음으로 데이터를 저장하는 행위
<주의> 지역 변수는 자동 초기화가 불가능하다.

[4] 변수 선언 :

데이터 저장을 위한 메모리 공간을 확보해 달라고 JVM에게 부탁하는 행위이다.

	JVM (JDK를 깔면 설치되는 소프트웨어)
	
	JAVA는 운영체제를 가리지 않는다. (=자바의 최대 강점)
	
	JVM만 깔려있으면 (Java Virtual Machine) (지금은 다양한 운영체제를 가지는데)
	어떤 운영체제든 가리지 않고 
	한번코딩한 것으로 똑같은 결과를 갖는다. 
	

[5]Final 용법

1. 변수 앞 갱신 금지
2. 클래스 앞 상속금지 (클래스 간)
3. 메서드 앞 overriding 금지

[6] 상속(inheritance)

: 부모 자식간의 상속 처럼 전달 공유 가능.

[7] 오라클(Oracle)

	특징: 데이터가 안 들어올 때 null 값으로 대체한다.

	null 값은 기본형 데이터가 아니라 참조형 데이터이다.
	java 에서의 null 과 oracle에서의 null은 다르게 쓰인다.
	
	


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

2. 교재물(7페이지 )

# 1 자료형 변환 

	서로 다른 자료형의 데이터끼리 연산할 때 또는 변수에 데이터를 저장할 때 자료형을 통일하는 작업



# 2 (암시적 형변환/ 명시적 형변환) 종류
암시적 : 6가지
명시적 :3가지

[1] 암시적 형 변환 (Implicit Type Conversion)

	: 어느 한 쪽으로 자료형이 (자바가)알아서 형변환 하는 것
	: 암시형변환 시 우선순위 ( byte < char/short < int < long < float <double)
	: 주의) 문자형 데이터가 정수형으로 변환시 -> 문자의 아스키 코드 정수값으로 변환한다.
	
[2] 암시형 변환의 6가지 종류

1) 정수 + 정수 => 정수 

		int num1 = 5;
		int num2 = 2;
		int result = num1/num2;
	
둘다 정수이고 변수도 정수이기때문에 2.5가 아니라 소수점을 날리고 정수형 2가 된다.
(자바의 편집증적 증세 = 소수점 날림)

2) 정수 + 정수 => 실수

		int num1 = 5;
		int num2 = 2;
		double result = num1/num2;
		
정수 에서 정수를 나눴기 때문에 소수점을 날리고 2가 되고 마지막 변수데이터형식이 실수(double)이기 때문에
2.0이 나오게 된다. 형변환은 나눌때 일어나는게 아니라 정수로 나누고 난 후 더블로 형변환이 1번 일어난다.

3) 실수 + 정수 => 실수

		double num1 = 5.0;
		int num2 = 2;
		double result = num1/num2 
		
=>result의 값은 2.5
실수(double)가 정수(int)보다 크기 때문에 정수에서 실수로 형변환이 일어난후 나누기 연산자가 실행된다.
실행된후 값을 실수로 받기때문에 실수값 2.5가 나온다. 
형변환은 처음에 한번 일어난다.

4) 정수 + 실수 => 실수

		int num1 = 5;
		double num2 = 2.0;
		double result = num1/num2;
		
실수가 정수보다 더 크기 때문에 정수5 가 5.0으로 형변환이 일어나고 나누기 연산후(5.0/2.0)
값을 더블로 저장하기 때문에 값은 2.5가 된다.
형변환은 1번 일어난다.

5) 실수 + 실수 => 실수

		double num1 = 5.0;
		double num2 = 2.0;
		double result = num1/num2;
	
5.0 / 2.0 연산이 이루어지고 값도 더블이기때문에 2.5로 형변환은 일어나지 않는다.

6) 차형데이터 => 정수

		int num2 = 'a';

차형 데이터에서 정수형데이터로 형변환이 일어나야 하는데 
차형 데이터는 아스키 코드값으로 형변환이 가능하다. 
num2변수에 아스키코드값(a) 97로 변환하여 저장된다.
형변환은 한번 이루어 진다.


[3] 명시적 (Explicit Type Converesion)

	: (개발자가)코딩으로 cast 연산자를 강제로 명시함으로써 원하는 자료형으로 변환시키는 것을 말한다.
	: *cast 연산자 바로 뒤의 변수 또는 데이터를 (원하는 자료형)으로 변환시킨다.
	
	(변환자료형) + 변수 <== Type Casting
	

1)

	int num1 = 5;
	int num2 = 2;
	double result = (double)num1/num2;
	
num1num2둘다 정수이지만 그 앞에 ()괄호로 더블이 캐스팅 되어있다.
우선적으로 캐스팅바로뒤의 자료형을 더블로 강제 타입캐스팅을 하면 5-> 5.0이 되고
실수가 정수보다 더 크기 때문에 num2가 암시적 형변환이 이루어져 2.0이 된다.
5.0/2.0 연산이 이루어지고 2.5에서 더블데이터 형이기 때문에 2.5 결과값으로 저장된다.
-> 여기선 두번 형변환이 이루어진다.(1명시적2암시적)

2)

	int num1 = 5;
	int num2 = 2;
	double result = (double)(num1/num2);
	
캐스팅 연산자가 있지만 바로뒤에 괄호로 변수를 묶여있을 경우 우선 연산부터 하게된다.
num1/num2를 먼저 연산하게되면 2가 되고 이것을 더블로 캐스팅 하게 되면 2.0이 나오게되고
최종 변수의 데이터타입이 더블이므로 2.0이 저장된다.
형변환은 총 1번 이루어 진다.

3)

	int num1 = 5;
	int num2 = 2;
	int result = (double)num1/num2;
	
정수를 먼저 더블로 캐스팅을 하게 되는데
5->5.0
이후 암시적 형변환으로
2->2.0이된다
값은 2.5이지만 최종 변수의 데이터 저장 형식은 정수이다.
실수에서 정수로 저장을 할수 없다.
(정수가 실수보다 작기때문에 실수의 소수점을 손실해버린다.)
결국 컴파일 에러가 발생한다.


* 자료형의 편집적 증세: 자료형의 데이터형식이 같아야 한다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


# 3. 연산자(operator)- 8페이지(교재)

: 데이터를 처리하기 위한 각종 기호를 의미한다.

연산자의 종류7가지

	1)대입연산자
	2)연결연산자
	3)사칙연산자
	4)증감연산자
	5)비교연산자
	6)논리연산자
	7)삼항연산자

// 100점맞게할순없다. 일부러 잘 안스는 문제를 만들어서 틀리게 만든다.
// 그걸 아는사람은 전체를 다 알지않겠냐.
// 그래서 7가지 전부를 다 알아야한다.
//오로지 true/false만 내놓는 연산자? => 비교&논리 연산자

[1] 대입연산자

	= 이퀄로 이루어져 있다.
	변수에 데이터를 입력하는 연산자이다.

[2] 연결 연산자

	: 문자와 문자를 붙여주는 연산자로 + 를 말한다.
	String uld = "Tom" + "Good"

[3] 사칙 연산자

	: 숫자끼리 더하기, 빼기, 곱하기, 나누기(몫), 나눈후 나머지 를 구하는 연산자다.
	: 나머지를 쓰는 이유?
	: 3의 배수인지 아닌지( 나누었을때 나머지가 0)
	: 특정 숫자를 골라낼 때. 사용한다
	: 홀수는 나누면 다 홀수 아니면 짝수
	
[4] 증감 연산자

: 변수 앞 또는 뒤에 붙어 변수에 저장된 값을 1씩 증가 또는 1씩 감소 시키는 연산자

*변수 추적이 어렵기 때문에 잘 알아야 한다. 하나씩 증가하거나 하나씩 감소시키는 것.
*그걸 추적하기가 어렵다. 입사 시험 때 가장 많이 틀림.

증감 연산자가 붙은 위치에 따라 다른 연산이 이루어 진다

		[증감 연산자] 가 왼쪽에 붙는 경우 --> 먼저 증감하고 연산에 참여
		[증감 연산자] 가 오른쪽에 붙는 경우 --> 연산에 참여한 후 증감
		

[5] 비교 연산자 *****중요x5

: 2개의 데이터가 같거나 다름 혹은 대소관계를 판단하여 true 나 false의 결과값을 리턴하는 연산자다.
 주로 반복문이나 조건문에서 사용된다.
 
 비교연산자의 종류
 
  	 1) ==  좌우가 같으면? true/false
  	 2) !=  좌우가 다르면? true/false
 	 3) >   좌가 우보다 크면? true/false 
	 4) <   우가 좌보다 작으면? true/false
 	 5) >=  왼쪽이 오른쪽보다 같거나 크면
 	 6) <=  오른쪽이 같거나 크면
	 
[6] 논리 연산자 *******중요x7

:true 또는 false 값을 가지고 논리적 연산을 하여 true / false를 리턴하는 연산자.
주로 조건문이나 반복문에서 사용

		1) && 좌우 모두 true인경우 true리턴 false일 경우 false 리턴 / flase시 남아있는 연산 안함
		
		2) & 좌우 모두 true인경우 true리턴 false일 경우 false 리턴 / 남아있는 모두 무조건 연산.
		
		3) ㅣㅣ 좌우 중 하나이상 true -> true 리턴  /true리턴시 남아있는 연산 안함.
		
		4) ㅣ 좌우 중 하나이상 true -> true리턴 / 무조건 모두 연산.
		
		5) ! 우측이 true 이면 false 리턴 false면 true 리턴
		
		
[7] 삼항연산자 ***중요x3

: 조건식 true이면 설정 데이터를 리턴하는 연산자이다.
  
  
//

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//코딩 연습


<문제 1>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
num3의 값은?

		int num1 = 5;
		int num2 = 2;
		double num3 = num1 / num2;
		
		System.out.println("numb3 => " + num3 );
		
<정답>
		 num3에 2.0이 저장되는 이유?	 
     
<이유> 
(자료형 우선순위)

=> num1/num2 연산결과인 int형 2가 double형 변수에 저장되므로 
2 -> 2.0으로 형 변환이 된다.

=> 데이터 끼리 연산시 자료형이 서로 틀리면 한쪽이 다른 쪽에 맞춰 자료형이 변환되고, 데이터를 변수에 저장할 경우에도 데이터가 변수의 자료형으로 변환된다.

<문제 2>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		int num4 = 5;
		double num5 = 2.0;
		double num6 = num4 / num5;
		System.out.println("num6 => " + num6 );
		

<문제>
암시적 형변환은 언제 일어나나?
<정답>
num4 / num5 의 자료형을 double로 나눌때 암시적 형 변환 발생.
<나의 정답>
5.0 / 2.0
형변환은 나눌 때 일어난다.
		
집요하게 끝까지 집중하는게 중요하다. 


<문제 3>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<캐스트 연산자	
		int num7 = 5;
		int num8 = 2;
		double num9 = (double)num7/num8;
		System.out.println("num9 => " + num9 );
		
 <나의 정답>
5.0/2.0
= 2.5

 변수 num9에 2.5 저장
 (double)은 num7만 잡고 흔드는거다. 
 num7이 5.0 으로 변환시킨다 (명시적 형변환)
 num8 도  num7에 따라 double형으로 변환된다.(암시적 형변환)
(double)을 cast 연산자라고 부른다.
		

//<문제4>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//**************중요*** 캐스트 연산자 역할****
	double num10 = 5;
	int num11 = 2;
	double num12 = (int)num10/num11;
	System.out.println("num12 => " + num12 );
	
//	5.0 -> 5 로 거꾸로 바꿀수 있다?
//		5/2
//		2
// 		2.0
	//cast 연산자는 우선순위를 바꿔버리는 거다.
	//cast 연산자는 개발자가 명시적으로 특정목적하에 실수를 정수로 바꿀수 있다.
	//cast연산자는 명시적 연산자기때문에.
		
//<문제5>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
	int num13 = 5;
	int num14 = 2;
	double num15 = (double)(num13/num14);
	System.out.println("num15 => " + num15 );
	
	/*
	 5/2
	 2
	 2.0
	 */
	//(double)은 num13을 변환시키지 않고
	//num13/num14의 결과값을 변환시킨다(명시적변환)
	
	


# 5. 증감 연산자

[1] 변수가 하나일 때(증감연산자)


	public class Test_04 {
 
		public static void main(String[] args) {
	
			

kor 변수 선언하고 90 저장	
			
		int kor = 90;		
		
		
kor 변수 안의 데이터를 1증가 (방법 3가지가 있다.)
			
//방법 1	

	kor = kor + 1;         //잠시 지움
	kor = 90  + 1
	이퀄(=) 오른쪽의 변수는 데이터로 보면 된다.
		
//방법 2

	++kor;   // 증감연산자****
		
//방법 3			     

	kor++;

++은 증감연산자라고 부른다. 
왼쪽에 붙거나 오른쪽에 붙으면 +1씩 증가한다.



		--kor;   // 증감 연산자.
		
		kor++;
		kor++;
		++kor;          
		++kor;
		
//증감연산자가 몇번썼는지만 알면 계산 가능.

kor 변수 안의 데이터를 출력
			
		System.out.println("kor => " + kor);
		
		
		
		
		kor = kor + 1;
		kor = kor + 1;
		kor = kor + 4;
		kor = kor - 1;
		kor = kor + 1;
		kor = kor + 1;
		kor = kor - 3;
		kor = kor + 1;
		
		System.out.println("kor => " + kor); //=> 96
		
num1 변수 선언하고 20 저장
		
		int num1 = 20;
		
num2변수 선언하고 num1 변수안에 데이터를 1감소하고 저장하기
		
		int num2 = num1 - 1;
		
		System.out.println("num2 => " + num2 );
	
	
*****			
//증감연산자 코딩 연습 더하기
*****			
[2] 변수가 남의 변수에 들어가 있을때(두개이상일 때)(증감연산자)	



: 1. 변수가 남의 변수에 들어가 있을 때 

++ 혹은 --가 *왼쪽에 붙으면* 먼저 증감하고 남의 변수에 저장된다.

	int num3 = 20;
	int num4 = --num3;

: 2. 변수가  남의 변수에 들어가 있을 때
++ 혹은 --가 *오른쪽에 붙으면* 좌항 변수에 먼저 들어간다음 감소가 된다. 

	int num5 = num3--;
	
둘다 값은 19 이다.

	System.out.println("num4 => " + num4 );
	System.out.println("num5 => " + num5 );
	
	
//<문제1>
		
		int num7 = 20;
		int num8 = ++num7 - num7;
		System.out.println("num7 => " + num7);
		System.out.println("num8 => " + num8);

num7 => 21
num8 => 21 - 21 = 0		

//<문제2>		
		
		int num9 = 20;
		int num10 = num9++ - num9;
		System.out.println("num9 => " + num9);
		System.out.println("num10 => " + num10);
			
num9 => 21
num10 => 20 - 21 => -1

//<문제3>
		
		int num11 = 20;
		int num12 = num11++ - ++num11;
			
		System.out.println("num11 => " + num11);
		System.out.println("num12 => " + num12);
			
num11 => 22
num12 => 20 - 22 = -2
			
//<문제5>
				
		int num13 = 20;
		int num14 = num13++ + num13++;
					
		System.out.println("num13 => " + num13);
		System.out.println("num14 => " + num14);
				
num13 => 22
num14 => 20 + 21 = 41
				
//<문제6>	

		int num15 = 20;
		int num16 = num15++ + num15--;
					
		System.out.println("num15 => " + num15);
		System.out.println("num16 => " + num16);				
				
num15 => 20
num16 => 20 + 21 = 41
				
//<문제7>	

		int num17 = 20;
		int num18 = ++num17 + ++num17;
					
		System.out.println("num17 => " + num17);
		System.out.println("num18 => " + num18);
				
num17 => 22
num18 => 21 + 22 = 43
				
//<문제8>	

		int num19 = -3;
		int num20 = 6;
		int num21 = num19 - --num19 + num19-- + num20--;
				
		System.out.println("num19 => " + num19);
		System.out.println("num20 => " + num20);
		System.out.println("num21 => " + num21);
		
num19 => -5
num20 => 5
num21 => -3 - -4 + -4 + 6 = 3
		
				
//<문제9>	

		int num22 = 0;
		int num23 = -3;
		int num24 = num22*2 - --num23 + num23++ - ++num22*3;
				
		System.out.println("num22 => " + num22);
		System.out.println("num23 => " + num23);
		System.out.println("num24 => " + num24);
		
num22 => 1
num23 => -3
num24 => 0 - -4 + -4 - 3 = -3
			
	




		 
		
