package jihae.submit13.vo;

import java.sql.Date;

public class MemberVO {
	private String memId;
	private String memPw;
	
	public MemberVO() {
		
	}

	public MemberVO(String memId, String memPw) {
		super();
		this.memId = memId;
		this.memPw = memPw;
	}

	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPw=" + memPw + "]";
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

	
	
	
	
	
	

}
