package ch05_controll;

public class Practice03 {

	public static void main(String[] args) {
		String passward = "158414545458";
		String warning = "";
		
		if(passward.length() <=8) {
			warning = "비밀번호를 8자 이상 입력하세요.";
		}else {
			warning = "입력이 완료되었습니다.";
		}
		System.out.println(warning);
		
		warning = (passward.length() <=8)?("비밀번호를 8자 이상 입력하세요."):("입력이 완료되었습니다.");
		System.out.println(warning);
		
		boolean tv = true;
		
		if(tv == true) {
			System.out.println("티비를 끕니다.");
		tv = false;
		}else if(tv == false) {
			System.out.println("티비를 켭니다.");
			tv=true;
		}
		
		int myBirthDay = 217;
		if(myBirthDay >=201) {
			System.out.println("생일은 2월");
		}else if(myBirthDay >=101) {
			System.out.println("생일은 1월");
		}else {
			System.out.println("생일은 3월 이후");
		}
		
		
		
				

	}

}
