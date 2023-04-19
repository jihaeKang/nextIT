package jihae.submit10;

public class Book {
	private int no;
	private String name;
	private boolean rent = false;
	
	public Book() {
		
	}
	
	public Book(int no, String name, boolean rent) {
		super();
		this.no = no;
		this.name = name;
		this.rent = rent;
	}
	

	@Override
	public String toString() {
		if(this.rent) {
			return "[책번호: " + no + ", 책제목: " + name + ", 대여상태: 대여중]";
		}else {
			return "[책번호: " + no + ", 책제목: " + name + ", 대여상태: 입고중]";
		}
//		String temp = (rent)?("입고중"):("대여중");
//		return "[책번호: " + no + ", 책제목: " + name + ", 대여상태: " + temp + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isrent() {
		return rent;
	}

	public void setLent(boolean rent) {
		this.rent = rent;
	}
	
	
	
	
	

}
