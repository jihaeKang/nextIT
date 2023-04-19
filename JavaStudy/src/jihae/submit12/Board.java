package jihae.submit12;

public class Board extends BoardUnit{

	public Board() {
		super();
	}

	public Board(int no, String title, String date, String content) {
		super(no, title, date, content);
	}

	@Override
	public String toString() {
		return  ", getNo()=" + getNo() + ", getTitle()=" + getTitle()
				+ ", getDate()=" + getDate() + ", getContent()=" + getContent() + "]";
	}
	

	
	
	
	
	

}
