package jihae.submit12;

public class CartoonBoard extends BoardUnit{
	private String image;

	public CartoonBoard() {
		
	}
	
	
	public CartoonBoard(int noo, String titlee, String datee, String contentss, String image) {
		super(noo, titlee, datee, contentss);
		this.image = image;
	}


	@Override
	public String toString() {
		return ", getNo()=" + getNoo() + ", getTitle()=" + getTitlee()
		+ ", getDate()=" + getDatee() + ", getContent()=" + getContentss() + "image=" + image + "]";
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	

}
