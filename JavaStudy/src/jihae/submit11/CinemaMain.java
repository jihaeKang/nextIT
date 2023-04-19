package jihae.submit11;

import java.util.Scanner;

import ch09_class.homepage.Board;

public class CinemaMain {

	public static void main(String[] args) {
		CinemaDB cinemaDB = CinemaDB.getInstance();
		ReputationDB reputationDB = ReputationDB.getInstance();
		SnackDB snackDB = SnackDB.getInstance();
		GoodsDB goodsDB = GoodsDB.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n" + 
				" _____  _____  _   _  _____ ______  _      _____ __   __\n" + 
				"/  __ \\|_   _|| \\ | ||  ___|| ___ \\| |    |  ___|\\ \\ / /\n" + 
				"| /  \\/  | |  |  \\| || |__  | |_/ /| |    | |__   \\ V / \n" + 
				"| |      | |  | . ` ||  __| |  __/ | |    |  __|  /   \\ \n" + 
				"| \\__/\\ _| |_ | |\\  || |___ | |    | |____| |___ / /^\\ \\\n" + 
				" \\____/ \\___/ \\_| \\_/\\____/ \\_|    \\_____/\\____/ \\/   \\/\n" + 
				"                                                        \n" + 
				"                                                        \n" + 
				"");
		
		while(true) {
			System.out.println("1. 영화예매 | 2. 스낵구매 | 3. 굿즈구매 | 4. 영화평점 조회 | 5. 영화 대신 골라드려요! | 6. 평점등록 | 7. 종료");
			System.out.print(">>> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				cinemaDB.showMovieList();
				System.out.println("영화번호를 선택해주세요");
				System.out.print(">>> ");
				int movieNo = Integer.parseInt(scan.nextLine());
				cinemaDB.movieRsv(movieNo);
				cinemaDB.poster(movieNo);
				
			}else if(select == 2) {
				snackDB.choice();
				System.out.println("스낵 번호를 선택해주세요");
				System.out.print(">>> ");
				int snackNo = Integer.parseInt(scan.nextLine());
				snackDB.snackBuy(snackNo);
			}else if(select == 3) {
				cinemaDB.showMovieList();
				System.out.println("굿즈를 구매하실 영화번호 입력해주세요");
				System.out.print(">>> ");
				int movieNo = Integer.parseInt(scan.nextLine());
				goodsDB.showGoodsList(movieNo);
				System.out.println("상품 번호를 선택해주세요");
				System.out.print(">>> ");
				int goodsNo = Integer.parseInt(scan.nextLine());
				goodsDB.goodsBuy(goodsNo);
			}else if(select == 4) {
				cinemaDB.showTitleList();
				System.out.println("평점을 조회하실 영화이름을 입력해주세요");
				System.out.print(">>> ");
				String movieNm = scan.nextLine();
				// TODO 평점 출력
				reputationDB.showRepList(movieNm);
				
			}else if(select == 5) {
				System.out.println("어떤 영화 장르를 선호하시나요?");
				System.out.println("1. 액션 | 2. 판타지 | 3. 애니메이션");
				System.out.print(">>> ");
				int genre = Integer.parseInt(scan.nextLine());
				// 랜덤 영화 골라주기 메소드
				if(genre==1) {
					cinemaDB.randomAction();
				}else if(genre==2) {
					cinemaDB.randomFan();
				}else if(genre==3) {
					cinemaDB.randomAni();
				}
//				cinemaDB.random();
			}else if(select == 6) {
				// TODO 게시판 참고
				System.out.println("관람자의 형태를 입력해주세요(실관람객 / 평론가)");
				System.out.print(">>> ");
				String audience = scan.nextLine();
				
				System.out.println("영화제목을 입력해주세요");
				System.out.print(">>> ");
				String title = scan.nextLine();
				
				System.out.println("평점을 입력해주세요(1~10)");
				System.out.print(">>> ");
				int rep = Integer.parseInt(scan.nextLine());
				
				System.out.println("관람평을 자유롭게 입력해주세요.");
				System.out.print(">>> ");
				String content = scan.nextLine();
				
				Reputation reputationRes = new Reputation(audience, title, rep, content);
				reputationDB.addRep(reputationRes);
				
			}else {
				System.out.println("시스템을 종료합니다! 이용해주셔서 감사합니다!");
				break;
				}
			
		}
		
		
		
		
		
		

	}

}
