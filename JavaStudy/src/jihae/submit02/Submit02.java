package jihae.submit02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {
		// sacn 밑에 오류나면 눌러서 임포트 해줘야됨
		Scanner task = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		String name = task.nextLine();
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int scoreK = Integer.parseInt(task.nextLine());
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>> ");
		int scoreE = Integer.parseInt(task.nextLine());
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>> ");
		int scoreM = Integer.parseInt(task.nextLine());
		System.out.println("이름: " + name);
		System.out.println("국어: " + scoreK);
		System.out.println("영어: " + scoreE);
		System.out.println("수학: " + scoreM);
		String aver = String.format("%.2f", (double)(scoreK+scoreE+scoreM)/3);  // 정수끼리 꼐산한거라 더블로 한번 형변환 필
//		System.out.printf("평균: %.2f\n()줄바꿈때문에)" + aver);  아니면 밑에 시스오 걍 하나 넣어도 됨 
		System.out.println("평균: " + aver);
		String check = ((scoreK+scoreE+scoreM)/3 >= 90) ? ("A") : (((scoreK+scoreE+scoreM)/3 >= 80) ? ("B") : ("C"));
		System.out.println("등급: " + check);
	
		String idBack = "1231476";
		int rst = Integer.parseInt(idBack.substring(0,1));
		String genderCheck = (rst % 2 == 1) ? ("남") : ("여");   // 홀수면 남자, 짝수면 여자 
		System.out.println(genderCheck);
		
		// 혹시 charAt 쓰면 이걸 "" 더해서 문자열로 또 변환시켜주고 인트로 변환
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
