package ch04_operator;

public class Practice0322 {

	public static void main(String[] args) {
		int number = 120;
		number++;
		
		System.out.println(number);
		
		number += 24;
		
		System.out.println(number);
		
		int numC = 10;
		int numD = 3;
		
		System.out.println("곱하기: "+(numC*numD));
		System.out.println("나머지: "+(numC/numD));
		
		int price = 36817;
		int tag = 175;
		
		// Math.ceil() 활용해서 자동올림 해보자
		
		int vaa =(int)Math.ceil((double)price/tag);
		System.out.println(vaa);
		
		double hehe = (double)price / tag;
		
		System.out.println(hehe);
		
		// 문자열도 +=로 더할 수 있지만 뒤에만 가능  아래 방식 활용
		String daejeon = "가수원";
		String junggu = "오류동";
		
		daejeon += ", 관저동";
		
		daejeon = daejeon + ", 오류동";
		
		System.out.println(daejeon);
		
		daejeon = "대흥동, " + daejeon + ", 봉명동";
		System.out.println(daejeon);
		
		// 문자열 앞글자만 꺼내서 비교하기
		String jh = "강지혜";
		String jw = "강주원";
		System.out.println(jh.charAt(0) == jw.charAt(0));
		System.out.println(jh.charAt(1) == jw.charAt(1));
		
		// 문자열 같은지 비교하는거 .equals(문자열)
		String name = "지혜";
		String book = "지해";
		System.out.println(name.equals(book));
		
		//empty 값 확인
		
		String papa = "";
		System.out.println(papa != "");
		System.out.println(papa == "");
		
		int salary = 1000000;
		
		String baba = (salary > 10000) ? ("평균") : ("미달");
		System.out.println(baba);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
