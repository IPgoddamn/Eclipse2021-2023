package calendar;
import java.util.*;
import static java.util.Calendar.*;
public class CalendarHome {

	public static void main(String[] args) {
		GregorianCalendar cs = new GregorianCalendar();
//		for (int i = 1; i < 6; i++) {
//			cs.set(2022 + i, 4, 17);
//			System.out.println(cs.getDisplayName(DAY_OF_WEEK, LONG_STANDALONE, Locale.US));
//		}
		// exercise 2
		GregorianCalendar cs2 = new GregorianCalendar();
		cs.set(1939, 8, 1);
		cs2.set(1945, 8, 2);
//		System.out.println(cs.get(YEAR));
		int numberOfDays = 0;
		if(cs.get(YEAR) == cs2.get(YEAR)) {
			numberOfDays = cs2.get(DAY_OF_YEAR) - cs.get(DAY_OF_YEAR);
		}else {
			numberOfDays = cs.getActualMaximum(DAY_OF_YEAR) - cs.get(DAY_OF_YEAR) + cs2.get(DAY_OF_YEAR);
			for (int i = cs.get(YEAR) + 1; i < cs2.get(YEAR); i++) {
				cs.set(YEAR, i);
				numberOfDays += cs.getActualMaximum(DAY_OF_YEAR);
			}
		System.out.println(numberOfDays);
		}
	}
}
