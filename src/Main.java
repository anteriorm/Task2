import CarDealership.CarDealership;
import CarDealership.CarMain;
import CarDealership.CarType;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        CarDealership carDealership = new CarDealership();
//        carDealership.CarAdd(new CarMain("123", "Model S", "Tesla", 2022, 10000, 5000000, CarType.ELECTRIC));
//        carDealership.CarAdd(new CarMain("125", "Model S", "Tesla", 2024, 10000, 1000000, CarType.ELECTRIC));
//        carDealership.CarAdd(new CarMain("126", "Model S", "Tesla", 2023, 10000, 1000000, CarType.ELECTRIC));
//        carDealership.FindCar("Tesla");
//        System.out.println("Средняя цена ELECTRIC: " + carDealership.MidPrice(CarType.ELECTRIC));
//        System.out.println(carDealership.YearCar());
//
//        Map<CarType, Long> stats = carDealership.CountCar();
//        stats.forEach((type, count) -> System.out.println(type + ": " + count));
//
//        System.out.println(carDealership.OldCar());
//        System.out.println(carDealership.NewCar());

        CarDealership carDealership = new CarDealership();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Здравствуйте, как я вам могу помочь?");
        while (flag){
            System.out.println("Команды: add, find, mid, list, count, old, new, exit");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Введите VIN:");
                    String vin = scanner.nextLine();

                    System.out.println("Введите модель:");
                    String model = scanner.nextLine();

                    System.out.println("Введите производителя:");
                    String manufacturer = scanner.nextLine();

                    System.out.println("Введите год выпуска:");
                    int year = Integer.parseInt(scanner.nextLine());

                    System.out.println("Введите пробег:");
                    int mileage = Integer.parseInt(scanner.nextLine());

                    System.out.println("Введите цену:");
                    int price = Integer.parseInt(scanner.nextLine());

                    System.out.println("Введите тип (SEDAN, SUV, ELECTRIC и т.д.):");
                    String typeStr = scanner.nextLine().toUpperCase();

                    CarType type;
                    try {
                        type = CarType.valueOf(typeStr);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Неверный тип машины! Машина не добавлена.");
                        break;
                    }

                    boolean added = carDealership.CarAdd(new CarMain(vin, model, manufacturer, year, mileage, price, type));
                    if (added) {
                        System.out.println("Машина успешно добавлена!");
                    } else {
                        System.out.println("Машина с таким VIN уже есть!");
                    }
                    break;
                case ("find"):
                    System.out.println("Введите производителя");
                    String a = scanner.nextLine();
                    List<CarMain> found = carDealership.FindCar(a);
                    if (found.isEmpty()) {
                        System.out.println("Машины этого производителя не найдены.");
                    } else {
                        System.out.println("Найденные машины:");
                        found.forEach(System.out::println);
                    }
                    break;
                case "mid":
                    System.out.println("Введите тип:");
                    String typeC = scanner.nextLine().toUpperCase();

                    try {
                        type = CarType.valueOf(typeC);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Неверный тип машины!");
                        break;
                    }
                    double midPrice = carDealership.MidPrice(type);
                    System.out.println("Средняя цена " + type + ": " + midPrice);
                    break;
                case ("list"):
                    carDealership.YearCar().forEach(System.out::println);
                    break;
                case ("count"):
                    Map<CarType, Long> stats = carDealership.CountCar();
                    stats.forEach((typec, count) -> System.out.println(typec + ": " + count));
                    break;
                case ("old"):
                    carDealership.OldCar().forEach(System.out::println);
                    break;
                case ("new"):
                    carDealership.NewCar().forEach(System.out::println);
                    break;
                case ("exit"):
                    flag = false;
                    break;
        }

        }
    }
}