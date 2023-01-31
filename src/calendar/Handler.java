package calendar;
import java.util.*;
import static java.util.Calendar.*;
public class Handler {

	public static void main(String[] args) {
		GregorianCalendar cs = new GregorianCalendar();
/*		System.out.println(cs.get(YEAR));			// 2022 2022
		System.out.println(cs.get(MONTH));			// 4      3 ? Рахуемо начало року з 0
		System.out.println(cs.get(DAY_OF_MONTH));	// 7      7
		System.out.println(cs.get(DAY_OF_WEEK));	// 4	  5 ? Рахуемо з неділі (воскресенье) 
		*/
		cs.set(YEAR, 2018);
		cs.set(MONTH, DECEMBER);
		cs.set(DAY_OF_MONTH, 21);					// 21.12
//		System.out.println("\n"+ cs.get(DAY_OF_WEEK));
		
		cs.add(DAY_OF_MONTH, 15);
		System.out.println(cs.get(YEAR));	
		System.out.println(cs.get(MONTH));			
		System.out.println(cs.get(DAY_OF_MONTH));
		GregorianCalendar gs = new GregorianCalendar(); 
		Date now = gs.getTime();							// convert GS to Date
		GregorianCalendar gs1 = new GregorianCalendar();
		gs1.setTime(now);									// convert Date to GS
		
		
	}

}
