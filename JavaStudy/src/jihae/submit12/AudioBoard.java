package jihae.submit12;

public class AudioBoard extends BoardUnit{
	private String audio;

	public AudioBoard() {
		
	}
	
	public AudioBoard(int no, String title, String date, String content, String audio) {
		super(no, title, date, content);
		this.audio = audio;
	}

	

	@Override
	public String toString() {
		return "AudioBoard [getNo()=" + getNo() + ", getTitle()=" + getTitle() + ", getDate()="
				+ getDate() + ", getContent()=" + getContent() + ", audio=" + audio + "]";
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
	
	
	
	

}
