package jihae.submit14.vo;

public class ShopMemberVO {
	private String memId;
	private String memPw;
	private int memPoint;
	
	public ShopMemberVO() {
		
	}

	public ShopMemberVO(String memId, String memPw, int memPoint) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memPoint = memPoint;
	}

	@Override
	public String toString() {
		return "ShopMemberVO [memId=" + memId + ", memPw=" + memPw + ", memPoint=" + memPoint + "]";
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public int getMemPoint() {
		return memPoint;
	}

	public void setMemPoint(int memPoint) {
		this.memPoint = memPoint;
	}
	
	
	
	
	

}
