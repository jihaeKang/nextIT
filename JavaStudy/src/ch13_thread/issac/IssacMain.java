package ch13_thread.issac;

public class IssacMain {

	public static void main(String[] args) {
		Chef mingi = new Chef();
		
		// mingi의 일이 언제 끝날지는 모르지만 끝나고 ~해라는 할 수 있다. => 콜백함수(인터페이스 사용)
		
		mingi.endCook = new EndCook() {

			@Override
			public void finish() {
				System.out.println("민기: 장사끝~ 퇴근합니다~");
			}
		};
		
		
		
		
		customer sungbok = new customer(4, "성복");
		customer jayoung = new customer(7, "자영");
		customer changyeon = new customer(1, "창연");
		
		mingi.start();
		sungbok.start();
		jayoung.start();
		changyeon.start();
		
		
				
		
		
		
		

	}

}
