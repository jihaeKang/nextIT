package jihae.submit12;

public class Board extends BoardUnit{

	public Board() {
	
	}

	public Board(int noo, String titlee, String datee, String contentss) {
		super(noo, titlee, datee, contentss);
	}

	@Override
	public String toString() {
		return  ", getNo()=" + getNoo() + ", getTitle()=" + getTitlee()
				+ ", getDate()=" + getDatee() + ", getContent()=" + getContentss() + "]";
	}
	

	
	
	
	
	

}
