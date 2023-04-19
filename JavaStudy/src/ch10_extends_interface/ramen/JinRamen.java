package ch10_extends_interface.ramen;

public class JinRamen extends Ramen{
	String name;
	int price;
	
	public JinRamen(String name, int price) {
		super(name, price);
	}
	
	@Override  // 안붙여도 됨 근데 명시적인게 좋음 붙여주기.
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고, 3분 후에 잘 저어서 드세요");
	}
	
	
	
	
	
	
	

}
