package jihae.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		// dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for(int i = 0; i < 100; i++) {
			int randDay = (int)(Math.random() * 365) + 1;		// 1~365	
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);
							
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i+1) + "번째 생성된 글", strDate));
			}
						
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
			}
		
		System.out.println("\n====================================\n");

		// TODO 코드작성 시작 ~!!
		
//		무작위 날짜로 생성된 DateBoard를 담고 있는 dbList를 날짜순으로 정렬 하여 출력해주세요.
		
		for(int k = 0; k < dbList.size()-1; k++) {
			 for(int i = 0 ; i < dbList.size()-1; i++) {
				 long date1 = sdf.parse(dbList.get(i).getDate()).getTime();
				 long date2 = sdf.parse(dbList.get(i+1).getDate()).getTime();
				 
				 if(date1 > date2) {
					 DateBoard t = dbList.get(i);
					 dbList.set(i, dbList.get(i+1));
					 dbList.set(i+1, t);
				 }
			 }
		 }
		
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n========================================\n");
		
		for(int k = 0; k < dbList.size()-1; k++) {
			 for(int i = 0 ; i < dbList.size()-1; i++) {
				 long date1 = sdf.parse(dbList.get(i).getDate()).getTime();
				 long date2 = sdf.parse(dbList.get(i+1).getDate()).getTime();
				 
				 if(date1 < date2) {
					 DateBoard t = dbList.get(i);
					 dbList.set(i, dbList.get(i+1));
					 dbList.set(i+1, t);
				 }
			 }
		 }
		
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n========================================\n");
		
//		dbList에서 최근 한달 내(오늘기준 30일 전까지)로 작성된 게시글만 출력해주세요.
		
		Date toDay = new Date();
		long toDayMill = toDay.getTime();
		System.out.println(toDayMill);
		
		System.out.println("\n==\n");
		
		for(int i = 0; i < dbList.size(); i++) {
			long date = sdf.parse(dbList.get(i).getDate()).getTime();
			
			if((toDayMill - date)/(1000*60*60*24) <= 30) {
				System.out.println(dbList.get(i));
			}	
		}
		
		System.out.println("\n======================================\n");
		
//		dbList에서 이번달에 작성된 게시글만 출력해주세요. (이번달이라고 5를 쓰지 마시구.. 코드상으로 이번달을 얻어서 써야겠죠?)
		
		Calendar calendar = Calendar.getInstance();
		
		int thisMon = calendar.get(Calendar.MONTH)+1;
		System.out.println(thisMon);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date mon = sdf.parse(dbList.get(i).getDate());
//			calendar.setTime(thisMon);
			
			
		}



	}

}
