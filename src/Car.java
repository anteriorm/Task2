import java.util.*;

public class Car implements Comparable<Car> {

    public String vin;

    public String model;

    public String manufacturer;

    public int year;

    public int mileage;

    public int price;

    public Car(String vin, String model,String manufacturer, int year, int mileage, int price){
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.manufacturer = manufacturer;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car other = (Car) obj;
        return vin.equals(other.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(vin);
    }


    public int compareTo(Car other) {
        return Integer.compare(other.year, this.year);
    }

    public String toString() {
        return model + " (" + year + "), " + mileage + " км, " + price + " руб." + vin + " ВИН " + manufacturer + " Производитель ";
    }

}
