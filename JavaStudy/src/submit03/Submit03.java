package submit03;

public class Submit03 {

	public static void main(String[] args) {
		// 01 팩토리얼
		int fac = 1;
		for(int i = 10; i >= 1; i--) {
			fac *= i;
		}
		System.out.println(fac);
		
//		// 쌤 방법 / 동일  
//		int rst = 1;
//		for(int i = 1; i <= 10; i++) {
//			rst *= i;
//		}
//		System.out.println(rst);
		
		long fac2 = 1l;                       // l 안붙여도 됨
		for(int i = 15; i >= 1; i--) {
			fac2 *= i;
		}
		System.out.println(fac2);
		// 
		
		System.out.println("\n======================================\n");
		
//		System.out.println(findWally.substring(59, 61));  // 확인해보 
// 		System.out.println(findWally.substring(58, 60));  // 일케 바꾸면  
		// 02 
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int count = 0; 
		for(int i = 0; i < findWally.length()-1; i++) {
//			System.out.print(i + ":");
//			System.out.println(findWally.substring(i, i+2));  // 확인
			String wally = findWally.substring(i, i+2);
			if(wally.equals("월리")) {
				count++;
			}
		} System.out.println(count);

		System.out.println("\n======================================\n");
		
		//03
		// i가 0 1 2 3 4 일때
		// stars는 5 4 3 2 1 개
		// stars.substring(???) 의 결과가 5 4 3 2 1개 나와야됨
		
		
		String stars = "*****";
//		for(int i = 0; i < 5; i++) {
//			System.out.println(stars.substring(0, 5-i));
//		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(stars.substring(i));      // 01234 순서대로 0~끝까지, 1~끝까지 이렇게 함
		}
		

		
		
		
		

	}

}
