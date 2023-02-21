class Main { //need class name same as file name
	public static void main (String[] args) {
		System.out.println("Hello World");
		Car car = new Car();
		car.license = "PBO1001";
		car.driver = "Cristian Sacta";
		car.passenger = 4;
		car.printDataCar();
		Car car2 = new Car();
		car2.license = "PDK1002";
		car2.driver = "Jenny Portilla";
		car2.passenger = 3;
		car2.printDataCar();
	}
}
