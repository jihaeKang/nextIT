package submit04;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {
//		Q. 01
//		로꾸꺼 로꾸꺼
//		사용자에게 문자열을 입력받으시고, 입력받은 문자열의 순서를 뒤집어서 출력해보세요.
//		Hint
//		LoopFor의 1부터 n까지 더하는 형태를 참고

//		for문 내부가 반복될때마다 입력받은 문자열을 한글자씩 잘라 문자열 변수에 더한다.
//		int sum = 0; 
//		for(int i = 1; i <= 20; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		// 한글자씩 잘라보기
		// substring(2,3) (1,2) (0,1)

		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("거꾸로 뒤집을 문자열 입력:");
//
//		String input = scan.nextLine();
//		String rev = "";
//		
//		for(int i = input.length(); i > 0; i--) {
//			String cut = input.substring(i-1, i);
//			rev += cut;
//		} System.out.println(rev);
//		
//		
//		System.out.println("\n==================================\n");
		
		
//		Q. 02
//		엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터만 이동하는 프로그램을 구현해 봅시다.	               
//		1. 사용자가 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
//		2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
//		 ex) 엘리베이터 A는 1층, B는 7층일때 사용자의 위치가 4층이면 엘리베이터 B가 내려온다. 
//		3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
//		4. 엘리베이터 프로그램을 종료하려면 q, exit 중 하나를 입력한다.
		
		int eleA = 10; // 엘리베이터 A의 위치는 10층
		int eleB = 4; // 엘리베이터 B의 위치는 4층
		
		while(true) {
			System.out.println("\n================ 희영빌딩 엘리베이터 ===================\n");
			System.out.println("승강기 A의 현재 위치: " + eleA);
			System.out.println("승강기 B의 현재 위치: " + eleB);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]: ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("q") || inputText.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			int floor = Integer.parseInt(inputText);
			
			// 층수차이 계산
			
			int diffA = Math.abs(eleA - floor);
			
			int diffB = Math.abs(eleB - floor); // 4 - 9 = -5 > 5 로 적용 절댓값 쓰거나ㅣ if로 직접 보정 , 삼항연산자도 가능
			
//			if(diffB < 0) {
//				diffB *= -1;
//			}
//			int diffB = (eleB < floor)?(floor - eleB):(eleB - floor)
			
			if(diffA > diffB) {
				System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
				eleB = floor;
			}else if(diffA < diffB) {
				System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
				eleA = floor;
			}else {
				
				if(eleA > eleB) {
					System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
					eleA = floor;
				}else {
					System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
					eleB = floor;
				}
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
