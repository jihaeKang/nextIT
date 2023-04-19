package jihae.submit11;

import java.util.ArrayList;

public class SnackDB {
	ArrayList<Snack> snackList = new ArrayList<>();
	
	private SnackDB() {
		snackList.add(new Snack(1,"🍿🥤콤보세트", "(팝콘L/음료2)",9000));
		snackList.add(new Snack(2,"🌮🥤나초세트", "(나초/음료2)",8000));
		snackList.add(new Snack(3,"🦑🥤오징어세트", "(맥반석 오징어/음료2)",9000));
		snackList.add(new Snack(4,"🌮🍿🥤나초콤보", "(팝콘L/나초/음료2)",16000));
		snackList.add(new Snack(5,"🦑🍿🥤오징어콤보", "(팝콘L/맥반석 오징어/음료2)",17000));
		
	}
	
	private static SnackDB instance = new SnackDB();
	
	public static SnackDB getInstance() {
		return instance;
	}
	
	public void choice() {
		for(int i=0; i<snackList.size(); i++) {
			System.out.println(snackList.get(i));
		}
	}
	
	public void snackBuy(int no) {
		for(int i = 0; i < snackList.size(); i++) {
			if(snackList.get(i).getNo()==no) {
				System.out.println(snackList.get(i).getSnackNm() + "을(를) " + snackList.get(i).getPrice() + "원에 구매하셨습니다.");
				
			}
		}
	}
	

}
