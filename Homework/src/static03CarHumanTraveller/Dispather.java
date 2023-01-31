package static03CarHumanTraveller;

public class Dispather {

	public static void main(String[] args) {
		Car c1 = new Car("Bentley", true);
		System.out.println("is Broken? " + c1.isBroken);
		Driver d1 = new Driver("Serg", c1);
		d1.repair();
		System.out.println("is Broken? " + c1.isBroken);
		Car c2 = new Car("Mazda", true);
		AutoServise.repairByService(c2);
		Car c3 = new Car("BMW", false);
		AutoServise.repairByService(c3);
/*
		Human h1 = new Human("Serg", "no education");
		System.out.println(h1.education);
		SelfEducation.getAndDisplayEducation(h1);
		System.out.println(h1.education);
		Human h2 = new Human("Serg", "no education");
		EducationInSchool.getAndDisplayEducation(h2);
		Human h3 = new Human("Serg", "no education");
		EducationInUniversity.getAndDisplayEducation(h3);
*/
	}
}
class Car {
	String model;
	boolean isBroken;
	Car(String model, boolean isBroken){
	this.model = model;
	this.isBroken = isBroken;
	}
}
class Driver {
	String name;
	Car myCar;
	Driver (String name, Car myCar){
		this.name = name;
		this.myCar = myCar;
	}
	 boolean repair() {
		if(myCar.isBroken == false) {
			System.out.println(name + "'s car " + myCar.model + " is in a good shape");
			return myCar.isBroken;
		}
		System.out.println(name + "'s car " + myCar.model + " was repaired");
		return (myCar.isBroken = false);
	}
}
class AutoServise {
	static boolean repairByService(Car car) {
		if(car.isBroken == false) {
			System.out.println("your car" + car.model + " is in a good shape");
			return car.isBroken;
		}
		System.out.println("procidures...");
		System.out.println("your car " + car.model + " was repired");
		return (car.isBroken = false);
	}
}
class Human {
	String name;
	String education;
	Human(String name, String education){
		this.name = name;
		this.education = education;
	}
}
class SelfEducation{
	static String getAndDisplayEducation(Human human) {
		System.out.print("readin books -> ");
		human.education = "well-educated";
		System.out.println(human.name + " education is " + human.education);
		return human.education;
	}
}
class EducationInSchool{
	static String getAndDisplayEducation(Human human) {
		System.out.print("passig tests -> ");
		human.education = "secondary educated";
		System.out.println(human.name + " education is " + human.education);
		return human.education;
	}
}
class EducationInUniversity{
	static String getAndDisplayEducation(Human human) {
		System.out.print("passig exams -> ");
		human.education = "high educated";
		System.out.println(human.name + " education is " + human.education);
		return human.education;
	}
}
