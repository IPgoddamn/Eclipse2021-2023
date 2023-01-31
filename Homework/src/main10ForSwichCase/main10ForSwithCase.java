package main10ForSwichCase;
import java.util.ArrayList;
import java.util.Scanner;
public class main10ForSwithCase {

	public static void main(String[] args) {
		Scanner src = new Scanner (System.in);
		System.out.print("MARKS");
		String [] a = src.nextLine().split(" ");
		src.close();
		char[] toChar = String.join("", a).toCharArray();
		// 1 exersice 
		
		for(int i = 0 ; i < toChar.length; i++) {
			switch (toChar[i]){
				case '0' :
				case '1' :
				case '2' : System.out.println("Unsatisfactory");break;
				case '3' : System.out.println("Satisfactory");break;
				case '4' : System.out.println("Good");break;
				case '5' : System.out.println("Excellent");break;
				default : System.out.println("It's not a Mark");
			}
		}
		
		// 2 exersice 
		/*
		char[] result = MyScanner.ScanLine();
		Days.addDays(result);
		Marks.addMarks(result);
		Planets.addPlanets(result);
		View.displayAll(result);
		*/
	}
}
class MyScanner{
	static Scanner src = new Scanner (System.in);
	static char[] ScanLine() {
		System.out.print("MARKS");
		String [] a = src.nextLine().split(" ");
		char[] toChar = String.join("", a).toCharArray();
		return toChar;
	}
	
}
class Days{		//Controller and Model
	static ArrayList<String> days = new ArrayList<String>();
	static void addDays (char[] toChar) {
		for(int i = 0 ; i < toChar.length; i++) {
			switch (toChar[i]){
			case '1' : days.add("Mondey");break;
			case '2' : days.add("Tuesday");break;
			case '3' : days.add("Wednesday");break;
			case '4' : days.add("Thursday");break;
			case '5' : days.add("Friday");break;
			case '6' : days.add("Saturday");break;
			case '7' : days.add("Sunday");break;
			default : days.add("Not a day");
			}
		}
	}
}
//		System.out.println(days);
class Marks{		//Controller and Model
	static ArrayList<String> marks = new ArrayList<String>();
	static void addMarks (char[] toChar) {
		for(int i = 0 ; i < toChar.length; i++) {
			switch (toChar[i]){
				case '0' :
				case '1' :
				case '2' : marks.add("Unsatisfactory");break;
				case '3' : marks.add("Satisfactory");break;
				case '4' : marks.add("Good");break;
				case '5' : marks.add("Excellent");break;
				default : marks.add("It's not a Mark");
			}
		}
	}
}
class Planets{		//Controller and Model
	static ArrayList<String> planets = new ArrayList<String>();
	static void addPlanets (char[] toChar) {
		for(int i = 0 ; i < toChar.length; i++) {
			switch (toChar[i]){
			case '1' : planets.add("Mercury");break;
			case '2' : planets.add("Venus");break;
			case '3' : planets.add("Earth");break;
			case '4' : planets.add("Mars");break;
			case '5' : planets.add("Jupiter");break;
			case '6' : planets.add("Saturn");break;
			case '7' : planets.add("Uran");break;
			case '8' : planets.add("Neptune");break;
			default : planets.add("Not a Planet");
			}
		}
	}
}		
class View {		//View
	static void displayAll(char[] ch){
		for(int i = 0; i < ch.length; i++) {
			if(Days.days.isEmpty() == false)System.out.printf ("%-15s", Days.days.get(i));
			if(Marks.marks.isEmpty() == false)System.out.printf ("%-20s", Marks.marks.get(i));
			if(Planets.planets.isEmpty() == false)System.out.printf ("%-15s", Planets.planets.get(i));
			System.out.println();
		}
	}
}
