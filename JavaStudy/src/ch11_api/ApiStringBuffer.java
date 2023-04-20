package ch11_api;

public class ApiStringBuffer {

	public static void main(String[] args) {
		// 문자열하면 String
		// String을 계속 수정하면 힙 영역에 매번 새로운 String 객체가 만들어지고,
		// 그로인해 가비지 컬렉터가 할 일이 많아진다.
		// 비효율적
		
		// 랜점 숫자 10자리를 문자열에 더하기
		String text = "";
		for(int i =0; i < 10; i++) {
			int rand = (int)(Math.random()*10);
			
			text += rand;
			
//			if(i % 10000 == 0) {
//				System.out.println(i);
//			}
			
		}
		System.out.println(text);
		
		// StringBuffer 객체 소환
		StringBuffer strBuff = new StringBuffer();
		
		System.out.println(strBuff);
		
		// append(문자열) 문자열을 추가
		strBuff.append("12");
		System.out.println(strBuff);
		
		strBuff.append("34");
		System.out.println(strBuff);
		
		for(int i = 0; i < 1000; i++) {
			int rand = (int)(Math.random()*10);
			strBuff.append(rand);
			
		}
		System.out.println(strBuff);
		
		System.out.println(strBuff.length());
		
		

	}

}
