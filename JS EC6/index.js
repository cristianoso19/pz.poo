const Car = require('./Car');
const Account = require ('./Account');
const UberX = require ('./UberX');

var car = new Car("PBO1010", new Account ("Cristian Sacta", "PGO1002"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AWD439", new Account("Andrea Ferran", "ADP232"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.printDataCar();