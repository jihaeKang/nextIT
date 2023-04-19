package jihae.submit10;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	private ArrayList<Book> bookList = new ArrayList<>();

	private Library() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		
		String[] books = strBooks.split(",");
		
		for(int i=0; i < books.length; i++) {
			books[i] = books[i].trim();
		}
		
		for(int i=0; i < books.length; i++) {
			bookList.add(new Book(bookList.size()+1, books[i], false));
		}
		
	}
	
	
	private static Library instance = new Library();
	
	public static Library getInstance() {
		return instance;
	}
	
	
	public void showBookList() {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	public void bookRent(int no) {
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getNo()==no) {
				bookList.get(i).setLent(true);
				System.out.println(bookList.get(i).getName() + "을(를) 대여하셨습니다.");
				
			}
		}
	}
	
	public void bookPut(int no) {
		for(int i =0; i < bookList.size(); i++) {
			if(bookList.get(i).getNo()==no) {
				bookList.get(i).setLent(false);
				System.out.println(bookList.get(i).getName() + "이(가) 입고되었습니다.");
			}
		}
	}
	
	public void searchBook(String name) {
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getName().contains(name)) {
				System.out.println(bookList.get(i));
			}
		}
	}
//	Scanner scan = new Scanner(System.in);
//	public void bookSerchRent(String name) {
//		for(int i=0; i<bookList.size(); i++) {
//			if(bookList.get(i).getName().contains(name)) {
//				System.out.println(bookList.get(i));
//				if(bookList.size() == 1) {
//					System.out.println(bookList.get(i).getName() + "을(를) 대여하셨습니다.");
//					bookList.get(i).setLent(true);
//				}else {
//					System.out.print("도서 번호를 입력해주세요: ");
//					int num = Integer.parseInt(scan.nextLine());
//					System.out.println(bookList.get(i).getName() + "을(를) 대여하셨습니다.");
//					bookList.get(i).setLent(true);
//					
//					
//				}
//			}
//		}
//	}
	
	// 책 검색+검색된 책 목록 리턴
	public ArrayList<Book> searchBookList(String keyword){
		ArrayList<Book> rst = new ArrayList<>();
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getName().contains(keyword)) {
				rst.add(bookList.get(i));
			}
		}
		return rst;
	}

}
