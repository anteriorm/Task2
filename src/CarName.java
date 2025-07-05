import java.util.*;

public class CarName {
    public CarName(){

        ArrayList<String> nameCar = new ArrayList<>(Arrays.asList("Toyota Camry",
                "BMW X5",
                "Mitsubishi Delica",
                "Bugatti Veyron Divo",
                "BMW i8",
                "Porsche 964 Carrera RS",
                "Honda Accord",
                "Ford Focus",
                "Chevrolet Malibu",
                "Nissan Altima",
                "Volkswagen Passat",
                "Hyundai Sonata",
                "Kia Optima",
                "Mazda 6",
                "Subaru Legacy",
                "Mercedes-Benz C-Class",
                "Audi A4",
                "Lexus ES",
                "Infiniti Q50",
                "Acura TLX",
                "Tesla Model 3",
                "Volvo S60",
                "Jaguar XE",
                "Alfa Romeo Giulia",
                "Skoda Octavia",
                "Tesla Cybertruck Foundation Series",
                "Toyota Camry",
                "BMW X5",
                "Mitsubishi Delica",
                "Bugatti Veyron Divo",
                "BMW i8",
                "Porsche 964 Carrera RS",
                "Honda Accord",
                "Ford Focus",
                "Chevrolet Malibu",
                "Nissan Altima",
                "Volkswagen Passat",
                "Hyundai Sonata",
                "Kia Optima",
                "Mazda 6",
                "Subaru Legacy",
                "Mercedes-Benz C-Class",
                "Audi A4",
                "Lexus ES",
                "Infiniti Q50",
                "Acura TLX",
                "Tesla Model 3",
                "Volvo S60",
                "Alfa Romeo Giulia",
                "Skoda Octavia"));

        HashSet<String> set = new HashSet<>(nameCar);

        nameCar.clear();

        nameCar.addAll(set);

        nameCar.sort(Collections.reverseOrder());

        for (int i = 0; i < nameCar.size(); i++) {
            if (nameCar.get(i).contains("Tesla")) {
                nameCar.set(i, "ELECTRO_CAR");
            }
        }

        System.out.println(nameCar);

    }
}
