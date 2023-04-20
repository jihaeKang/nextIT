package kjh.util;

public class KJHUtil {
	// ch06_method/MethodMain에서 했던 weRound
	public static double weRound(double num, int n) {
		// 10의 n제곱 구하기
		int ten = 1;
		for(int i = 0; i < n; i++) {   //n회 반복하는 for문
			ten *= 10;
		}
		
		num *= ten;
		long temp = Math.round(num);
		
		double result = (double)temp / ten;
		return result;
	}

}
