package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Handler {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f1 = new File("D://workspace//Handler//src//serialization//file1");
		Car c1 = new Car(200, new Engine("Mann", 250), "BMW", 7000);
		c1.fieldCopy = c1.field;
		c1.staticFieldCopy = Car.staticField;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
		oos.writeObject(c1);	// staticDield = 300;
		oos.flush();
		oos.close();
		Car.staticField = 400;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
		Car c2 = (Car) ois.readObject();
		c2.field = c2.fieldCopy;
		System.out.println(c2);
		ois.close();
		System.out.println(c2.staticFieldCopy);
	}
}

class Parent {
	int field;

	Parent(int field) {
		this.field = field;
	}

	Parent() {
	}
}

class Car extends Parent implements Serializable {
	transient Engine e; // якщо не можно implements Serializable
	String model;
	static int staticField = 300;
	int staticFieldCopy;
	int price;
	int fieldCopy;

	public Car(int field, Engine e, String model, int price) {
		super(field);
		this.e = e;
		this.model = model;
		this.price = price;
	}

	public String toString() {
		return super.field + " " + model + " " + price + " " + this.e;
	}

	private void writeObject(ObjectOutputStream os) { // якщо не можно implements Serializable
		try {
			os.defaultWriteObject();
			os.writeObject(e.producer);
			os.writeInt(e.power);
		} catch (IOException ioe) {
		}
	}

	private void readObject(ObjectInputStream is) { // якщо не можно implements Serializable
		try {
			is.defaultReadObject();
			String s = (String) is.readObject();
			int i = is.readInt();
			this.e = new Engine(s, i);
		} catch (Exception ioe) {
		}
	}

}

class Engine { // implements Serializable не завжди можно
	String producer;
	int power;

	public Engine(String producer, int power) {
		this.producer = producer;
		this.power = power;
	}

	public String toString() {
		return producer + " " + power;
	}
}