import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnalysisCar {
    public AnalysisCar(List<Car> car){

        List<Car> top3 = car.stream()
                .filter(c -> c.mileage < 50_000)
                .sorted(Comparator.comparingInt((Car c) -> c.price).reversed())
                .limit(3)
                .toList();

        double avgMileage = car.stream()
                .mapToInt(c -> c.mileage)
                .average()
                .orElse(0);

        System.out.println("Средний пробег: " + avgMileage);

        Map<String, List<Car>> byManufacturer = car.stream()
                .collect(Collectors.groupingBy(c -> c.manufacturer));

        for (String manufacturer : byManufacturer.keySet()) {
            System.out.println(manufacturer + ": " + byManufacturer.get(manufacturer));
        }
    }
}
