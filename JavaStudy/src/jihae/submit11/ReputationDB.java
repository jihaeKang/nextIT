package jihae.submit11;

import java.util.ArrayList;

import ch09_class.homepage.Board;

public class ReputationDB {
	ArrayList<Reputation> repList = new ArrayList<>();
	
	private ReputationDB() {
		repList.add(new Reputation("실관람객", "존윅", 9, "존윅은 설명할 시간에 한명 더 죽여"));
		repList.add(new Reputation("실관람객","존윅", 8, "3에 비해 많이 나아지긴 했는데 너무 길다 ㅠㅠ"));
		repList.add(new Reputation("실관람객","존윅", 10, "마지막 결투장면은 품위까지 있어보였다. 키아누와 견자단 액션. 역시 기다린 보람이 있음"));
		repList.add(new Reputation("실관람객","존윅", 8, "장르 영화로서의 쾌감을 극한으로 탁월하게 내달리는 시리즈 역대 최고의 퍼포먼스."));
		repList.add(new Reputation("실관람객","존윅", 7, "토요일에 미리 보고 왔는데.. 3편보다는 확실히 나아졌음.근데 길고 지친다.."));
		repList.add(new Reputation("평론가","존윅", 8, "초심을 지키며 성실히 진화한 프랜차이즈의 모범사례"));
		repList.add(new Reputation("평론가","존윅", 8, "벚꽃이 휘날리면, 새벽 해가 뜨면, 누가 친구인지 알 것이다"));
		repList.add(new Reputation("평론가","존윅", 7, "다정한 남편이자 듬직한 견주인 킬러 시리즈의 종합판이자 업그레이드판"));
		repList.add(new Reputation("평론가","존윅", 6, "지치도록 혼을 빼는 퀵스텝 블루스"));
		repList.add(new Reputation("평론가","존윅", 8, "킬러의 귀환. 그러나 복수가 아닌 자유를 갈망하는"));
		repList.add(new Reputation("실관람객","해리포터", 10, "예상하지 못한 스토리 아름다운 결말"));
		repList.add(new Reputation("실관람객","해리포터", 10, "언제 봐도 행복한 나의 어린 시절, 나의 해리포터"));
		repList.add(new Reputation("실관람객","해리포터", 8, "스릴있고 몰입도도 높았다"));
		repList.add(new Reputation("실관람객","해리포터", 9, "판타지 모험의 정석, 거기에 긴장감과 서스펜스가 추가되어 속도감있는 몰입도를 줬음"));
		repList.add(new Reputation("실관람객","해리포터", 9, "아직도 호그와트 입학 편지 기다리는 중.."));
		repList.add(new Reputation("평론가","해리포터", 9, "<해리 포터> 시리즈의 재미를 견인하면서 독자적으로 뛰어난 완성도를 입증한다."));
		repList.add(new Reputation("평론가","해리포터", 6, "시리즈의 피로가 느껴진다"));
		repList.add(new Reputation("평론가","해리포터", 7, "소년은 늙기 쉽고 마법은 많이 남았나니"));
		repList.add(new Reputation("평론가","해리포터", 9, "<해리 포터> 시리즈의 재미를 견인하면서 독자적으로 뛰어난 완성도를 입증한다."));
		repList.add(new Reputation("실관람객","토이스토리", 10, "혼자 늘 인형하고만 놀던 어린날의 나를 위로해준 영화"));
		repList.add(new Reputation("실관람객","토이스토리", 9, "어린 시절 품에 꼭 안았던 인형만큼, 처음 배우는 게 많았던 어린 시절 순수한 감정만큼, 아직도 헤어짐에 서툰 완전하지 못한 어른이 된 내가 항상 닿을 수 있다면 꼭 안아주고 싶은 어린 시절만큼 소중한 영화."));
		repList.add(new Reputation("실관람객","토이스토리", 10, "함께 했던 순간들이 한 장의 사진으로 남기를. 훗날 꺼내보는 그 순간에도 고마움이 가득하기를."));
		repList.add(new Reputation("실관람객","토이스토리", 9, "이별은 누구에게나 다가오지만, 그 순간의 벅참은 대개 흘려보냈던 고마운 존재들에 의한 것."));
		repList.add(new Reputation("실관람객","토이스토리", 10, "훗날 한 아이의 아빠가 된다면 우리아이가 크면서 하나씩하나씩 보여주고싶은 아니 꼭 보여줘야하는 우디와 친구들이야기"));
		repList.add(new Reputation("평론가","토이스토리", 7, "깜찍발랄하지만 개인에 매몰된 세계관이라니!"));
		repList.add(new Reputation("평론가","토이스토리", 8, "혈관이 만져지는 ‘휴먼 스토리’!"));
		repList.add(new Reputation("평론가","토이스토리", 9, "이토록 뭉클한 라스트신이라니!"));
		repList.add(new Reputation("실관람객","스파이더맨", 9, "피터 파커가 누군데 스파이더맨 영화에 있나요?"));
		repList.add(new Reputation("실관람객","스파이더맨", 10, "진짜 너무 재밌어서 개봉했을때 영화관가서 몇번을 봤는지 모르겠어요. 존잼!"));
		repList.add(new Reputation("실관람객","스파이더맨", 7, "스파이더맨은 좀 행복하면 안되냐?"));
		repList.add(new Reputation("실관람객","스파이더맨", 10, " 스파이더맨으로서의 숙명과 치유가 맞닿은 이야기"));
		repList.add(new Reputation("실관람객","스파이더맨", 8, "히어로 영화라는 장르에서 스파이더맨과 마블 유니버스가 어떤 위상을 가지고 있는지 느끼게 해주는 큐레이터 같은 영화"));
		repList.add(new Reputation("평론가","스파이더맨", 7, "사랑과 헌신과 추억의 곡예에 갈채를"));
		repList.add(new Reputation("평론가","스파이더맨", 8, "우리의 '위대한' 이웃으로 거듭난 스파이더맨"));
		repList.add(new Reputation("평론가","스파이더맨", 8, "인간의 선한 본성을 믿는 프랜차이즈가 지닌 힘"));
		repList.add(new Reputation("평론가","스파이더맨", 6, "영리하게 끊으면서 더 끈끈한 웹스윙 이어가기"));
		repList.add(new Reputation("평론가","스파이더맨", 6, "소년에서 청년으로, 다사다난한 기록"));
		
	}
	
	private static ReputationDB instance = new ReputationDB();
	
	public static ReputationDB getInstance() {
		return instance;
	}
	
	public void showRepList(String name) {				
		System.out.println("\n⭐⭐⭐⭐⭐⭐ 실관람객 평점 ⭐⭐⭐⭐⭐⭐\n");
	    int avg = 0;
	    ArrayList<Integer> temp = new ArrayList<>();
	    boolean hasRating = false;
	    
	    for(int i = 0; i < repList.size(); i++) {
	        if(repList.get(i).getTitle().contains(name) && repList.get(i).getGubun().contains("실관람객")) {
	            System.out.println("평점: "+ repList.get(i).getRep() + ", " + "\"" + repList.get(i).getContents() + "\"");
	            avg += repList.get(i).getRep();
	            temp.add(repList.get(i).getRep());
	            hasRating = true;
	        }
	    }
	    
	    if(hasRating) {
	        System.out.println("실관람객 평점평균: " + String.format("%.2f", (double)avg/temp.size()));
	    } else {
	        System.out.println("평점이 등록되지 않은 영화입니다.");
	    }
		
		System.out.println("\n⭐⭐⭐⭐⭐⭐ 평론가 평점 ⭐⭐⭐⭐⭐⭐\n");
		
		int avg2=0;
		ArrayList<Integer> temp2 = new ArrayList<>();
		boolean hasRating2 = false;

		for(int i = 0; i < repList.size(); i++) {
			if(repList.get(i).getTitle().contains(name) && repList.get(i).getGubun().contains("평론")) {
				System.out.println("평점: "+ repList.get(i).getRep() + ", " + "\"" + repList.get(i).getContents() + "\"");
				avg2 += repList.get(i).getRep();
				temp2.add(repList.get(i).getRep());
				hasRating2 = true;
			} 		
		}
		if(hasRating2) {
			System.out.println("평론가 평점평균: " + String.format("%.2f", (double)avg2/temp2.size()));
		} else {
			 System.out.println("평점이 등록되지 않은 영화입니다.");
		}
	
	}
		

	
	public void addRep(Reputation rep) {
		
		repList.add(rep);
		
	}
	

	
	

}
