package jihae.submit12;

import java.util.ArrayList;

import ch09_class.homepage.Board;

public class BoardDB {
	private ArrayList<BoardUnit> boardList = new ArrayList<>();
	
	private BoardDB() {
	
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	public void showBoardList() {
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i).getNoo() + ". | " + boardList.get(i).getTitlee() + " | " + boardList.get(i).getDatee());
		}
	}
	
	public void makeContents(BoardUnit bd) {
		bd.setNoo(boardList.size()+1);
		
		boardList.add(bd);
	}

}
