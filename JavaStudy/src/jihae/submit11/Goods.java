package jihae.submit11;

public class Goods {
	private int titleNo;
	private String title;
	private int goodsNo;
	private String goods;
	private int price;
	
	public Goods() {}

	public Goods(int titleNo, String title, int goodsNo, String goods, int price) {
		super();
		this.titleNo = titleNo;
		this.title = title;
		this.goodsNo = goodsNo;
		this.goods = goods;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [titleNo=" + titleNo + ", title=" + title + ", goodsNo=" + goodsNo + ", goods=" + goods
				+ ", price=" + price + "]";
	}

	public int getTitleNo() {
		return titleNo;
	}

	public void setTitleNo(int titleNo) {
		this.titleNo = titleNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(int goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	

}
