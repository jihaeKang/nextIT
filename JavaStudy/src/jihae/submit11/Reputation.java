package jihae.submit11;

public class Reputation {
	private String gubun;
	private String title;
	private int rep;
	private String contents;
	
	public Reputation() {}

	public Reputation(String gubun, String title, int rep, String contents) {
		super();
		this.gubun = gubun;
		this.title = title;
		this.rep = rep;
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Reputation [gubun=" + gubun + ", title=" + title + ", rep=" + rep + ", contents=" + contents + "]";
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRep() {
		return rep;
	}

	public void setRep(int rep) {
		this.rep = rep;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	
	
	

}
