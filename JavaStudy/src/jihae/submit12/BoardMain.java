package jihae.submit12;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		BoardDB boardDB = BoardDB.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");
			int choice = Integer.parseInt(scan.nextLine());
			
			if(choice == 1) {
				boardDB.showBoardList();
			}else if(choice == 2) {
				System.out.print("글 제목을 입력해주세요: ");
				String title = scan.nextLine();
//				boardDB.makeContents(title);
				System.out.print("글 내용을 입력해주세요: ");
				String content = scan.nextLine();
//				boardDB.makeContents(content);
			}
		}
		

	}

}
