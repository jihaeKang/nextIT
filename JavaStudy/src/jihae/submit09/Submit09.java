package jihae.submit09;

import java.util.ArrayList;
import java.util.Scanner;

import ch09_class.school.Student;

public class Submit09 {

	public static void main(String[] args) {
//		제품명: 냉장고, 가격: 2000000
//		제품명: TV, 가격: 1000000
//		제품명: 에어컨, 가격: 800000
//		제품명: 컴퓨터, 가격: 1300000
//		제품명: 선풍기, 가격: 100000
		
		Product fridge = new Product("냉장고", 2000000);
		Product tv = new Product("TV", 1000000);
		Product aircon = new Product("에어컨", 800000);
		Product computer = new Product("컴퓨터", 1300000);
		Product fan = new Product("선풍기", 100000);
		
		ArrayList<Product> proList = new ArrayList<>();
		
		proList.add(fridge);
		proList.add(tv);
		proList.add(aircon);
		proList.add(computer);
		proList.add(fan);
		
		for(int k = 0; k < proList.size()-1; k++) {
			 for(int i = 0 ; i < proList.size()-1; i++) {
				 if(proList.get(i).getPrice() > proList.get(i+1).getPrice()) {
					 Product t = proList.get(i);
					 proList.set(i, proList.get(i+1));
					 proList.set(i+1, t);

				 } 
			 }  
		 } 
		
		for(int i=0; i<proList.size(); i++) {
			System.out.println(proList.get(i));
		}
		
		System.out.println("\n=================================\n");
		
		for(int i = 0; i < proList.size(); i++) {
			if(proList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		System.out.println("\n======================================\n");
		
		Cafe starBucks = new Cafe("스타벅스");
		starBucks.addCoffee(new Coffee("아메리카노", 5000));
		starBucks.addCoffee(new Coffee("카푸치노", 6000));
		starBucks.addCoffee(new Coffee("오곡라떼", 7000));
		
		Cafe conte = new Cafe("꽁떼");
		conte.addCoffee(new Coffee("아메리카노", 2500));
		conte.addCoffee(new Coffee("바닐라라떼", 3000));
		conte.addCoffee(new Coffee("아이스티", 3500));

		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 꽁떼 방문 | 3. 사무실 복귀..");
			System.out.print(">>> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select ==1) {
				// TODO 스타벅스 방문
				System.out.println("어서오세요. 스타벅스 입니다.");
				System.out.println("메뉴판");
				starBucks.showMenu();
				starBucks.buyCoffee(scan);
						
				
				
				
			}else if(select ==2) {
				// TODO 꽁테 방문
				System.out.println("어서오세요. 꽁떼 입니다.");
				System.out.println("메뉴판");
				conte.showMenu();
				conte.buyCoffee(scan);

				
				
				
			}else {
				// 사무실 복귀
				System.out.println("사무실로 복귀합니다..");
				break;
			}

		}

		
		

		
		
		
		
	}

}
