package jihae.submit14.main;

import java.util.ArrayList;
import java.util.Scanner;

import jihae.submit14.service.ProductService;
import jihae.submit14.service.ReviewService;
import jihae.submit14.service.ShopMemberService;
import jihae.submit14.vo.ProductVO;
import jihae.submit14.vo.ReviewVO;
import jihae.submit14.vo.ShopMemberVO;

public class ShoppingMallMain {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		ShopMemberService spSev = ShopMemberService.getInstance();
		ProductService pdSev = ProductService.getInstance();
		ReviewService rvSv = ReviewService.getInstance();
		
		
		
		System.out.println("\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠔⠒⠒⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠧⣀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡠⠤⠤⠖⠒⠒⣲⣤⠤⢄⡠⠂⣠⠖⠒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡠⠞⠋⠀⠀⠀⠀⠀⠀⣠⠛⠀⠀⠑⡄⠙⠯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⢀⡤⠔⠒⠒⠒⣉⣱⠞⢁⣀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⢰⣦⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⢠⠋⠀⠀⢀⠤⠚⠁⡜⡰⠋⠀⠀⠈⠢⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⢇⠀⠀⣠⠋⠀⠀⢸⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠉⠋⠁⠀⠀⠀⢚⠀⠁⠀⠰⡿⠀⠀⠀⠀⠀⣀⣀⣠⣴⣿⠇⠀⠀⠀⢀⣠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠟⠙⠁⠀⣀⣠⡤⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢤⣀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣴⣿⠾⠋⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠛⠒⠒⡟⠁⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠤⣄⠀⠀⣀⠤⠃⠀⠀⠀⠀⠀⠀⠀⠀⠣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠊⠁⢠⠋⠀⡴⠋⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢏⠀⠀⠈⠲⡞⠀⠀⠀⠀⢸⠀⠀⢠⠀⢰⠀⠀⡇⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠒⠒⠒⠙⢤⣀⣠⣤⠼⡀⠀⡾⠤⠼⠀⢀⠧⠤⠤⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"");
		System.out.println("\n" + 
				" _   _   ___  ______  _____  _____ ______  _____  _____ \n" + 
				"| | | | / _ \\ | ___ \\|  _  ||  _  || ___ \\|  ___||_   _|\n" + 
				"| |_| |/ /_\\ \\| |_/ /| | | || | | || |_/ /| |__    | |  \n" + 
				"|  _  ||  _  ||    / | | | || | | ||  __/ |  __|   | |  \n" + 
				"| | | || | | || |\\ \\ \\ \\_/ /\\ \\_/ /| |    | |___   | |  \n" + 
				"\\_| |_/\\_| |_/\\_| \\_| \\___/  \\___/ \\_|    \\____/   \\_/  \n" + 
				"");
		
		
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
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				System.out.println("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				
				spSev.join(id, pw);
				
				
			}else if(command == 2) {
				System.out.print("아이디를 입력해주세요: ");
				String id = scan.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = scan.nextLine();
				
				ShopMemberVO mem = new ShopMemberVO();
				mem.setMemId(id);
				mem.setMemPw(pw);
				
				ShopMemberVO login = spSev.login(mem);
				if(login.getMemId() != null) {
					System.out.println(login.getMemId() + "님 환영합니다. 즐거운 쇼핑 되세요!");
					
					while(true) {
						System.out.println("행동을 선택해주세요.");
						System.out.println("1. 상품구매 | 2. 리뷰 | 3. 마이페이지 | 4. 로그아웃");
						System.out.print(">>> ");
						int cho = 0;
						try {
							cho = Integer.parseInt(scan.nextLine());
						} catch (NumberFormatException e) {
							System.out.println("숫자만 입력해주세요.");
						} 
						
						if(cho == 1) {
							ArrayList<ProductVO> pdList = pdSev.proList();
							for(int i = 0; i < pdList.size(); i++) {
								System.out.println(pdList.get(i).getProCode() + ". " + pdList.get(i).getProName() + ": " 
								+ pdList.get(i).getProPrice() + "원");
							}
							System.out.print("조회할 상품의 번호를 입력해주세요: ");
							int buy = Integer.parseInt(scan.nextLine());
							int point = 0;
							int price = 0;
							
							for(int i = 0; i < pdList.size(); i++) {
								if(buy==pdList.get(i).getProCode()) {
									System.out.println("===================================================================================================");
									System.out.println("<<" + pdList.get(i).getProName() + ">>");
									System.out.println("\"" + pdList.get(i).getProContent() + "\"");
									System.out.println("===================================================================================================");
									System.out.print("해당 상품을 구매하시겠습니까?(y/n): ");
									String answer = scan.nextLine();
									if(answer.equals("y") || answer.equals("Y")) {
										ArrayList<ShopMemberVO> memList = spSev.myPage();
										for(int j = 0; j < memList.size(); j++) {
											if(login.getMemId().equals(memList.get(j).getMemId())) {
												System.out.print(memList.get(j).getMemId() + "님의 보유포인트: " + memList.get(j).getMemPoint() + "원을 사용하시겠습니까?(y/n): ");
												String usePoint = scan.nextLine();
												if(usePoint.equals("y") || usePoint.equals("Y")) {
													System.out.print("사용하실 적립금을 입력해주세요: ");
													int use = Integer.parseInt(scan.nextLine());
													if(memList.get(j).getMemPoint() >= use) {
														price = (pdList.get(i).getProPrice() - use);
														point = (memList.get(j).getMemPoint() - use);
														spSev.usePoint(point, login.getMemId());
														point = (int)(price * 0.05);
														spSev.addPoint(point, login.getMemId());
														System.out.println(pdList.get(i).getProName() + "(이)가 " + price + "원에 구매되었습니다.");
														System.out.println("적립금 " + point + "원이 적립되었습니다.");
													}else {
														System.out.println("사용하실 적립금을 다시 입력해주세요.");
													}
													
													
													
												}else if(usePoint.equals("n") || usePoint.equals("N")) {
													point += (pdList.get(i).getProPrice()*0.05);
													spSev.addPoint(point, login.getMemId());
													System.out.println(pdList.get(i).getProName() + "(이)가 " + pdList.get(i).getProPrice() + "원에 구매되었습니다.");
													System.out.println("적립금 " + point + "원이 적립되었습니다.");
												}else {
													System.out.println("y 또는 n을 입력해주세요.");
												}
												
											}
										}
										
									}else if(answer.equals("n") || answer.equals("N")) {
										System.out.println("상품구매가 취소되었습니다.");
										break;
									}else {
										System.out.println("y 또는 n을 입력해주세요.");
									}
								}
							}
							
							
						}else if(cho == 2) {
							System.out.println("1. 리뷰조회 | 2. 리뷰작성 | 3. 리뷰삭제");
							System.out.print(">>> ");
							int choice = 0;
							try {
								choice = Integer.parseInt(scan.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("숫자만 입력해주세요.");
							}
							
							if(choice == 1) {
								ArrayList<ProductVO> pdList = pdSev.proList();
								for(int i = 0; i < pdList.size(); i++) {
									System.out.println(pdList.get(i).getProCode() + ". " + pdList.get(i).getProName());
								}
								System.out.print("리뷰를 조회할 상품의 번호를 입력해주세요: ");
								int rev=0;
								try {
									rev = Integer.parseInt(scan.nextLine());
								} catch (NumberFormatException e) {
									System.out.println("숫자만 입력해주세요.");
								}
								ArrayList<ReviewVO> rvList = rvSv.rvList();
								
								boolean checkRvList = false;
								for(int i = 0; i < rvList.size(); i++) {
									if(rvList.get(i).getRvCode()==rev) {
										System.out.println("============================================================================");
										System.out.println("상품명: " + rvList.get(i).getRvName());
										System.out.println("작성자: " + rvList.get(i).getRvId());
										System.out.println("내용: " + rvList.get(i).getRvContent());
										System.out.println("평점: " + rvList.get(i).getRvRate());
										System.out.println("============================================================================");
										checkRvList = true;
										
									}
								}
								if(!checkRvList) {
									System.out.println("리뷰가 등록되지 않은 상품입니다.");
								}
								
							}else if(choice == 2) {
								
								ArrayList<ProductVO> pdList = pdSev.proList();
								for(int i = 0; i < pdList.size(); i++) {
									System.out.println(pdList.get(i).getProCode() + ". " + pdList.get(i).getProName());
								}
								System.out.print("리뷰를 작성할 상품의 번호를 입력해주세요: ");
								int rvNum = Integer.parseInt(scan.nextLine());
								String rvName = "";
								for(int i = 0; i < pdList.size(); i++) {
									if(pdList.get(i).getProCode() == rvNum) {
										rvName = pdList.get(i).getProName();
									}
								}
								System.out.print("상품의 평점을 입력해주세요(1~10점): ");
								int rate = Integer.parseInt(scan.nextLine());
								System.out.print("상품평을 입력해주세요: ");
								String content = scan.nextLine();
								rvSv.makeReview(login.getMemId(), rvNum, rvName, rate, content);
								ArrayList<ShopMemberVO> memList = spSev.myPage();
//								for(int i = 0; i < memList.size(); i++) {
//									if(login.getMemId().equals(memList.get(i).getMemId()))
//									System.out.println(memList.get(i).getMemId() + ". " + memList.get(i).getMemPoint());
//									
//								}
								
								
							}else if(cho==3) {
								ArrayList<ReviewVO> rvList = rvSv.rvList();
								
								for(int i = 0; i < rvList.size(); i++) {
									if(rvList.get(i).getRvId() == login.getMemId()) {
										System.out.println("============================================================================");
										System.out.println("리뷰번호: " + rvList.get(i).getRvNo());
										System.out.println("상품명: " + rvList.get(i).getRvName());
										System.out.println("작성자: " + rvList.get(i).getRvId());
										System.out.println("내용: " + rvList.get(i).getRvContent());
										System.out.println("평점: " + rvList.get(i).getRvRate());
										System.out.println("============================================================================");										
									}
								}	
								System.out.println("삭제할 리뷰의 번호를 입력해주세요.");
								int del = Integer.parseInt(scan.nextLine());
								for(int i = 0; i < rvList.size(); i++) {
									if(rvList.get(i).getRvNo() == del) {
										rvSv.deleteReview(rvList.get(i).getRvNo(), rvList.get(i).getRvId(), rvList.get(i).getRvCode(), rvList.get(i).getRvName(), rvList.get(i).getRvRate(), rvList.get(i).getRvContent());
									}
								}
							}
						}else if(cho == 3) {
							ArrayList<ShopMemberVO> memList = spSev.myPage();
							for(int i = 0; i < memList.size(); i++) {
								if(login.getMemId().equals(memList.get(i).getMemId())) {
									System.out.println("---------------------------------------------------------------------------");
									System.out.println("<아이디: " + memList.get(i).getMemId() + ">");
									System.out.println("<비밀번호: " + memList.get(i).getMemPw() + ">");
									System.out.println("<" + memList.get(i).getMemId() + "님의 보유포인트: " + memList.get(i).getMemPoint() + "원>");
									System.out.println("---------------------------------------------------------------------------");
								}
							}
	
						}else if(cho == 4) {
							System.out.println("로그아웃 되었습니다. 다음에 또 방문해주세요!");
							break;
						}else {
							System.out.println("다시 입력해주세요.");
						}
					}
				}else {
					System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
				}
			}else if(command == 3){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}
