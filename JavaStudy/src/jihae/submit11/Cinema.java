package jihae.submit11;

public class Cinema {
	private int no;
	private String title;
	
	public Cinema() {}

	public Cinema(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}

	@Override
	public String toString() {
		return no +  ". [" + title + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	
	
	

	
	
	
	
	
	

}
