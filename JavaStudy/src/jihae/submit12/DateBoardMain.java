package jihae.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.DALOAD;

import javafx.print.Collation;

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
		
		System.out.println("\n==================3-1==================\n");

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
		
		// collections.sort
		System.out.println("\n=================Collections=================\n");
		
		Collections.sort(dbList, new Comparator<DateBoard>() {

			@Override
			public int compare(DateBoard dbA, DateBoard dbB) {
				int rst = 1;
				SimpleDateFormat fff = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
				try {
					Date left = fff.parse(dbA.getDate());
					Date right = fff.parse(dbB.getDate());
					
					if((left.getTime() - right.getTime()) < 0) {
						rst = -1;
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return rst;
			}	
		});
		
		System.out.println("\n===================3-2=====================\n");
		
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
		
		System.out.println("\n====================4===================\n");
		
//		dbList에서 최근 한달 내(오늘기준 30일 전까지)로 작성된 게시글만 출력해주세요.
		
		Date toDay = new Date();
		long toDayMill = toDay.getTime();
		System.out.println(toDayMill);
		
		for(int i = 0; i < dbList.size(); i++) {
			long date = sdf.parse(dbList.get(i).getDate()).getTime();
			
			if((toDayMill - date)/(1000*60*60*24) <= 30) {
				System.out.println(dbList.get(i));
			}	
		}
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("\n==============캘린더사용===============\n");
		
		// 한달 전 날짜로 세팅
		cal.add(cal.MONTH, -1);
		for(int i = 0; i < dbList.size(); i++) {
			Date ttt = sdf.parse(dbList.get(i).getDate());
			if(cal.getTime().getTime() < ttt.getTime()) {
				System.out.println(dbList.get(i));
			}
			
			// ttt를 밀리초로 나타낸 것이 한달 전 날짜를 밀리초로 나타낸것보다 크면 최근 한달 내 데이터를 의미한다.
		}
		
		
		System.out.println("\n===================5===================\n");
		
//		dbList에서 이번달에 작성된 게시글만 출력해주세요. (이번달이라고 5를 쓰지 마시구.. 코드상으로 이번달을 얻어서 써야겠죠?)
		
		Calendar calendar = Calendar.getInstance();
		
		int thisMon = calendar.get(Calendar.MONTH)+1;
		SimpleDateFormat monthFormat = new SimpleDateFormat("M");
		int thisyear = calendar.get(Calendar.YEAR);
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		
		for(int i = 0; i < dbList.size(); i++) {
			Date monParse = sdf.parse(dbList.get(i).getDate());
			int month = Integer.parseInt(monthFormat.format(monParse));
			Date yearParse = sdf.parse(dbList.get(i).getDate());
			int year = Integer.parseInt(yearFormat.format(yearParse));
			
			if(thisMon == month && thisyear == year) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n============샘============\n");
		
		Calendar toMonth = Calendar.getInstance();
		int yeeeee = toMonth.get(Calendar.YEAR);
		int mmmm = toMonth.get(Calendar.MONTH);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date teeee = sdf.parse(dbList.get(i).getDate());
			Calendar tete = Calendar.getInstance();
			tete.setTime(teeee);
			
			int tyyy = tete.get(Calendar.YEAR);
			int tmmm = tete.get(Calendar.MONTH);
			
			if(yeeeee == tyyy && mmmm == tmmm) {
				System.out.println(dbList.get(i));
			}
		}
		
		
		
		System.out.println("\n====================6====================");
		
		int setMon = 2;
		calendar.set(1, setMon-1, 1);
		int feb = Integer.parseInt(monthFormat.format(calendar.getTime()));
		
		for(int i = 0; i < dbList.size(); i++) {
			Date mon = sdf.parse(dbList.get(i).getDate());
			int month = Integer.parseInt(monthFormat.format(mon));
			if(feb == month) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n====================7=====================\n");
		
//		2022년 2월 14일부터 2022년 3월 21일까지 작성된 게시글만 출력해주세요.
		
		String valentine = "2022.02.14";
		String march = "2022.08.21";
		SimpleDateFormat temp2 = new SimpleDateFormat("yyyy.MM.dd");
		long valMill = temp2.parse(valentine).getTime();
		long marMill = temp2.parse(march).getTime();
		System.out.println(valMill);
		System.out.println(marMill);
		
		for(int i = 0; i < dbList.size(); i++) {
			long date = sdf.parse(dbList.get(i).getDate()).getTime();
			
			if(date >= valMill && date <= marMill) {
				System.out.println(dbList.get(i));
			}
		}
		
		
		
		
		
		
		
		
		



	}

}
