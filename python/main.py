from car import Car
if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "PBO101"
    car.driver = "Cristian Sacta"
    print(vars(car))

    car2 = Car()
    car2.license = "PBO102"
    car2.driver = "Jenny Portilla"
    print(vars(car2))