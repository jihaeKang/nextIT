package ch03_system;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		// 표준 출력
		// 콘솔창에 텍스트 출력하기
		// println()
		// 콘솔창에 괄호안 내용을 출력 후 줄바꿈(개행문자) 해준다.
		System.out.println("이미 알고 있음");
		System.out.println(); // 안에 아무 내용도 안 적으면 줄바꿈만 일어남.
		System.out.println("end");
		
		// print()
		// 괄호안 내용을 출력하기만 함
//		System.out.print(); // 자동 줄바꿈 기능이 없기때문에 내용 없으면 에러남.
		System.out.print("줄바꿈안됨");
		System.out.print("보기 불편..");
		
		System.out.println("\n============================\n");
		
		// 제어문자
		// 문자열 내에 역슬래시(\)를 이용하여
		// 특정 기능을 사용할 수 있다.
		
		// \n 줄바꿈
		System.out.print("println처럼 동작\n");
		System.out.println("중간에 \n 을 넣어보자");

		// \t 탭
		System.out.println("월\t화\t수\t목\t금");
		System.out.println("1\t2\t3\t4\t5");
		System.out.println("8\t9\t10\t11\t12");
		
		// 문자열 내에서 기능을 가지는 문자(\, ", ')
		// 얘네들을 콘솔창에 문자 그대로 출력하고 싶다면 앞에 \를 붙여준다. 그럼 기능을 잃고 문자로 출력 가능 
		System.out.println("개행문자는 \\n");
		System.out.println("소크라테스 왈 \"너 자신을 알라\"");
		
		// 특수문자도 출력 가능하다.
		System.out.println("♥");
		
		System.out.println("\n==============================\n");
		
		// printf()  -- 별로 안중요한듯
		// 콘솔창에 포맷 문자열(format string) 형태로 내용을 출력
		System.out.printf("%d명이 수업을 듣고 있습니다.\n", 24); // %d 가 숫자를 의미해서 숫자를 뒤에 넣어줌
		System.out.printf("%d명이 %s을 듣고 있습니다.\n", 24, "수업"); // %s 가 문자를 의미해서 숫자를 뒤에 넣어줌
		
		// 예시
		System.out.printf("%03d장 표준입출력\n", 3); 
		// d 바로 앞에 있는 숫자는 자릿수를 의미, 그 앞에 영은 맨뒤에 나오는 숫자가 그 자릿수를 못 채울때 0이 메꾸겠다는 의미
		System.out.printf("원주율은 %.02f", 3.1);
		// 근데 몰라도 됨
		System.out.printf("통장 잔고는 %,d원입니다.", 1000000);
		
		System.out.println("\n========== 표준 입력 ============\n");
		
		// scanner 클래스로부터 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		
		// 키보드 입력 받기
		String name = scan.nextLine();  // 이거 쓰면 콘솔에 뭐 쓰기 전까지 밑에꺼 실행 안됨   
		
		System.out.println(name + ": 좀 덥네요.");
		
		// scan.next() 또는 scan.nextInt() 등은 사용하지 않기
		System.out.println("에어컨 희망 온도를 입력해주세요.");
		System.out.print(">>> ");
		
		// 다만 .nextLine()은 숫자를 입력해도 문자열로 가지고 온다. 그래서 변환 해주면 됨
		
		int temper = Integer.parseInt(scan.nextLine());
		
		System.out.println("희망 온도: " + temper);  // 여까지는 문제 없음 nextint 써도
		
		System.out.println("냉방/난방 선택해주세요.");
		System.out.print(">>> ");
		String mode = scan.nextLine();
		System.out.println("모드: " + mode);
		//여기서 문제 생김. 걍 nextLine 계속 써라
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
