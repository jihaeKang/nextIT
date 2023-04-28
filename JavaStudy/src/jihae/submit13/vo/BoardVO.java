package jihae.submit13.vo;

import java.sql.Date;

public class BoardVO {
	private int boardNo;
	private String boardtitle;
	private String boardcontent;
	private String boardname;
	private String boardDate;
	
	public BoardVO() {
		
	}

	public BoardVO(int boardNo, String boardtitle, String boardcontent, String boardname, String boardDate) {
		super();
		this.boardNo = boardNo;
		this.boardtitle = boardtitle;
		this.boardcontent = boardcontent;
		this.boardname = boardname;
		this.boardDate = boardDate;
	}
	
//	public BoardVO(String boardtitle, String boardcontent) {
//		super();
//		
//		this.boardNo = 0;
//		this.boardtitle = boardtitle;
//		this.boardcontent = boardcontent;
//		this.boardname = "";
//		this.boardDate = Date toDay = new Date();
//	}

	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", boardtitle=" + boardtitle + ", boardcontent=" + boardcontent
				+ ", boardname=" + boardname + ", boardDate=" + boardDate + "]";
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardtitle() {
		return boardtitle;
	}

	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getBoardcontent() {
		return boardcontent;
	}

	public void setBoardcontent(String boardcontent) {
		this.boardcontent = boardcontent;
	}

	public String getBoardname() {
		return boardname;
	}

	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	
	
	
	

}
