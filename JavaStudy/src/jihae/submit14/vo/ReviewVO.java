package jihae.submit14.vo;

public class ReviewVO {
	int rvNo;
	String rvId;
	int rvCode;
	String rvName;
	int rvRate;
	String rvContent;
	
	public ReviewVO() {
		
	}

	public ReviewVO(int rvNo, String rvId, int rvCode, String rvName, int rvRate, String rvContent) {
		super();
		this.rvNo = rvNo;
		this.rvId = rvId;
		this.rvCode = rvCode;
		this.rvName = rvName;
		this.rvRate = rvRate;
		this.rvContent = rvContent;
	}

	@Override
	public String toString() {
		return "ReviewVO [rvNo=" + rvNo + ", rvId=" + rvId + ", rvCode=" + rvCode + ", rvName=" + rvName + ", rvRate="
				+ rvRate + ", rvContent=" + rvContent + "]";
	}

	public int getRvNo() {
		return rvNo;
	}

	public void setRvNo(int rvNo) {
		this.rvNo = rvNo;
	}

	public String getRvId() {
		return rvId;
	}

	public void setRvId(String rvId) {
		this.rvId = rvId;
	}

	public int getRvCode() {
		return rvCode;
	}

	public void setRvCode(int rvCode) {
		this.rvCode = rvCode;
	}

	public String getRvName() {
		return rvName;
	}

	public void setRvName(String rvName) {
		this.rvName = rvName;
	}

	public int getRvRate() {
		return rvRate;
	}

	public void setRvRate(int rvRate) {
		this.rvRate = rvRate;
	}

	public String getRvContent() {
		return rvContent;
	}

	public void setRvContent(String rvContent) {
		this.rvContent = rvContent;
	}

	
	
	
	

}
