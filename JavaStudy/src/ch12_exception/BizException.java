package ch12_exception;

public class BizException extends Exception{
	
	// 관리용 에러코드
	private String errCode;

	public BizException() {
		super();
	}

	public BizException(String message) {
		super(message);
	}
	
	public BizException(String errCode, String message) {
		super(message);
		this.errCode = errCode;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	} // 이건 필요없음

	
	
	
	
	

}
