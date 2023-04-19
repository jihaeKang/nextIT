package jihae.submit10;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrayMain {

	public static void main(String[] args) {
		
		Library library = Library.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.print(">>> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 3) {
				library.showBookList();
			}else if(select == 2) {
				System.out.println("책 이름을 입력해주세요");
				System.out.print(">>> ");
				String bookNm = scan.nextLine();
				// name을 포함하는 book 객체들을 찾아서 가져오기
				ArrayList<Book> bookList = library.searchBookList(bookNm);
				if(bookList.size() ==0) {
					System.out.println("해당 책이 존재하지 않습니다.");
				}else if(bookList.size() ==1) {
					library.bookRent(bookList.get(0).getNo());
				}else {
					library.searchBook(bookNm);
					System.out.println("책 번호를 입력해주세요");
					System.out.print(">>> ");
					int bookno = Integer.parseInt(scan.nextLine());
					library.bookRent(bookno);
				}
				
			}else if(select==1) {
				System.out.println("책 번호를 입력해주세요");
				System.out.print(">>> ");
				int bookno = Integer.parseInt(scan.nextLine());
				library.bookPut(bookno);
			}else if(select == 4) {
				System.out.println("책 이름을 입력해주세요");
				System.out.print(">>> ");
				String bookNm = scan.nextLine();
				library.searchBook(bookNm);
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
		
		
		
	
		
		

	}

}
