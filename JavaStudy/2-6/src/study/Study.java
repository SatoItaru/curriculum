package study;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Study {
	
	public static void main(String args[]) {
		
		Date now = new Date();
		
		System.out.println(now);
		
		Calendar calendar = Calendar.getInstance();
		
//実際の月の値は-1を保持しているため+1で実際に表示される値を調整しており、あくまで「月の値+1」であるため「13月、14月、15月」となってしまう事がる。
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		
		System.out.println(calendar.get(Calendar.DATE));
		
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.MONTH, 2);
		
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		
		calendar.add(Calendar.DATE, 15);
		
		System.out.println(calendar.get(Calendar.DATE));
		
		printLeapYear(calendar.get(Calendar.YEAR));
	}

	private static void printLeapYear(final int year) {
		
		System.out.println(year + "年は、うるう年" + (Year.isLeap(year)? "です。" : "ではありません。"));
		
	}

}