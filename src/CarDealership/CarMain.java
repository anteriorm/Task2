package CarDealership;

public class CarMain {
    public String vin;

    public String model;

    public String manufacturer;

    public int year;

    public int mileage;

    public int price;

    public CarType type;

    public CarMain(String vin, String model,String manufacturer, int year, int mileage, int price, CarType type){
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    @Override
    public String toString() {
        return "VIN: " + vin + ", Модель: " + model + ", Производитель: " + manufacturer + ", Год: " + year + ", Пробег: " + mileage + ", Цена: " + price + ", Тип: " + type;
    }
}
