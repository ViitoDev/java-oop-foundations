package Exercises.Class3.Exercise1;

public class Car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrices (double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public void showSpecs () {
        System.out.println("Car model : " + model);
        System.out.println("Price year 1 : " + priceYear1);
        System.out.println("Price year 2 : " + priceYear2);
        System.out.println("Price year 3 : " + priceYear3);
        System.out.println("Higher price : " + calculateHighPrice());
        System.out.println("Lowest price : " + calculateLowerPrice());
    }

    private double calculateLowerPrice () {
        double lowerPrice = priceYear1;

        if (priceYear2 < lowerPrice) {
            lowerPrice = priceYear2;
        }
        if (priceYear3 < lowerPrice) {
            lowerPrice = priceYear3;
        }

        return lowerPrice;
    }

    private double calculateHighPrice () {
        double highPrice = priceYear1;

        if (priceYear2 > highPrice) {
            highPrice = priceYear2;
        }
        if (priceYear3 > highPrice) {
            highPrice = priceYear3;
        }
        return highPrice;
    }
}
