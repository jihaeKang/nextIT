package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재 황정민", "ㅅㅅㄱ"));
		movieList.add(new Movie("해리포터", "닥쳐 말포이", "엠마왓슨", "ㅎㄹㅍㅌ"));
		movieList.add(new Movie("다크나이트", "why so serious", "크리스찬 베일 히스레저", "ㄷㅋㄴㅇㅌ"));
		movieList.add(new Movie("엔드게임", "3000만큼 사랑해", "로버트다우니주니어", "ㅇㄷㄱㅇ"));
		movieList.add(new Movie("스파이더맨", "큰 힘엔 큰 책임이 따른다", "톰홀랜드", "ㅅㅍㅇㄷㅁ"));
		movieList.add(new Movie("기생충", "너는 계획이 다 있구나", "송강호 최우식", "ㄱㅅㅊ"));
		movieList.add(new Movie("인터스텔라", "우린 답을 찾을 것이다 늘 그랬듯이", "매튜 맥커너히", "ㅇㅌㅅㅌㄹ"));
		movieList.add(new Movie("아가씨", "염병 예쁘면 예쁘다고 말을 해야할거 아니야", "김태리 김민희", "ㅇㄱㅆ"));
		movieList.add(new Movie("트루먼쇼", "good afternoom, good evenig and good night", "짐캐리", "ㅌㄹㅁㅅ"));
		movieList.add(new Movie("죽은시인의사회", "Oh captain my captain", "로빈 윌리엄스 에단호크", "ㅈㅇㅅㅇㅇㅅㅎ"));

	}
	
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	
	
	

}
