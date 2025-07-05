package CarDealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarDealership {
    ArrayList<CarMain> carMains;
    public CarDealership(){
        carMains = new ArrayList<>();
    }
    public boolean CarAdd(CarMain carMain){
        if (carMains.stream().anyMatch(c -> c.vin.equals(carMain.vin))){
            return false;
        }else {
            carMains.add(carMain);
            return true;
        }
    }

    public List<CarMain> FindCar(String manufacturer){
        return carMains.stream()
                .filter(c -> c.manufacturer.equalsIgnoreCase(manufacturer))
                .toList();
    }

    public double MidPrice(CarType typeCar){
        return carMains.stream()
                .filter(c -> c.type == typeCar)
                .mapToInt(c -> c.price)
                .average()
                .orElse(0);
    }

    public List<CarMain> YearCar(){
        return carMains.stream()
                .sorted(Comparator.comparing((CarMain c) -> c.year).reversed())
                .toList();
    }

    public Map<CarType, Long> CountCar(){
        return carMains.stream()
                .collect(Collectors.groupingBy(c -> c.type, Collectors.counting()));
    }

    public List<CarMain> NewCar() {
        return carMains.stream()
                .sorted(Comparator.comparing((CarMain c) -> c.year).reversed())
                .limit(1)
                .toList();
    }
    public List<CarMain> OldCar() {
        return carMains.stream()
                .sorted(Comparator.comparing((CarMain c) -> c.year))
                .limit(1)
                .toList();
    }
}
