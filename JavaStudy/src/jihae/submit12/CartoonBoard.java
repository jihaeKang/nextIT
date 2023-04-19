package jihae.submit12;

public class CartoonBoard extends BoardUnit{
	private String image;

	public CartoonBoard() {
		
	}
	
	
	public CartoonBoard(int no, String title, String date, String content, String image) {
		super(no, title, date, content);
		this.image = image;
	}


	@Override
	public String toString() {
		return "CartoonBoard [toString()=" + super.toString() + ", getNo()=" + getNo()
				+ ", getTitle()=" + getTitle() + ", getDate()=" + getDate() + ", getContent()=" + getContent() + "image=" + image + "]";
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	

}
