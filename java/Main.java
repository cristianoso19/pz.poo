class Main { //need class name same as file name
	public static void main (String[] args) {
		System.out.println("Hello World");
/* 		Car car = new Car("PBO1001", new Account("Cristian Sacta", "AND123","fds@dfs.com","fsd"));
		//car.passenger = 4;
		car.printDataCar();
		Car car2 = new Car("PBO1002", new Account("Jenny Portilla", "PDK1003","AND233","dfs@fdsa.com"));
		car2.printDataCar(); */

	/* 	UberX uberX = new UberX("AMQ123", new Account("Cristian Sacta", "AND123", "cr@fds.com", "holis"),"ACURA","RTX");
		uberX.setPassenger(4);
		uberX.printDataCar();
 */		
		UberVan uberVan = new UberVan("FGH324", new Account("Andres Herrera", "01029349209", "andher@gmail.com", "12324"));
		uberVan.setPassenger(4);
		uberVan.printDataCar();
	}
}
