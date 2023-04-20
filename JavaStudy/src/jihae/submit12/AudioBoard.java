package jihae.submit12;

public class AudioBoard extends BoardUnit{
	private String audio;

	public AudioBoard() {
		
	}
	
	public AudioBoard(int noo, String titlee, String datee, String contentss, String audio) {
		super(noo, titlee, datee, contentss);
		this.audio = audio;
	}

	

	@Override
	public String toString() {
		return "getNo()=" + getNoo() + ", getTitle()=" + getTitlee()
		+ ", getDate()=" + getDatee() + ", getContent()=" + getContentss() + ", audio=" + audio + "]";
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
	
	
	
	

}
