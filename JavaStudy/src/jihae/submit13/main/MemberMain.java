package jihae.submit13.main;

import java.util.ArrayList;
import java.util.Scanner;

import ch14_jdbc_jsp.vo.StudentVO;
import jihae.submit13.service.BoardService;
import jihae.submit13.service.MemberService;
import jihae.submit13.vo.BoardVO;
import jihae.submit13.vo.MemberVO;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MemberService memSev = MemberService.getInstance();
		BoardService bdSev = BoardService.getInstance();
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");
			int command = 0;
			try {
				command = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
			
			if(command == 1) {
				// TODO 회원가입 중복체크
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				
				MemberVO mem = new MemberVO();
				memSev.joinMember(id, pw);
				
			}else if(command == 2) {
				// 로그인
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				
				MemberVO mem = new MemberVO();
				mem.setMemId(id);
				mem.setMemPw(pw);
				
				MemberVO login = memSev.login(mem);
				
				if(login.getMemId() != null) {
					System.out.println(login.getMemId() + "님 환영합니다.");
					
					while(true) {
						ArrayList<BoardVO> bdList = bdSev.getBdList();
						for(int i = 0; i < bdList.size(); i++) {
							System.out.println(bdList.get(i).getBoardNo() + ". | " + bdList.get(i).getBoardtitle() + " | " + bdList.get(i).getBoardname() + " | " + bdList.get(i).getBoardDate());
						}
						System.out.println("행동을 선택해주세요.");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");
						int select = 0;
						try {
							select = Integer.parseInt(scan.nextLine());
						} catch (NumberFormatException e) {
							System.out.println("숫자만 입력해주세요.");
						}
						
						if(select == 1) {
							System.out.print("글제목을 입력해주세요: ");
							String title = scan.nextLine();
							System.out.print("글내용을 입력해주세요: ");
							String content = scan.nextLine();
							
//							BoardVO board = new BoardVO(title, content);
							bdSev.makeBoard(title, content, login.getMemId().toString());
							
						}else if(select == 2) {
							// 글조회
							System.out.print("글 번호를 입력해주세요: ");
							int no = Integer.parseInt(scan.nextLine());
							
							for(int i = 0; i < bdList.size(); i++) {
								if(no == bdList.get(i).getBoardNo()) {
									System.out.println("====================================");
									System.out.println("제목: " + bdList.get(i).getBoardtitle());
									System.out.println("작성자: " + bdList.get(i).getBoardname());
									System.out.println("작성일: " + bdList.get(i).getBoardDate());
									System.out.println("글내용: " + bdList.get(i).getBoardcontent());
									System.out.println("====================================");
									/*TODO*/
								}
								
							}
								
						}else if(select == 3) {
							// 로그아웃
							break;
						}else {
							System.out.println("다시 입력해주세요");
						}
					}
				
				}else {
					System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
				}
				
				
				
			}else if(command == 3) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
	}

}
