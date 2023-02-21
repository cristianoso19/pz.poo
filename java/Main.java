class Main { //need class name same as file name
	public static void main (String[] args) {
		System.out.println("Hello World");
		Car car = new Car("PBO1001", new Account("Cristian Sacta", "AND123"));
		car.passenger = 4;
		car.printDataCar();
		Car car2 = new Car("PBO1002", new Account("Jenny Portilla", "PDK1003"));
		car2.passenger = 3;
		car2.printDataCar();
	}
}
