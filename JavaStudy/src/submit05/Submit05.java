package submit05;

public class Submit05 {

	public static void main(String[] args) {
//		for문을 배울때, 트리를 참 많이 만들었죠?
//		근데 항상 5층짜리 트리여서 아쉬웠을거에요.		
//		n층 짜리 트리를 출력할 수 있는 makeTree(int n) 메소드를 만들어서 실행시켜 주세요.

		makeTree(5);
		makeTree(7);
		
		System.out.println("\n=========================\n");
		
//		십진수를 이진수(String 타입)로 리턴해주는 makeBinary(int 타입) 함수를 만들어보세요.
//		Hint
//		문자열 변수를 하나 선언해서 
//		입력받은 정수를 2로 나눈 나머지를 문자열 변수에 더한다.
//		그 다음 입력받은 정수를 2로 나눈 몫을 이용하여 위 과정을 반복한다.
//		2로 나눈 몫이 1이 된다면 반복을 종료한다.
//		이진수로 만들어진 문자열 변수를 거꾸로(로꾸꺼) 뒤집은 다음 리턴한다.
		// 자바에서 이지수, 16진수 등등은 문자열
		String binaryString = Integer.toBinaryString(17);  // 이걸로도 사용 가능/원래 만들어져있던 메소
		System.out.println(binaryString);
		
		String num = makeBinary(17);
		System.out.println(num);
		
		
		System.out.println("\n=========================\n");
//		로꾸꺼를 메소드로 만들어서
//		파라미터로 들어온 String 문자열에 대해 뒤집은 결과를 리턴하는 메소드
//		String example = "로꾸꺼 로꾸꺼";
//		String result = reverseStr(example); 
//		System.out.println(result);
		
		String example = "로꾸꺼 로꾸꺼";
		String result = reverseStr(example);
		System.out.println(result);
		
		
		
		
		
		
		

	}
	public static void makeTree(int n) {

		for(int i = 0; i < n; i++) {
			String space = "";
			for(int k = 0; k < n-1-i; k++) {
				space += " ";
			}
			
			String stars = "";
			for(int k =0; k < (i*2)+1; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
		
		
		
	}
	
	public static String makeBinary(int n) {
		// n에 17이 들어왓다.
		// 17을 2로 나눠서 나머지 1 / 몫은 8
		// 8을 2로 나눠서 나머지 0 / 몫은 4
		// 4를 2로 나눠서 나머지 0 / 몫은 2
		// 2를 2로 나눠서 나머지 0 / 몫은 1 (스탑)
		// 반복횟수와 기준이 애매하면 일단 while(true) 하기
		
		String two = "";
		
		while (n >= 1) {
	    	two += (n % 2); 
	    	n /= 2; 
	    } 
		
//		String rev = reverseStr(two);
		return reverseStr(two);
	} 
		
	
	
	
	public static String reverseStr(String input) {
		String rev = "";
		for(int i = input.length(); i > 0; i--) {
			String cut = input.substring(i-1, i);
			rev += cut;
		} return rev;
	}
	
	
	
	
	

}
