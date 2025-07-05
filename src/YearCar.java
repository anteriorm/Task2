import java.util.Random;

public class YearCar {
    public YearCar(){
        int count = 0;

        int midYear = 0;

        Random rand = new Random();

        int[] years = new int[50];

        for (int i = 0; i < 50; i++){
            years[i] = rand.nextInt(2000, 2026);
            if (years[i] > 2015){
                count += 1;
                midYear += years[i];
                System.out.println(years[i]);
            }
        }
        System.out.println();
        System.out.println((midYear/count));

    }
}
