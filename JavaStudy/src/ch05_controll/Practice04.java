package ch05_controll;

public class Practice04 {

	public static void main(String[] args) {
		int sumOne = 0;
		for(int i = 1; i <= 10; i++) {
			sumOne += i;
		}
		System.out.println(sumOne);
		
		int sumnum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				sumnum += i;
			}
		}
		System.out.println(sumnum);
		
		for(int i = 1; i <=9; i++) {
			System.out.println("2 X " + i + " = " + (i*2));
		}
		
		// 증감식에 i++ 로 두고 위의 코드와 결과가 같도록 만들기
				for(int i = 0; i <= 20; i++) {
					if(i%2 == 0) {
						System.out.println(i/10.0);
					}
				}
				
		String star = "^";
		for(int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "^";
		}
		
		int suumm = 0;
		int rst = 0;
		for(int i = 1; i <= 10; i++) {
			suumm += i;
			rst += suumm;
			System.out.println("결과 : " + suumm);
			System.out.println("진짜결과 : " + rst);
			
		}
		
		System.out.println(rst);
		
		// 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오 
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 6; j >=1; j--) {
				if(i + j == 6) {
					System.out.println(i + " + " + j + " = " + (i+j));
				}
			}
		}

//		for(int i = 0; i < cast.length(); i++) {
//		String str = cast.substring(i, i+1);
//		int no = Integer.parseInt(str);
//		result += no;
//		}

		int example = 47845932;
		String cast = example + "";
		int rrsstt = 0;
		
		for(int i = 0; i < cast.length(); i++) {
			rrsstt += Integer.parseInt(cast.substring(i, i+1));
		}
		System.out.println(rrsstt);
		
		// 슈의 갯수는?
		String syu = "슈슈규슈슈슈ㅠ슈슈슈슈사ㅠㅓㅅ규슈슉";
		int count = 0;
		for(int i = 0; i < syu.length(); i++) {
			if(syu.substring(i, i+1).equals("규")) {
				count++;
			}
		}
		System.out.println(count);
		
		// 라면 공장에서 면을 30cm 뽑고 있는데
		// 6cm마다 잘라주어야 한다
		
		for(int i = 0; i < 30; i++) {
			if(i%2 == 0) {
				System.out.println("////////");
			}else if(i%2 == 1) {
				System.out.println("\\\\\\\\\\\\\\\\");
			}
			if( i % 6 == 5){
				System.out.println("--------");
			}
		}	
		
//			for(int i = 0; i < 30; i++) {
//				if(i % 2 == 0) {
//					System.out.println("////////");
//				}else if(i%2==1) {
//					System.out.println("\\\\\\\\\\\\\\\\");             
//				}
//				if(i % 6 == 5) {
//					System.out.println("--------");
//				}
//				
//			}
		
		
		int random = (int)((Math.random() * 11)+10);
		System.out.println(random);
		
		

	}

}
