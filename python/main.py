from car import Car
from account import Account
from UberBlack import UberBlack
if __name__ == "__main__":
    print("Hola mundo")

    car = Car("PBO101",Account("Cristian Sacta", "APA1919"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("PID232",Account("Jenny Portilla", "NDO202"))
    print(vars(car2))
    print(vars(car2.driver))

    carBlack = UberBlack("PSI1010","Cristian","RTX","Soft") 
    print(vars(carBlack))