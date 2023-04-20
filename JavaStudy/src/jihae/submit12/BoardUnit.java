package jihae.submit12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardUnit {
	private int noo;
	private String titlee;
	private String datee;
	private String contentss; 
	
	public BoardUnit() {
		
	}
	
	public BoardUnit(int noo, String titlee, String datee, String contentss) {
		super();
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String todayFormat = sdf.format(today);
		this.noo = noo;
		this.titlee = titlee;
		this.datee = todayFormat;
		this.contentss = contentss;
	}

	@Override
	public String toString() {
		return "BoardUnit [noo=" + noo + ", titlee=" + titlee + ", datee=" + datee + ", contentss=" + contentss + "]";
	}

	public int getNoo() {
		return noo;
	}

	public void setNoo(int noo) {
		this.noo = noo;
	}

	public String getTitlee() {
		return titlee;
	}

	public void setTitlee(String titlee) {
		this.titlee = titlee;
	}

	public String getDatee() {
		return datee;
	}

	public void setDatee(String datee) {
		this.datee = datee;
	}

	public String getContentss() {
		return contentss;
	}

	public void setContentss(String contentss) {
		this.contentss = contentss;
	}
	
	
	
	

}
