package ch06_method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {

		// 메소드 = method = 함수 = function
		// 굳이 나누자면 method는 클래스에 종속된 함수를 말하며, function은 클래스의 독립적인 함수를 말한다.
		
		// 1부터 100까지 다 더하면 결과는?
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지 더한 결과: " + sum);
		
		// 30부터 60까지 다 더하면 결과는?
		sum = 0;
		for(int i = 30; i <= 60; i++) {
			sum+=i;
		}
		System.out.println("30부터 60까지 더한 결과: " + sum);
		
		// 25부터 50까지 ㅏㄷ 더하면 결과는?
		sum = 0;
		for(int i = 25; i <= 50; i++) {
			sum+=i;
		}
		System.out.println("25부터 50까지 더한 결과: " + sum);
		
		System.out.println("\n==================================\n");
		
		// 위 작업을 함수로 만들기
		// 메소스 실행
		// 70부터 90까지 더하기
		printSum(70, 90);
		
		// 함수를 쓰면 좋은점
		// 실행부의 코드가 간결해진다.(가독성 증가)
		// 중복된 코드를 함수로 만들어서 사용하면 해당 코드를 한 곳에서 관리할 수 있으므로 수정할 때 용이
		
		// 리턴값이 존재하는 함수 만들기
		returnSum(80,90); // 리턴값을 사용하고 있지 않음
		// =935 값으로 변한거고 그 결과 다른데 담아서 쓸 수 있음 void 는 안됨
		
		int rst = returnSum(80, 90);
		System.out.println(rst);
		
		System.out.println("\n=========================================\n");
		
		// System.out.println(); 를 print() 만들어쓰기
		print("파이썬 저리가라~");
		System.out.println("파이썬 저리가라~");
		
		System.out.println(returnSum(1, 10));
		print(returnSum(1, 10));
		
		System.out.println("\n========================================\n");
		
		// 절댓값 구해주는 메소드 만들기
		int number = Math.abs(-10);
		System.out.println(number);
		
		// 메소드명: absolute
		// 파라미터 타입: int
		// 리턴 타입: int
		number = absolute(-10);
		System.out.println(number);
		
		System.out.println("\n==================================\n");
		
		// 이름, 국어 점수, 영어 점수, 수학 점수를 
		// 파라미터로 넣으면
		// 이름: 유정
		// 국어: 90
		// 영어: 85
		// 수학: 87
		// 평균: 87.11
		// 등급: B
		// (90점 이상 A, 80점 이상 B, 그 외 C)
		makeCard("유정", 90, 85, 87);
		
		System.out.println("\n=============================================\n");
		
		//LoopFor 에서 했던 각 자리수 더하기 메소드화
		int sumA = eachAdd(33333);
		System.out.println(sumA);
		
		System.out.println("\n=============================================\n");
		
		// LoopWhile 에서 했던 포켓몬스터도 메소드로 만들어버리기
//		playPokemon();
		
		System.out.println("\n=============================================\n");
		
		// 재귀함수(Recursion Function)
		// 메소드 내부에서 해당 메소드를 또 실행하는 경우
		// 메소드를 반복 실행
		
		// 5
		// 4
		// 3
		// 2
		// 1
		
		
		
		recursionPrint(10);
		
		System.out.println("\n=============================================\n");
		
		// 팩토리얼
		long no = factorial(5);
		System.out.println(no);
		
		// 재귀함수를 이용한 팩토리얼
		no = recFactorial(5);
		System.out.println(no);
		

	} 
	
	public static long recFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num*recFactorial(num-1);
		// 5를 넣었다면
		// 5 * recFactorial(4)
		// 5 * 4 * recFactorial(3)
		// 5 * 4 * 3 * recFactorial(2)
		// 5 * 4 *3 *4 *2 *recFactorial(1)
		// 5*4*3*2*1
	}
	
	
	public static long factorial(int num) {
		// 팩토리얼을 어디서 했더라??
		// 단축키 [Ctrl + H]
		long fac2 = 1;                       // l 안붙여도 됨
		for(int i = num; i >= 1; i--) {
			fac2 *= i;
		}
		return fac2;
	}
	
	
	
	public static void recursionPrint(int num) {
		// 재귀함수도 반복을 중단하는 조건을 잘 설정해 주어야 한다.
		if(num <= 0) {
			return;
		}
		
		System.out.println(num);
		recursionPrint(num-1);
		
	}
	
	
	
	// 리턴타입이 없는 void 메소드도 리턴은 사용가 
	public static void playPokemon() {
		Scanner scan = new Scanner(System.in);
		
		int enemyHp = 100;
		outer: while(true) {
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				// 공격
				while(true) {
					System.out.println("공격방법 선택");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">>> ");
					
					int select = Integer.parseInt(scan.nextLine());
					
					if(select == 1) {
						System.out.println("피~~~카~~~~츄!!!");
						enemyHp -= 20;
					}else if(select ==2) {
						System.out.println("삐까삐까");
						enemyHp -= 10;
					}else if(select ==3) {
						System.out.println("공격취소");
						// 내부 while문 종료, 외부while문은 계속 실행
						break;
					}
					
					System.out.println("파이리의 현재 체력은: " + enemyHp);
					
					// 파이리 꽤꼬닥
					if(enemyHp <= 0) {
						System.out.println("파이리를 잡았다!!");
//						System.exit(0);   // 프로그램 / 종료 이것도 사용가능
						// 내부에서 외부 while문 중지(외부while문에 별명을 주면 됨)
//						break outer;
						
						// void 에서의 리턴
						// 메소드를 즉시 종료하는 효
						return;
					}
				}
			
			}else if(command == 2) {
				// 도망
				System.out.println("도망쳤습니다.");
				break;
				
			}
			
			
		}
	}
	
	
	
	public static int eachAdd(int num) {
		
		String cast = num + "";  // 숫자를 문자열로 변환한거
		
		int result = 0;
		// 문자열의 길이만큼 반목되는 for문
		for(int i = 0; i < cast.length(); i++) {
			String str = cast.substring(i, i+1);
			int no = Integer.parseInt(str);
			result += no;
		}
		return result;
	}
	
	
	// 메소드 선언
	// [접근제어자 static] 리턴타입 메소드명(파라미터){  } 
	// void 는 리턴타입이 없는 메소드를 의미
	public static void printSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum+=i;
		}
		System.out.println(from + "부터 " + to + "까지 더한 결과는 " + sum);
	}
	
	public static int returnSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum+=i;
		}
		System.out.println(from + "부터 " + to + "까지 더한 결과는 " + sum);
		// 변수 sum의 값을 리턴
		// 메소드 내에 return이 실행되면 그 즉시 메소드를 종료
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	// 하나의 클래스 내에 있는 메소드는 기본적으로 메소드 명이 중복되면 안된다.
	// 메소드 오버로딩
	// 하나의 클래스 내에 파라미터의 타입, 수를 다르게 지정하는 경우 중복된 메소드명을 사용할 수 있음
	public static void print(int num) {
		System.out.println(num);
	}
	
	public static int absolute(int num) {
		// 들어온 num 값이 양수면 그대로 리턴
		// 음수면 양수로 바꿔준 후 리턴 (-1을 곱함)
		if(num < 0) {
			num *= -1;
		}return num;
	}
	
	public static void makeCard(String name, int scoreK, int scoreM, int scoreE) {
		System.out.println("이름: " + name);
		System.out.println("국어: " + scoreK);
		System.out.println("영어: " + scoreM);
		System.out.println("수학: " + scoreE);
		// avg 값 반올림 (몇번쨰 자리를 기준) 메소드 만들 
		double avg = (scoreK + scoreM + scoreE) / 3.0;
		// 반올림 
		// 89.66 > 90
		// 89.67 로 떨어지게 만들
		double score = weRound(avg, 1);
		System.out.println("평균: "+ score);
		
		if(score >= 90) {
			System.out.println("등급: A");
		}else if(score >= 80) {
			System.out.println("등급: B");
		}else{
			System.out.println("등급: C");
		
		}
	

		
	
		
		
		
		
	}
	
	
	/**
	 * 입력한 소수를 반올림하여 소수 n번째 자리로 리턴해주는 함수입니다. 
	 * @param num 반올림하고자 하는 소수
	 * @param n 소수 n번쨰 자리까지 리턴
	 * @return 반올림된 소수를 리턴 
	 */
	public static double weRound(double num, int n) {
		// Math.round() 는 소수 첫째자리에서 반올림한 정수를 리턴
		// 3.141592 에 Math.round(3.141592)를 하면 3이 된다.
		// 그런데 3.1 로 만들고 싶다면?
		
		// 3.141592에 10을 곱한다 > 31.41592
		// Math.round(31.41592) > 31
		// 31을 10으로 나눈다 > 3.1
		
		// 3.141592 에 100을 곱한다 > 314.1592
		// Math.round(314.1592) > 314
		//314를 100으로 나눈다 > 3.14
		
		// 10의 n제곱 구하기
		int ten = 1;
		for(int i = 0; i < n; i++) {   //n회 반복하는 for문
			ten *= 10;
		}
		
		num *= ten;
		long temp = Math.round(num);
		
		double result = (double)temp / ten;
		return result;
	
	
	
	
	}
}
