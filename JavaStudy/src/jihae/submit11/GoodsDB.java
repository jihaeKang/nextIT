package jihae.submit11;

import java.util.ArrayList;

public class GoodsDB {
	ArrayList<Goods> goodsList = new ArrayList<>();
	
	private GoodsDB() {
		goodsList.add(new Goods(1,"존윅", 1, "존윅연필", 5000));
		goodsList.add(new Goods(1,"존윅", 2, "존윅 피규어", 58000));
		goodsList.add(new Goods(1,"존윅", 3, "콘티넨탈 호텔 뱃지", 18000));
		goodsList.add(new Goods(6,"해리포터", 4, "딱총나무 지팡이", 55000));
		goodsList.add(new Goods(6,"해리포터", 5, "기숙사 분류 모자 컵 세트", 25000));
		goodsList.add(new Goods(6,"해리포터", 6, "기숙사별 마그넷", 10000));
		goodsList.add(new Goods(6,"해리포터", 7, "여권케이스", 20000));
		goodsList.add(new Goods(8,"토이스토리", 8, "포키 토킹피규어", 52000));
		goodsList.add(new Goods(8,"토이스토리", 9, "우디 차량용 피규어", 40000));
		goodsList.add(new Goods(8,"토이스토리", 10, "알린 티셔츠", 10000));
		goodsList.add(new Goods(8,"토이스토리", 11, "토이스토리 퍼즐", 12000));
		goodsList.add(new Goods(2,"스파이더맨", 12, "스파이더맨 피규어", 80000));
		goodsList.add(new Goods(2,"스파이더맨", 13, "스파이더맨 휴대폰 케이스", 20000));
		goodsList.add(new Goods(2,"스파이더맨", 14, "드로니 키링", 15000));
		goodsList.add(new Goods(9,"몬스터 주식회사", 15, "엽서세트", 10000));
		goodsList.add(new Goods(9,"몬스터 주식회사", 16, "마이크&설리 오너먼트", 20000));
		goodsList.add(new Goods(9,"몬스터 주식회사", 17, "부 에어팟 케이스", 17000));
		goodsList.add(new Goods(4,"토르", 18, "묠니르", 35000));
		goodsList.add(new Goods(4,"토르", 19, "스톰 브레이커", 35000));
		goodsList.add(new Goods(3,"닥터 스트레인지", 20, "망토", 25000));
		goodsList.add(new Goods(3,"닥터 스트레인지", 21, "아가모토의 눈", 28000));
		goodsList.add(new Goods(7,"신비한 동물사전", 22, "니플러 인형", 20000));
		goodsList.add(new Goods(7,"신비한 동물사전", 23, "피켓 넥타이 핀", 15000));
		goodsList.add(new Goods(7,"신비한 동물사전", 24, "뉴트 스캐먼더 여행가방", 50000));
		goodsList.add(new Goods(10,"겨울왕국", 25, "올라프 인형", 7000));
		goodsList.add(new Goods(10,"겨울왕국", 26, "엘사 원피스", 60000));
		goodsList.add(new Goods(5,"반지의 제왕", 27, "절대반지", 20000));
		goodsList.add(new Goods(5,"반지의 제왕", 28, "리븐델 레고", 500000));
		
		
	}
	
	private static GoodsDB instance = new GoodsDB();
	
	public static GoodsDB getInstance() {
		return instance;
	}
	
	public void showGoodsList(int no) {
		for(int i = 0; i < goodsList.size(); i++) {
			if(goodsList.get(i).getTitleNo()==no)
			System.out.println(goodsList.get(i).getGoodsNo() + ". " + goodsList.get(i).getGoods() + ", " + "가격: " + goodsList.get(i).getPrice());
		}
	}
	
	public void goodsBuy(int no) {
		for(int i = 0; i < goodsList.size(); i++) {
			if(goodsList.get(i).getGoodsNo()==no) {
				System.out.println(goodsList.get(i).getGoods() + "을(를) " + goodsList.get(i).getPrice() + "원에 구매하셨습니다.");
				
			}
		}
	}
	

}
