const Car = require('./Car');
const Account = require('./Account');

var car = new Car("PBO1010", new Account ("Cristian Sacta", "PGO1002"));
car.passenger = 4;
car.printDataCar();