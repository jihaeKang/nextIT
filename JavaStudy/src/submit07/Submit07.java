package submit07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Submit07 {

	public static void main(String[] args) {
//		1. 정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20 사이의 랜덤 숫자를 10개 담으시오. (10도 나오고 20도 나올 수 있어야 함)
//		10번 반복하는 for문에서 매번 10부터 20 사이의 랜덤 숫자를 얻어서(randInt) 해당 
//		ArrayList 객체에 add     
		ArrayList<Integer> random = new ArrayList<>();
		
		for(int i =0; i < 10; i++) {
			int ranInt = (int)((Math.random() * 11)+10);
			random.add(ranInt);
		} System.out.println(random);

		
	
		
//		2. 해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오.
		// 새로운 빈 리스트 만드시고, 거기에 중복되지 않게끔 값들을 옮기세요.
		ArrayList<Integer> noOver = new ArrayList<>();
		for(int i =0; i < random.size(); i++) {
			// noOver 안에 현재의 random.get(i)가 존재하지 않는 경우에만 추가해주기
				if(!noOver.contains(random.get(i))) {
					noOver.add(random.get(i));
			}
		}
		 System.out.println(noOver);
		 
		 // 중복 제거 두번째 방법
		 for(int i = 0; i < random.size(); i++) {
			 
			 for(int k = random.size()-1; k >  i; k--) {
				 if(random.get(i) == random.get(k)) {
					 random.remove(k);
				 }
			 }
		 } System.out.println(random);
			
		
		
		
//		3. 중복을 제거한 정수형 리스트를 오름차순으로 정렬하여 출력하시오.
		Collections.sort(noOver);
		System.out.println(noOver);
		
		
//		4. 중복을 제거한 정수형 리스트를 내림차순으로 정렬하여 출력하시오.
		Collections.sort(noOver, Collections.reverseOrder());
		System.out.println(noOver);
		
		
//		@. 숫자 a부터 b 사이의 랜덤 정수를 리턴해주는 메소드를 만들어보세요
		int rand = makeRandom(10, 20);
		System.out.println(rand);

		
//		Q. 02
//		아내가 사고 싶은 물건  ["냉장고", "로봇청소기", "세탁기", "에어컨"] 을 리스트에 담아주세요.	
//		남편이 사고 싶은 물건 ["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"] 을 다른 리스트에 담아주세요.
//				
//
//		1. 서로 사고 싶은 물건 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(교집합)
//		Hint
//		빈 리스트를 하나 만들고, 아내의 구매목록 리스트를 for문을 이용하여 순회하고, 
//		각 구매 물품이 남편의 구매목록 리스트에 존재하는지 체크한다.
//		만약 존재한다면 빈 리스트에 해당 물품을 저장한다.
		ArrayList<String> wife = new ArrayList<String>(Arrays.asList("냉장고", "로봇청소기", "세탁기", "에어컨"));
		ArrayList<String> husband = new ArrayList<String>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"));
		ArrayList<String> wish = new ArrayList<>();
		for(int i=0; i<wife.size();i++) {
			if(husband.contains(wife.get(i))) {
				wish.add(wife.get(i));
			}
		} System.out.println(wish);
		
		// 교집합을 위한 .retainAll()
		wish.clear();
		wish.addAll(wife);   // 아내의 구매목록 전부를 담기
		wish.retainAll(husband);
		System.out.println(wish);
		
		
		

//		2. 사고 싶은걸 다 산다고 했을때의 구매 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(합집합)
//		Hint
//		빈 리스트를 하나 만들고, 아내의 구매목록을 전부 담는다.
//		이후 남편의 구매목록 리스트를 for문을 이용하여 순회하고, 
//		남편의 구매 물품이 빈 리스트에 존재하지 않는다면 빈 리스트에 해당 물품을 추가한다.
		ArrayList<String> buyAll = new ArrayList<>();
		buyAll.addAll(wife);
		for(int i =0; i < husband.size(); i++) {
			if(!buyAll.contains(husband.get(i))) {
				buyAll.add(husband.get(i));
			}
		}System.out.println(buyAll);
		
		
		

	}
	
	public static int makeRandom(int A, int B) {

		 return (int)(Math.random() * (B-A+1)) + A;
	} 

}
