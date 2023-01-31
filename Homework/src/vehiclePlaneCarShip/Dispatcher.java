package vehiclePlaneCarShip;
public class Dispatcher {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(true);
		Vehicle v2 = new Vehicle(true);
		Car c1 = new Car("Diesel", "Big", v1.getHasEngine());
		Automobile a1 = new Automobile(c1.getTypeOfEngine(), c1.getSize(), v1.getHasEngine(), "Bwm", 7000, 2014);
//		System.out.println(a1.getPrice());
//		Plane p1 = new Plane("Diesel", "Big", v1.getHasEngine());
//		System.out.println(a1.getProduceYear());
		System.out.println(v1);
	}
}
class Vehicle{ 
	 private boolean hasEngine;
	public boolean getHasEngine(){
		return hasEngine;
	}
	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}
	Vehicle(boolean hasEngine){
		this.hasEngine = hasEngine;
	}
	@Override
	public boolean equals(Object obj) {
		return this.hasEngine == ((Vehicle)obj).hasEngine;
	}
	@Override
	public String toString() {
		if (hasEngine == true) return "Has Engine";
		return "No engine";
	}
	
}
class Plane extends Vehicle{
	private String typeOfEngine;
	private String size;

	Plane(String typeOfEngine, String size, boolean hasEngine){
		super(hasEngine);
		this.typeOfEngine = typeOfEngine;
		this.size = size;
	}
	public String typeOfEngine(){
		return typeOfEngine;
	}
	public void typeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
	public String getSize(){
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return this.size + " " + this.typeOfEngine + " " + super.getHasEngine();
	}
	@Override
	public boolean equals(Object o) {
		return 	this.typeOfEngine.equals(((Plane)o).typeOfEngine) &&
				this.size.equals(((Plane)o).size) &&
				super.getHasEngine() == ((Plane)o).getHasEngine();
	}
	
}
class Car extends Vehicle{
	private String typeOfEngine;
	private String size;
	Car(String typeOfEngine, String size, boolean hasEngine){
		super(hasEngine);
		this.typeOfEngine = typeOfEngine;
		this.size = size;
	}
	public String getTypeOfEngine(){
		return typeOfEngine;
	}
	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
	public String getSize(){
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return this.size + " " + this.typeOfEngine + " " + super.getHasEngine();
	}
	@Override
	public boolean equals(Object o) {
		return 	this.typeOfEngine.equals(((Car)o).typeOfEngine) &&
				this.size.equals(((Car)o).size) &&
				super.getHasEngine() == ((Car)o).getHasEngine();
	}
}
class Ship extends Vehicle{
	private String typeOfEngine;
	private String size;
	Ship(String typeOfEngine, String size, boolean hasEngine){
		super(hasEngine);
		this.typeOfEngine = typeOfEngine;
		this.size = size;
	}
	public String getTypeOfEngine(){
		return typeOfEngine;
	}
	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
	public String getSize(){
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return this.size + " " + this.typeOfEngine + " " + super.getHasEngine();
	}
	@Override
	public boolean equals(Object o) {
		return 	this.typeOfEngine.equals(((Ship)o).typeOfEngine) &&
				this.size.equals(((Ship)o).size) &&
				super.getHasEngine() == ((Ship)o).getHasEngine();
	}
}
//Plane
class PassengerPlane extends Plane{
	private String model;
	private int price;
	private int produceYear;
	PassengerPlane(String typeOfEngine, String size, boolean hasEngine, String model, int price,
			int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	//model
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	//price
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//produceYear
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}
class TransportPlane extends Plane{
	private String model;
	private int price;
	private int produceYear;
	TransportPlane (String typeOfEngine, String size, boolean hasEngine, String model, int price,
			int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
	
}
class Fighter extends Plane{
	private String model;
	private int price;
	private int produceYear;
	Fighter (String typeOfEngine, String size, boolean hasEngine, String model, int price,
			int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}
//Car
class Automobile extends Car{
	private String model;
	private int price;
	private int produceYear;
	
	public Automobile(String typeOfEngine, String size, boolean hasEngine, String model, int price, int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}
class Bus extends Car{
	private String model;
	private int price;
	private int produceYear;
	Bus (String typeOfEngine, String size, boolean hasEngine, String model, int price, int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}
class Truck extends Car{
	private String model;
	private int price;
	private int produceYear;
	Truck (String typeOfEngine, String size, boolean hasEngine, String model, int price, int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}
// Ship
class PassengerLiner extends Ship{
	private String model;
	private int price;
	private int produceYear;
	PassengerLiner (String typeOfEngine, String size, boolean hasEngine, String model, int price, int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}
class Ferry extends Ship{
	private String model;
	private int price;
	private int produceYear;
	Ferry (String typeOfEngine, String size, boolean hasEngine, String model, int price, int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}
class Tanker extends Ship{
	Tanker (String typeOfEngine, String size, boolean hasEngine, String model, int price, int produceYear) {
		super(typeOfEngine, size, hasEngine);
		this.model = model;
		this.price = price;
		this.produceYear = produceYear;
	}
	private String model;
	private int price;
	private int produceYear;
	public String getModel(){
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public void setProduceYear(int produceYear) {
		this.produceYear = produceYear;
	}
}