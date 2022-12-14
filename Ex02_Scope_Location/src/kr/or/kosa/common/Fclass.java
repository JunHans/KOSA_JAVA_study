package kr.or.kosa.common;


/*
기능 (행위) 만드는 방법
함수 (method)

 method : 행위 또는 기능의 최소단위로 구현 : 하나의 함수는 하나의 기능만 구현 
 ex 먹는다,  잔다, 걷는다 ... 
 
 클래스 : field + method
 
 ex) 롯데월드 : 게임방 : 농구, 동전, 뽑기 .... 

***method 함수는 호출에 의해서만 동작된다***
누군가 이름을 부르지 않으면 동작하지 않는다 ...!

			JAVA) 
			<void는 실행해도 뭐 안줌>
			1.void , parameter(0) : void print(String str){실행코드}
			2.void , parameter(x) : void [print() {실행코드} >> 공짜 ()이니까
			<return은 결과를 줌>
			3. return type , parameter(0) : int print(int data) {return 100;}
			4.return type , parameter(x) : int print() {return 100;} 공짜

***void > 돌려주는게 없어요 > return type 없어여
return type >> 기본 8가지 + String  + array , class , collection , interface
이중에서 기본 8가지 + String + class 까지는 인정하자

boolean print(return true or false)
Car print() { Car c = new Car(); return c; }  //나는 당신에게 Car라고하는 객체의 주소를 return 한다 
String print() 문자열을 리턴 {return "A";}

parameter type >> void print(String 파라메터) 
>> 기본 8가지 타입 + SString + array , class ,collection , interface
void print(int i){}
void print(String str){}
void print(Car car) // print함수는 parameter Car타입의 주소값을 받는다




ex)
Car car = new Car();

void print(Car car(){}
print (c); //print 함수 호춯시 c라는 변수값 (주소값)

어려워요 : 동전구멍이 여러개 있어 ....
void print(int a, int b =, int c , int d){}
print(10,20)(x)
print(100,100,100)(x)
print(100,100,100,100)(o) 4개여야 함
void print(Car c, String str, int i){}

 관용적인 표현
 코드 규칙 : 관용적인 것들
 class 이름의 첫글자는 대문자 : class Car , class Person
 method의 이름은 단어의 첫글자 소문자 이어지는 단어의 첫글자는 대문자 : getNumber()
 
 사원번호를 가지고 사원의 모든 정보를 가지고 와라(함수생성)
 getEmpKistByEmpno >> 클래스 이름은 딱보고 대략적으로 알수 있을 정도로 지어라 길게 적어도 된다 
 
 
 */
public class Fclass {
	public int data;
	
	//void m() >> 컴파일러가 default void m() >> 같은 폴더 내에서만 사용 가능 
	//함수는 70%정도가 public
	//함수 30% private : 왜? 쓸수없는데 왜? -> Hint) public과 private은 같은 클래스 내에서는 동등하다
	//클래스 내부에서만 사용해라 >> 이런 용도의 함수 >> 공통함수 >> 다른 함수를 도와주는 함수
	
	public void m() { //void, parameter가 없는
		//기능 구현
		//main 함수에서 서용했던 코드 그대로 구현 ...
		System.out.println("일반함수 : void, parameter(x)");
	}
	
	
	//void m2(int)
	public void m2(int i) { //여기서 int i가 바로 파라메터 Ex02_Method_Call에서 정수값을 같이 입력해줘야 실행됨
		System.out.println("일반함수 : void, parameter(0)");
		System.out.println("parameter 값은 활용  i변수는 함수 내부만 유효 : " + i);
	}
	
	//return type m3 (x)
	public int m3() {
		//무조건 강제로
		return 1000; //return type이 존재하면 ㄴ반드시 return 키워드 명시 필수**
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	//여기까지가 기본유형
	
	//확장 유형
	//reteun type(o) , parameter(o) 단지 갯수 차이일뿐...
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//함수의 접근자
	//default int subSum(){}  같은 폴더 됨
	//private int subSum(){}  같은 폴더도 안되요
	// class 내부에서 다른 함수를 도와주는 공통함수
	//private 함수 만들어서 사용한다
	
	private int subSum(int i) { //다른 함수가 호출해서 사용 ...
		return i + 100;          //로직이 모든 함수가 가지고 있다면 .. 변경 ... 우지보수ㅡ ..
	}
	public void callSuvSum() {
		//함수는 다른 함수를 호출할수 있다
		int result = subSum(100);
		System.out.println("call result : " + result); 
		//callSuvSum가 subSum을 호출하고 값을 적용해서 결과를 나타내는데 그게 Ex02_Method_Call파일에서 나타남
	}
	
	private int operationMethod(int data) {
		return data * 200;
	}
	public int opSum(int data) {
		int result = operationMethod(data);
		//제어문
		if(result > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	//Quiz
//	a 와 b 둘중에 큰값을 return 하는 함수를 만드세요
//	ex)함수 호출시 max(10,5) return값은 10이 나오면 됨
	
	
	public int maxminimum(int i, int j) {
		//30점
		if (i > j) {
			return i;
		} else {
			return j;
		}
		
		//60점 (return을 한개만, 나중에 수정 편함)
//		int result=0;
//		if(i > j) {
//			result = i;
//		}else {
//			result = j;
//		}
//		return result;
		
		//90점
//		int maxminimum = (i>j) ? i : j;
//		return maxminimum;
		
		//100점
//		return (i>j) ? i : j;
	}
	
}
