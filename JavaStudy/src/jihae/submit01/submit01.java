package jihae.submit01;

public class submit01 {

	public static void main(String[] args) {
		
//		String name = "이름: 홍길동";
//		int age = 26;
//		double height = 177.9;
//		String phone = "연락처: 010-7398-7332";
//		String email = "이메일: gildong@gmail.com";
		
		String name = "홍길동";
		int age = 26;
		double height = 177.9;
		String phone = "010-7398-7332";
		String email = "gildong@gmail.com";
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("번호: " + phone);
		System.out.println("이메일: " + email);
		
		
		
		
		System.out.println("\n================================\n");
		
		String enigma = "너오구늘리뭐너먹구지리";
//		enigma = enigma.replace("너","");
//		enigma = enigma.replace("구","");
//		enigma = enigma.replace("리","");
//		System.out.println(enigma);
		
		// 한줄로 끝내눈법
		enigma = enigma.replace("너","").replace("구","").replace("리","");
		System.out.println(enigma);
		

		int example = 278;
		String cast = example + "";  // 숫자를 문자열로 변환한거
		System.out.println(cast);
		
		// substing 추천
		
		String str1 = cast.substring(0, 1); // "2"
		String str2 = cast.substring(1, 2); // "7"
		String str3 = cast.substring(2, 3); // "8"
		
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int int3 = Integer.parseInt(str3);
//		 int rrr = int1 + int2 + int3;

		 // 한줄로 끝내기
		 int rrr = Integer.parseInt(cast.substring(0, 1)) 
				 + Integer.parseInt(cast.substring(1, 2)) 
				 + Integer.parseInt(cast.substring(2, 3));
		 System.out.println("결과는: " + rrr);
		
		
		
		char a = cast.charAt(0);  
		System.out.println(a);
		char b = cast.charAt(1);
		System.out.println(b);
		char c = cast.charAt(2);
		System.out.println(c);
		
		int d = a - '0';
		System.out.println(d);
		int e = b - '0';
		System.out.println(e);
		int f = c - '0';
		System.out.println(f);
		
		System.out.println("결과는: " + (d + e + f));
		
		int rst = d + e + f;
		System.out.println(rst);
		
		String result = "결과는 : " + rst;
		System.out.println(result);   // 요거는 위에 방법 몰랐을때 쓴거! 아까워서 냅둔댜,,
		
		
		
		
		
		
		

	}

}
