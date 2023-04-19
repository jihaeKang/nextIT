package ch05_controll;

public class Practice05 {

	public static void main(String[] args) {
		
		// while문 또한 다중으로 사용가능
				// while문으로 구구단
				// 2x2 = 4
				//~~~9x9x=91
		
		int left = 2;
		while(left <= 9) {
			int right = 2;
			while(right <= 9) {
				System.out.println(left + " X " + right + " = " + (left * right));
				right++;
			} 
			left++;
		}

	}

}
