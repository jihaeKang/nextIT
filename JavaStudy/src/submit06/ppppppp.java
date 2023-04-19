package submit06;

public class ppppppp {

	public static void main(String[] args) {
		
		int[] myLotto = makeLotto(6);
		/*for(int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}*/

		

	}
	
	
	
 	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			// i가 마지막일때에는 뒤에 콤마(,) 를 붙이지 않고,
			// 개행문자도 넣는다.
			if(i == intArray.length-1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");
			}
		     // else 안쓰고 그냥 break 걸어도 가능 
			
		}
	}
	 
	
	public static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i++) {
			// i가 마지막일때에는 뒤에 콤마(,) 를 붙이지 않고,
			// 개행문자도 넣는다.
			if(i == strArray.length-1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");
			}
		     // else 안쓰고 그냥 break 걸어도 가능 
			
		}
	}
	
	public static int[] makeLotto(int num) {
		int[] lotto = new int[num];
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println("top_i" + i);
			lotto[i] = (int)(Math.random() * 45) + 1;
			System.out.println("i : "+ i +",val :" + lotto[i] );
			
			for(int j = 0; j < i; j++) {	
				System.out.println(" j : " +j +", val :"+ lotto[j] );
				if(lotto[i] == lotto[j]) {
					i--;
					System.out.println("break_ i: " + i);
					break;
					
				}
			}
		} 
		for(int i = 0; i < lotto.length; i++) {
			for(int k = i + 1; k < lotto.length; k++) {
				if(lotto[i] > lotto[k]) {
					int temp = lotto[i];
					lotto[i] = lotto[k];
					lotto[k] = temp;
				} 
			} 
		} 
		return lotto;
	} 
	
	
	

}
