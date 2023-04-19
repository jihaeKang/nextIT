package jihae.submit12;

import java.util.ArrayList;

import ch09_class.homepage.Board;

public class BoardDB {
	private ArrayList<Board> boardList = new ArrayList<>();
	
	private BoardDB() {
	
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	public void showBoardList() {
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
	
	public void makeContents(Board bd) {
		bd.setNo(boardList.size()+1);
		
		boardList.add(bd);
	}

}
