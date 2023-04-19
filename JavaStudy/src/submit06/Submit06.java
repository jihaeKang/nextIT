package submit06;

public class Submit06 {

	public static void main(String[] args) {
		
//		Q. 01
//
//		한국 배우들의 명단을 배열로 만들어보았습니다.
//		for문을 이용하여 "이"씨 성을 가진 사람이 몇명인지 출력해주세요.
		// Hint
//		for문으로 각각의 요소에 접근, 각 요소를 substring으로 맨 앞글자만 자른 뒤
//		자른 글자가 “이"와 같은지 비교하여 같다면 카운팅

//
//
		String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", 
		                     "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", 
		                     "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};
		int count = 0;
		for(int i = 0; i < nameList.length; i++) {
			if(nameList[i].substring(0,1).equals("이")) {
				count++;
			}
		}  System.out.println("이씨 성을 가진 배우가 총 " + count + "명 있습니다.");
		
		
		
		
//		Q. 02
//
//		최댓값, 최솟값 구하기
//		for문을 이용해 intArr의 최댓값과 최솟값을 출력해주세요.
//		Hint
//		for문 바깥에 int 변수 하나 선언해둔 뒤, for문을 돌리면서 각각의 요소가 int 변수보다 큰지 비교
//		크다면 int 변수에 해당 요소의 값 저장
		
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		int max = intArr[0];
		for(int i = 0 ; i < intArr.length; i++) {
			 if(intArr[i] > max) {
				max = intArr[i];
			 }
		 }
		
		int min = intArr[0];
		for(int i = 0 ; i < intArr.length; i++) {
			 if(intArr[i] < min) {
				min = intArr[i];
			 }
		 }
		
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
//		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
//		for(int k =0; k < intArr.length-1; k++) {
//			for(int i = 0 ; i < intArr.length-1; i++) {
//				 if(intArr[i] > intArr[i+1]) {
//					 int t = intArr[i];
//					 intArr[i] = intArr[i+1];
//					 intArr[i+1] = t;
//				 } 
//			 }
//		}
//		System.out.println("최댓값: " + intArr[7]);
//		System.out.println("최솟값: " + intArr[0]);
		// 다른방식 

		
		
		
		
		
//		Q. 03
//		로또 번호 생성기
//		1~45 까지의 랜덤 숫자 6개를 배열에 중복되지 않도록 담고, 이를 정렬한 배열을 리턴하는 makeLotto() 함수를 만들어주세요.
		
		int[] myLotto = makeLotto();
		for(int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		
		System.out.println("\n==============================\n");
		
		// 로또 시뮬레이션
//		int[] winLotto = {4, 24, 27, 35, 37, 45};
//		int buyCount = 0;
//		while(true) {
//			
//			buyCount++;
//			int cnt = 0;
//			for(int i = 0; i < winLotto.length; i++) {
//				if(winLotto[i] == lotto[i]) {
//					cnt++;
//				}
//			}
//			
//			if(cnt == 6) {
//				System.out.println("1등 당첨!!!!");
//				System.out.println("구매횟수: " + buyCount);
//				System.out.println("구매금약: " + (buyCount*1000));
//				break;
//			}else {
//				System.out.println(buyCount +"회차");
//			}
//		}

		

	}
	
	public static int[] makeLotto() {
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {		
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {	
				if(lotto[i] == lotto[j]) {
					i--;
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
	
	
	// int idx = 0;
	// outer: while(true){
	//    lotto[0] = lotto[i] = (int)(Math.random() * 45) + 1;
	//     랜덤수가 로또 배열 안에 없는 수라면 담기
	//     반복문안에서 매번 새로운 수를 생성해서 담아줘야됨
	//    for(int i =0; i < lotto.length; i++){
	//       if(lotto[i] == (int)(Math.random() * 45) + 1;){
	//            continue outer;
	//       }
	//    }
	//    lotto[idx] = (int)(Math.random() * 45) + 1;
	//    idx++;
	//    
	//    if(idx == 6){
	//        break;
	//    }
	//}  return lotto;
	
	
	
	

}
