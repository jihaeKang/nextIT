package ch10_extends_interface.ramen;

public class Jjappagherti extends Ramen{
	String name;
	int price;
	
	public Jjappagherti(String name, int price) {
		super(name, price);
	}
	
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 넣어 드세요");
	}
	

}
