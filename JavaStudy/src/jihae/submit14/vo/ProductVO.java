package jihae.submit14.vo;

public class ProductVO {
	private int proCode;
	private String proName;
	private String proContent;
	private int proPrice;
	
	public ProductVO() {
		
	}

	public ProductVO(int proCode, String proName, String proContent, int proPrice) {
		super();
		this.proCode = proCode;
		this.proName = proName;
		this.proContent = proContent;
		this.proPrice = proPrice;
	}

	@Override
	public String toString() {
		return "ProductVO [proCode=" + proCode + ", proName=" + proName + ", proContent=" + proContent + ", proPrice="
				+ proPrice + "]";
	}

	public int getProCode() {
		return proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProContent() {
		return proContent;
	}

	public void setProContent(String proContent) {
		this.proContent = proContent;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	
	
	
	
	

}
