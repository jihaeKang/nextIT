package jihae.submit11;

public class Snack {
	private int no;
	private String snackNm;
	private String composition;
	private int price;
	
	public Snack() {}

	public Snack(int no, String snackNm, String composition, int price) {
		super();
		this.no = no;
		this.snackNm = snackNm;
		this.composition = composition;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + no + ". " + snackNm + composition + ", 가격: " + price + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSnackNm() {
		return snackNm;
	}

	public void setSnackNm(String snackNm) {
		this.snackNm = snackNm;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	
	
	

}
